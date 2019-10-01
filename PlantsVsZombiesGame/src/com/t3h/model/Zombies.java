package com.t3h.model;


import java.awt.*;
import java.util.ArrayList;

public class Zombies extends PlantsVsZombies {

    public Zombies(int x, int y) {
        super(x, y, LIVE);
        images = new Image[3];
        images[ACTIVE] = ImageLoader.getImage("zombie_normal.gif", getClass());
        images[LIVE] = ImageLoader.getImage("zombie_normal.gif", getClass());
        images[DIE] = ImageLoader.getImage("zombie_normal_dying.gif", getClass());
    }

    public void move() {
        x -= LawnMower.speed;
    }

    public Rectangle getRect() {
        Rectangle rect = new Rectangle(x, y, images[status].getHeight(null), images[status].getHeight(null));
        return rect;
    }

    public boolean checkDie(ArrayList<Bullet> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Rectangle rect = getRect().intersection(arr.get(i).getRect());
            if (rect.isEmpty() == false) {
                HP -= 1;
                arr.remove(i);
                if (HP == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
