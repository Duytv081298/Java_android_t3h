package com.t3h.model;

import java.awt.*;
import java.util.ArrayList;

public class Plants extends PlantsVsZombies {
    public Plants(int x, int y, int status) {
        super(x, y, status);
        images = new Image[3];
        images[ACTIVE] = ImageLoader.getImage("active_peashooter.png", getClass());
        images[LIVE] = ImageLoader.getImage("pea_shooter.gif", getClass());
        images[DIE] = ImageLoader.getImage("pea_shooter_dying.gif", getClass());
    }

    private long t;

    public void fire(ArrayList<Bullet> arr){
        long T = System.currentTimeMillis();
        if(T-t < 5000 ) {
            return;
        }
        t = T;
        // t : thời gian cuối cùng, T: thời gian hiện tại
        int xB = x + images[status].getWidth(null)/2;
        int yB = y + images[status].getWidth(null)/2;
        Bullet b = new Bullet(xB, yB);
        arr.add(b);
    }

    public Rectangle getRectPlant0() {
        Rectangle rect = new Rectangle(x, y, images[0].getHeight(null), images[0].getHeight(null));
        return rect;
    }

}
