package com.t3h.model;

import java.awt.*;

public class PlantsVsZombies {
    public static final int LIVE = 0;
    public static final int DIE = 1;

    protected int x;
    protected int y;
    protected Image[] images;
    protected int status;


    public PlantsVsZombies(int x, int y, int status) {
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(images[status],x,y,null);
    }
}
