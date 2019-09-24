package com.project.model;

import com.project.gui.SnakeFrame;
import com.project.gui.SnakePanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {
    private Random rd = new Random();
    public static int CHECKMOVE = 1;
    public static int congDiemGift = 0;
    private int point;
    private long t;
    public static boolean CheckRight = true;
    public static boolean CheckLeft = true;
    public static boolean checkDie = false;
    public static ArrayList<Block> blocks;
    public static ArrayList<Gift> gifts;
    public static ArrayList<Snake> snakes;
    public static ArrayList<Fence> fences;

    public void initGame() {
        gifts = new ArrayList<>();
        blocks = new ArrayList<>();
        snakes = new ArrayList<>();
        fences = new ArrayList<>();
        generate();
    }
    public void snakeMove(int newOrient) {
        for (int j = 0; j < snakes.size() - 1; j++) {
            if (j == 0) {
                snakes.get(j).chaneOrient(newOrient);
                snakes.get(j).move();
            }
            int xj1 = snakes.get(j).getX();
            snakes.get(j + 1).setX(xj1);
        }
    }


    public void generate() {
//        ArrayList<Integer> intXs = new ArrayList<>();
//        for (int j = 0; j <= 4; j++) {
//            point = 1 + rd.nextInt(50);
//            int intX = rd.nextInt(5);
//            boolean checkPoint = Block.checkPoint(intXs, intX);
//            if (checkPoint == true) {
//                j--;
//            } else {
//                intXs.add(intX);
//                Block block = new Block(Block.W_BLOCK * intX, -Block.H_BLOCK, point);
//                blocks.add(block);
//            }
//        }

        for (int j = 0; j < 4; j++) {
            point = 1 + rd.nextInt(50);
            Block block = new Block(Block.W_BLOCK * j, -Block.H_BLOCK, point);
            blocks.add(block);
        }

        for (int j = 0; j < 7; j++) {
            Snake snake = new Snake(SnakeFrame.W_FRAME / 2, SnakeFrame.H_FRAME / 2 + Snake.W_SNAKE * j);
            snakes.add(snake);
        }
        for (int i = 0; i <= 4; i++) {
            point = 5 + rd.nextInt(15);
            int xg = 10 + rd.nextInt(SnakeFrame.W_FRAME + 10);
            int yg = 10 + rd.nextInt(SnakeFrame.H_FRAME / 3);
        }
        for (int i = 0; i < 3 ; i++) {
            int x = 50 + rd.nextInt(SnakeFrame.W_FRAME - 80);
            int y = 50 + rd.nextInt(SnakeFrame.H_FRAME/3);
            point = 1 + rd.nextInt(11);
            Gift gift = new Gift(x, y, point);
            gifts.add(gift);
        }
        Fence fence = new Fence(Block.W_BLOCK, 0 , 100);
        fences.add(fence);


    }


    public void draw(Graphics2D g2d) {
        for (int i = 0; i < snakes.size() - 1; i++) {
            if (i == 0) {
                snakes.get(i).drawChinh(g2d);
            } else {
                snakes.get(i).drawPhu(g2d);
            }
        }
        for (Block b : blocks
        ) {
            b.draw(g2d);
        }
        for (Gift g : gifts
        ) {
            g.draw(g2d);
        }
        for (Fence f: fences
             ) { f.draw(g2d);

        }
    }

    private void truPoint(int i) {
        Long T = System.currentTimeMillis();
        if (T - t >100) {
            int newPointBlock = blocks.get(i).getPoint() - 1;
            SnakePanel.TOTAL_SCORE +=1;
            int x = blocks.get(i).getX();
            int y = blocks.get(i).getY();
            int newPointSnake = snakes.get(0).getPoint() - 1;
            snakes.remove(snakes.size()-1);
            blocks.set(i, new Block(x, y, newPointBlock));
            snakes.get(0).setPoint(newPointSnake);
            t = T;
            if (newPointBlock == 0 ){
                blocks.remove(i);
            }else if(newPointSnake == 0){
                checkDie = true;
            }else if(newPointBlock == 0 && newPointSnake == 0){
                checkDie = true;
            }
        }
    }

    private boolean checkSnakeToBlock() {
        for (int i = blocks.size() - 1; i >= 0; i--) {
            Rectangle rectUp = blocks.get(i).getRectDown()
                    .intersection(snakes.get(0).getRectUp());
            Rectangle rectRight = blocks.get(i).getRectLeft()
                    .intersection(snakes.get(0).getRectRight());
            Rectangle rectLeft = blocks.get(i).getRectRight()
                    .intersection(snakes.get(0).getRectLeft());
            if (rectRight.isEmpty() == false){
                CheckRight = false;
            }
            if(rectLeft.isEmpty() == false){
                CheckLeft = false;
            }
            if (rectUp.isEmpty() == false) {
                CHECKMOVE = -1;
                CheckLeft = true;
                CheckRight = true;
                truPoint(i);
                return true;
            }
            else {
                CHECKMOVE = 1;
            }

        }
        return false;
    }
    private boolean checkMoveSnake() {
        for (int i = fences.size() - 1; i >= 0; i--) {
            Rectangle rectRight = fences.get(i).getRect()
                    .intersection(snakes.get(0).getRectRight());
            Rectangle rectLeft = fences.get(i).getRect()
                    .intersection(snakes.get(0).getRectLeft());
            Rectangle rectUp = fences.get(i).getRect()
                    .intersection(snakes.get(0).getRectUp());
            if (rectRight.isEmpty() == false){
                CheckRight = false;
            }
            if(rectLeft.isEmpty() == false){
                CheckLeft = false;
            }
            if (rectUp.isEmpty() == false) {
                CHECKMOVE = -1;
                CheckLeft = true;
                CheckRight = true;
                return true;
            }
            else {
                CHECKMOVE = 1;
            }
        }
        return false;
    }
    public static int checkSnakeToGift() {
        int tong = 0;
        for (int i = gifts.size() - 1; i >= 0; i--) {
            Rectangle rect = gifts.get(i).getRect()
                    .intersection(snakes.get(0).getRect());
            if (rect.isEmpty() == false) {
                tong = gifts.get(i).getPoint();
                snakes.get(0).setPoint(snakes.get(0).getPoint() + tong);
                gifts.remove(i);
            }
        }
        return tong;
    }
    public void AI() {
        blocks.get(blocks.size() - 1).generate(blocks);
        gifts.get(gifts.size() - 1).generate(gifts);
        snakes.get(snakes.size() - 1).generate(snakes);
        fences.get(fences.size() - 1).generate(fences);

        for (int i = gifts.size() -1; i >= 0 ; i--) {
            boolean moveGift = gifts.get(i).move();
            if (moveGift == false) {
                gifts.remove(i);
            }
        }
        for (int i = blocks.size() - 1; i >= 0; i--) {
            if(checkSnakeToBlock() == false && checkMoveSnake() == false){
                boolean moveBlock = blocks.get(i).move();
                if (moveBlock == false) {
                    blocks.remove(i);
                }
            }
        }

        if(checkDie == true){
            System.exit(0);
        }
        for (int i = fences.size() - 1; i >= 0; i--) {
            if(checkMoveSnake() == false && checkSnakeToBlock() == false){
                boolean moveFence = fences.get(i).move();
                if (moveFence == false) {
                    fences.remove(i);
                }
            }

        }






    }
}
