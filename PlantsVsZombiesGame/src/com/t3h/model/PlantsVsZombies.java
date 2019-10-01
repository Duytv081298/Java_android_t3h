package com.t3h.model;

import java.awt.*;

public class PlantsVsZombies {

    public static int ACTIVE = 0;
    public static int LIVE = 1;
    public static int DIE = 2;
    public static int HP = 3;

    protected int x;
    protected int y;
    protected Image[] images;
    protected int status;

    public static void setACTIVE(int ACTIVE) {
        PlantsVsZombies.ACTIVE = ACTIVE;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PlantsVsZombies(int x, int y, int status) {
        this.x = x;
        this.y = y;
        this.status = status;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(images[status],x,y,null);
    }
}
