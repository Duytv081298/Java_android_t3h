package com.project.gui;

import com.project.model.GameManager;

import javax.swing.*;
import java.awt.*;

public class SnakePanel extends JPanel implements Runnable{
    private GameManager manager = new GameManager();
    public SnakePanel() {
        setBackground(Color.BLACK);
        setLayout(null);
        manager.initGame();
        Thread t = new Thread(this);
        t.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        manager.draw(g2d);
    }

    @Override
    public void run() {
        while (true) {

            manager.AI();
            repaint();
            try {
                Thread.sleep(20); // yêu cầu Thread nghỉ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
