package com.btvn_buoi11.bai2.t3h.gui;

import com.t3h.model.GameManager;
import com.t3h.model.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankPanel extends JPanel implements KeyListener {
    private GameManager manager = new GameManager();
    public TankPanel() {
        setBackground(Color.BLACK);
        manager.initGame();
        setFocusable(true); // kéo sự Focusable của người dùng vào frame đang được sử dụng
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        super.paintComponent(graphics2D);
        manager.draw(graphics2D);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) { // keyTyped

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) { // keyPressed: ấn phím
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_LEFT:
                manager.playerMove(Tank.LEET);
                break;
            case KeyEvent.VK_RIGHT:
                manager.playerMove(Tank.RIGHT);
                break;
            case KeyEvent.VK_UP:
                manager.playerMove(Tank.UP);
                break;
            case KeyEvent.VK_DOWN:
                manager.playerMove(Tank.DOWN);
                break;
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) { // keyReleased: Nhả phím

    }
}
