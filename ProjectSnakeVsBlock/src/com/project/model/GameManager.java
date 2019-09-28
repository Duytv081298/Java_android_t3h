package com.project.model;

import com.project.gui.SnakeFrame;
import com.project.gui.SnakePanel;
import until.SoundLoader;

import javax.sound.sampled.Clip;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GameManager {
    private Random rd = new Random();
    public static boolean CHECKDIE = false;
    public static Clip clip =  SoundLoader.play("Sign.wav");;
    public static int CHECKMOVE = 1;
    public static Snake snake;
    public static ArrayList<Block> blocks;
    private int point;
    private long t;
    public  ArrayList<Gift> gifts;


    public static ArrayList<Fence> fences;

    public void initGame() {
        CHECKDIE = false;
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        gifts = new ArrayList<>();
        blocks = new ArrayList<>();
        fences = new ArrayList<>();
        generate();

    }

    public void snakeMove(int newOrient) {
        snake.chaneOrient(newOrient);
        snake.move();
    }

    public void generate() {

        for (int j = 0; j < 4; j++) {
            point = 1 + rd.nextInt(50);
            Block block = new Block(Block.W_BLOCK * j, -Block.H_BLOCK, point);
            blocks.add(block);
        }
        snake = new Snake(SnakeFrame.W_FRAME / 2, SnakeFrame.H_FRAME / 2);
        for (int i = 0; i < 3; i++) {
            int x = 50 + rd.nextInt(SnakeFrame.W_FRAME - 80);
            int y = 50 + rd.nextInt(SnakeFrame.H_FRAME / 3);
            point = 1 + rd.nextInt(11);
            Gift gift = new Gift(x, y, point);
            gifts.add(gift);
        }
        Fence fence = new Fence(Block.W_BLOCK, 0, 100);
        fences.add(fence);

    }

    public void draw(Graphics2D g2d) {

        for (Block b : blocks
        ) {
            b.draw(g2d);
        }
        for (Gift g : gifts
        ) {
            g.draw(g2d);
        }
        for (Fence f : fences
        ) {
            f.draw(g2d);

        }
        snake.draw(g2d);
    }

    private void truPoint(int i) {
        Long T = System.currentTimeMillis();
        if (T - t > 100) {
            int newPointBlock = blocks.get(i).getPoint() - 1;
            SnakePanel.TOTAL_SCORE += 1;
            int x = blocks.get(i).getX();
            int y = blocks.get(i).getY();
            int newPointSnake = snake.getPoint() - 1;
            blocks.set(i, new Block(x, y, newPointBlock));
            snake.setPoint(newPointSnake);
            t = T;
            if (newPointBlock == 0) {
                blocks.remove(i);
            } else if (newPointSnake == 0) {
                CHECKDIE = true;
            } else if (newPointBlock == 0 && newPointSnake == 0) {
                CHECKDIE = true;
            }
        }
    }

    private boolean checkSnakeToBlock() {
        for (int i = blocks.size() - 1; i >= 0; i--) {
            Rectangle rectUp = blocks.get(i).getRectDown()
                    .intersection(snake.getRectUp());
            if (rectUp.isEmpty() == false) {
                CHECKMOVE = 0;
                truPoint(i);
                return true;
            } else {
                CHECKMOVE = 1;
            }
        }
        return false;
    }

    public static boolean SnakeMoveRight() {
        for (int i = blocks.size() - 1; i >= 0; i--) {
            Rectangle rectRight = blocks.get(i).getRectLeft()
                    .intersection(GameManager.snake.getRectRight());
            if (rectRight.isEmpty() == false) {
                return true;
            }
        }
        for (int i = fences.size() - 1; i >= 0; i--) {
            Rectangle rectRight = fences.get(i).getRect()
                    .intersection(snake.getRectRight());
            if (rectRight.isEmpty() == false) {
                return true;
            }
        }
        return false;
    }

    public static boolean SnakeMoveLeft() {
        for (int i = blocks.size() - 1; i >= 0; i--) {
            Rectangle rectLeft = blocks.get(i).getRectRight()
                    .intersection(snake.getRectLeft());
            if (rectLeft.isEmpty() == false) {
                return true;
            }
        }
        for (int i = fences.size() - 1; i >= 0; i--) {
            Rectangle rectLeft = fences.get(i).getRect()
                    .intersection(snake.getRectLeft());
            if (rectLeft.isEmpty() == false) {
                return true;
            }
        }
        return false;
    }


    private boolean checkMoveSnake() {
        for (int i = fences.size() - 1; i >= 0; i--) {
            Rectangle rectUp = fences.get(i).getRect()
                    .intersection(snake.getRectUp());
            if (rectUp.isEmpty() == false) {
                CHECKMOVE = 0;
                return true;
            } else {
                CHECKMOVE = 1;
            }
        }
        return false;
    }

    public int checkSnakeToGift() {
        int tong = 0;
        for (int i = gifts.size() - 1; i >= 0; i--) {
            Rectangle rect = gifts.get(i).getRect()
                    .intersection(snake.getRect());
            if (rect.isEmpty() == false) {
                tong = gifts.get(i).getPoint();
                snake.setPoint(snake.getPoint() + tong);
                gifts.remove(i);
            }
        }
        return tong;
    }

    public void AI() {
        blocks.get(blocks.size() - 1).generate(blocks);
        gifts.get(gifts.size() - 1).generate(gifts);

        fences.get(fences.size() - 1).generate(fences);
        checkSnakeToGift();
        for (int i = gifts.size() - 1; i >= 0; i--) {
            boolean moveGift = gifts.get(i).move();
            if (moveGift == false) {
                gifts.remove(i);
            }
        }
        for (int i = blocks.size() - 1; i >= 0; i--) {
            if (checkSnakeToBlock() == false && checkMoveSnake() == false) {
                boolean moveBlock = blocks.get(i).move();
                if (moveBlock == false) {
                    blocks.remove(i);
                }
            }
        }
        for (int i = fences.size() - 1; i >= 0; i--) {
            if (checkMoveSnake() == false && checkSnakeToBlock() == false) {
                boolean moveFence = fences.get(i).move();
                if (moveFence == false) {
                    fences.remove(i);
                }
            }
        }
    }
}
