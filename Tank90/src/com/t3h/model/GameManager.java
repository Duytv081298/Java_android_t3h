package com.t3h.model;

import com.t3h.gui.TankFrame;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class GameManager {
    private Player player;
    private Boss boss;
    private ArrayList<Boss> arrBoss;
    private ArrayList<Bullet> arrBulletPlayer;
    private ArrayList<Bullet> arrBulletBoss;
    private ArrayList<Map> arrMap;

    public void initGame() {
//        player = new Player(200,200,3);
        arrMap = MapManager.readMap("map1.txt");
        arrBulletBoss = new ArrayList<>();
        arrBulletPlayer = new ArrayList<>();
        player = new Player(175, 460, 3);
        arrBoss = new ArrayList<>();
        generateBoss();

    }

    public void draw(Graphics2D g2d) {
        drawBullet(g2d, arrBulletBoss);
        drawBullet(g2d, arrBulletPlayer);
        player.draw(g2d);
        for (Boss boss : arrBoss
        ) {
            boss.draw(g2d);
        }
        for (Map m : arrMap) {
            m.draw(g2d);

        }

    }

    private void drawBullet(Graphics2D g2d, ArrayList<Bullet> arr) {
        for (Bullet b : arr) {
            b.draw(g2d);
        }
    }

    public void playerMove(int newOrient) {
        player.chaneOrient(newOrient);
        player.move(arrMap);
    }

    public void playerFrire() {
        player.fire(arrBulletPlayer);
//        boss.fire(arrBulletBoss);

    }

    private void generateBoss() {
        Boss boss = new Boss(0, 0);
        arrBoss.add(boss);
        Boss boss1 = new Boss(TankFrame.W_FRAME / 2 - 16, 0);
        arrBoss.add(boss1);
        Boss boss2 = new Boss(TankFrame.W_FRAME - 80, 0);
        arrBoss.add(boss2);
    }

    private boolean checkBulletToMap(ArrayList<Bullet> arr) {
        for (int i = arrMap.size() - 1; i >= 0; i--) {
            int bit = arrMap.get(i).getBit();
            if (bit == 3 || bit == 4) {
                continue;
            }
            for (int j = 0; j < arr.size(); j++) {
                Rectangle rect = arrMap.get(i).getRect()
                        .intersection(arr.get(j).getRect());
                if (rect.isEmpty() == false) {
                    switch (bit) {
                        case 1:
                            arrMap.remove(i);
                            arr.remove(j);
                            break;
                        case 2:
                        case 5:
                            arr.remove(j);
                            break;
                        case 6 :
                        case 7 :
                        case 8 :
                        case 9 :
                            arr.remove(j);
                            return true;
                    }
                    break;
                }
            }
        }
        return false;
    }

    public boolean AI() {
        for (int i = arrBoss.size() - 1; i >= 0; i--) {
            arrBoss.get(i).generateOrient();
            arrBoss.get(i).move(arrMap);
            arrBoss.get(i).fire(arrBulletBoss);
            boolean die = arrBoss.get(i).checkDie(arrBulletPlayer);
            if (die) {
                arrBoss.remove(i);
                if (arrBoss.size() <= 2) {
                    generateBoss();
                }
            }
        }
        moveBullet(arrBulletBoss);
        moveBullet(arrBulletPlayer);
        return player.checkDie(arrBulletBoss)
                || checkBulletToMap(arrBulletBoss)
                || checkBulletToMap(arrBulletPlayer);
    }

    private void moveBullet(ArrayList<Bullet> arr) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            boolean move = arr.get(i).move();
            if (move == false) {
                arr.remove(i);

            }
        }
    }


}
