package com.t3h.model;

import com.t3h.gui.ZombieFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SunFlower extends JPanel implements MouseListener {
    private int x;
    private int y;
    private int speed = 1;

    Image image;

    public SunFlower(int x, int y) {
        this.x = x;
        this.y = y;
        image = ImageLoader.getImage("sun.gif", getClass());
        addMouseListener(this);
    }

    public void move(){
        y += speed;
        if(y<= ZombieFrame.H_FRAME-100){
            return;
        }
        y = ZombieFrame.H_FRAME -100;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(image,x,y,null);
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        super.paintComponent(g2d);
        g2d.drawImage(image,x,y,null);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Score.score+= 50;
        System.out.println(Score.score);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
