package com.t3h.model;

import com.t3h.gui.TankFrame;
import com.t3h.until.ImageLoader;

import java.awt.*;

public class Bullet {
    private int x,y,orient;
    private Image image = ImageLoader.getImage("bullet.png", getClass());

    public Bullet(int x, int y, int orient) {
        this.x = x - image.getWidth(null)/2;
        this.y = y - image.getHeight(null)/2;
        this.orient = orient;
    }
    public void draw(Graphics2D graphics2D){
        graphics2D.drawImage(image,x,y,null);
    }
    boolean move(){
        switch (orient){
            case Tank.LEET:
                x-=2;
                break;
            case Tank.RIGHT:
                x+=2;
                break;
            case Tank.UP:
                y-=2;
                break;
            case Tank.DOWN:
                y +=2;
                break;
        }
        if(x<=0 || x>= TankFrame.W_FRAME - image.getHeight(null)-18){
            return false;
        }if(y<=0 || y>= TankFrame.H_FRAME - image.getHeight(null)-40){
            return false;
        }else {
            return true;
        }
    }
    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y, image.getWidth(null),
                image.getHeight(null));
        return rect;
    }

}
