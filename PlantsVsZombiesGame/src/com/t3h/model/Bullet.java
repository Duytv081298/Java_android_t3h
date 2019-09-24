package com.t3h.model;

import com.t3h.gui.ZombieFrame;

import java.awt.*;
import java.util.ArrayList;

public class Bullet {
    private int x;
    private int y;
    private Image image = ImageLoader.getImage("Pea.png",getClass());

    public Bullet(int x, int y) {
        this.x = x + 15;
        this.y = y - image.getHeight(null)/2-10;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(image,x,y,null);
    }
    public boolean move(){
        x += 2;
        if(x>= ZombieFrame.W_FRAME){
            return false;
        }
        return true;
    }

    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,image.getWidth(null), image.getHeight(null));
        return rect;
    }

}
