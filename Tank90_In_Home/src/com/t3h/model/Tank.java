package com.t3h.model;

import com.t3h.gui.TankFrame;
import com.t3h.gui.TankPanel;

import java.awt.*;

public abstract class Tank {
    public static final int LEET = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    protected   int x, y, orient;
    protected Image[] images;
    protected  int speed = 5;


    public Tank(int x, int y, int orient) {
        this.x = x;
        this.y = y;
        this.orient = orient;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(images[orient], x, y,null);
    }
    public void move(){
        int xR = x;
        int yR = y;
        switch (orient){
            case LEET:
                x -= speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
        }
        if(x<=0 || x>= TankFrame.W_FRAME - images[orient].getHeight(null)-5){
            x= xR;
        }if(y<=0 || y>= TankFrame.H_FRAME - images[orient].getHeight(null)-30){
            y= yR;
        }


    }
}
