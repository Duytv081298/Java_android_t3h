package com.t3h.model;

import java.awt.*;

public class LawnMower {
    public int x;
    public int y;
    public static int speed = 1;
    Image image;

    public LawnMower(int x, int y) {
        this.x = x;
        this.y = y;
        image = ImageLoader.getImage("lawn_mower.gif",getClass());
    }

    public void moveLawn(){
        x += speed;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(image, x,y,null);
    }
}
