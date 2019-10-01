package com.t3h.gui;

import com.t3h.model.GameManage;
import com.t3h.model.Plants;
import com.t3h.model.Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class ZombiePanel extends JPanel implements Runnable, MouseListener, MouseMotionListener {
    private GameManage gameManage = new GameManage();
    private ArrayList array;

    public ZombiePanel() {
        setBackground(Color.BLACK);
        gameManage.initGame();
        Thread t = new Thread(this);//this chính là runable(dùng định nghĩa công việc cho thread xử lý)
        t.start();
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        gameManage.draw(g2d);

    }

    @Override
    public void run() {
        while (true) {
            gameManage.AIZombies();
            gameManage.AIFlowers();
            gameManage.moveBullet();
            gameManage.AIBullet();
            boolean isDie = gameManage.gameOver();
            if (isDie) {
                int result = JOptionPane.showConfirmDialog(null,
                        "Do you replay?", "Game Over",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    gameManage.initGame();
                } else {
                    System.exit(0);
                }
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < gameManage.arrSunFlowers.size(); i++) {
            Rectangle rect = gameManage.arrSunFlowers.get(i).getRect().intersection(getRect(e));
            if (!rect.isEmpty()) {
                Score.score += 50;
                gameManage.arrSunFlowers.remove(i);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Create(array, e);

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        array = checkClickPlant(e);

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public Rectangle getRect(MouseEvent e) {
        Rectangle rect = new Rectangle(e.getX() - 7, e.getY() - 7, 15, 15);
        return rect;
    }
    public void Create (ArrayList arr, MouseEvent e){
        arr.remove(arr.size()-1);
        Plants plant = new Plants(e.getX(),e.getY(),1);
        gameManage.arrPlants.add(plant);



    }
    public ArrayList checkClickPlant(MouseEvent e){
        Plants plant = new Plants(-100,-100,1);
        gameManage.arrPlants.add(plant);
        Rectangle rect = gameManage.arrPlants.get(0).getRectPlant0().intersection(getRect(e));
        if (!rect.isEmpty()) {
            gameManage.arrPlants.get(gameManage.arrPlants.size()-1).setX(e.getX());
            gameManage.arrPlants.get(gameManage.arrPlants.size()-1).setY(e.getY());
        }
        return gameManage.arrPlants;
    }
}
