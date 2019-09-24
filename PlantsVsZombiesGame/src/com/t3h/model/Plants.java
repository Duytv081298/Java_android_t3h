package com.t3h.model;

import java.awt.*;
import java.util.ArrayList;

public class Plants extends PlantsVsZombies {
    public Plants(int x, int y, int status) {
        super(x, y, LIVE);
        images = new Image[2];
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
        int xB = x + images[LIVE].getWidth(null)/2;
        int yB = y + images[LIVE].getWidth(null)/2;
        Bullet b = new Bullet(xB, yB);
        arr.add(b);
    }

}
