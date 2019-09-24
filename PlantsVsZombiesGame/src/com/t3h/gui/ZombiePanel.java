package com.t3h.gui;

import com.t3h.model.GameManage;
import com.t3h.model.SunFlower;
import com.t3h.model.Zombies;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ZombiePanel extends JPanel implements Runnable{
    private GameManage gameManage = new GameManage();
    public ZombiePanel() {
        setBackground(Color.BLACK);
        gameManage.initGame();
        Thread t = new Thread(this);//this chính là runable(dùng định nghĩa công việc cho thread xử lý)
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
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
            if(isDie){
                int result = JOptionPane.showConfirmDialog(null,
                        "Do you replay?","Game Over",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
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
}
