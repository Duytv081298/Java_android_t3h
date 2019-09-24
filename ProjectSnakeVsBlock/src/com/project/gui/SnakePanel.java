package com.project.gui;

import com.project.model.GameManager;
import com.project.model.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakePanel extends JPanel implements Runnable, KeyListener {
    public static int TOTAL_SCORE = 0;
    private long t = 0;
    private int sleep ;
    private GameManager manager = new GameManager();
    private boolean[] flags = new boolean[256];

    public SnakePanel() {
        setBackground(Color.BLACK);
        setLayout(null);
        manager.initGame();
        setFocusable(true);
        addKeyListener(this);

        Thread t = new Thread(this);
        t.start();

    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        super.paintComponent(g);
        manager.draw(g2d);
        draw(g2d);

    }
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 30));
        g2d.drawString(TOTAL_SCORE + "", SnakeFrame.W_FRAME - 100, 50 );
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        flags[keyEvent.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        flags[keyEvent.getKeyCode()] = false;
    }
    private void setSleep(){

        if(TOTAL_SCORE < 50){
            sleep = 9;
        }else if(TOTAL_SCORE < 150){
            sleep = 8;
        }else if(TOTAL_SCORE < 250){
            sleep = 7;
        }else if(TOTAL_SCORE < 500){
            sleep = 6;
            Snake.speed = 2;
        }else if(TOTAL_SCORE < 750){
            sleep = 5;
        }else if(TOTAL_SCORE < 850){
            sleep = 4;
            Snake.speed = 1;
        }else {
            sleep = 3;
        }

//        Long T = System.currentTimeMillis();
//        if (T - t <5000) {
//            return;
//        }
//        sleep -=1;
//        Snake.speed = 3;
//        t=T;
//        if (sleep <= 5){
//            Snake.speed = 2;
//        }
//        if(sleep <= 0 ){
//            Snake.speed = 1;
//            sleep = 10;
//        }
    }

    @Override
    public void run() {
        while (true) {
            if(flags[KeyEvent.VK_LEFT] && GameManager.CheckLeft == true){
                manager.snakeMove((Snake.LEET));
            }else if(flags[KeyEvent.VK_RIGHT] && GameManager.CheckRight == true){
                    manager.snakeMove((Snake.RIGHT));
            }
            manager.AI();

            repaint();
            if (GameManager.checkDie == true){
                int result = JOptionPane.showConfirmDialog(null, "DO you wan to replay", "Game over",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION ){
                    flags = new boolean[256];
                    manager.initGame();

                }else {
                    System.exit(0);
                }
            }
            setSleep();
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }



}
