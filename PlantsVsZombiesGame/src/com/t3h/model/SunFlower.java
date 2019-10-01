package com.t3h.model;

import com.t3h.gui.ZombieFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SunFlower {
    private int x;
    private int y;
    private int speed = 1;

    Image image;

    public SunFlower(int x, int y) {
        this.x = x;
        this.y = y;
        image = ImageLoader.getImage("sun.gif", getClass());
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
    public Rectangle getRect() {
        Rectangle rect = new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
        return rect;
    }

}
