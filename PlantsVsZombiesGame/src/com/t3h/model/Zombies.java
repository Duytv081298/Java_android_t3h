package com.t3h.model;


import com.t3h.gui.ZombieFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Zombies extends PlantsVsZombies{

    public Zombies(int x, int y) {
        super(x, y, LIVE);
        images = new Image[2];
        images[LIVE] = ImageLoader.getImage("zombie_normal.gif", getClass());
        images[DIE] = ImageLoader.getImage("zombie_normal_dying.gif", getClass());
    }

    public void move(){
        x -= LawnMower.speed;
    }

    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,images[status].getHeight(null), images[status].getHeight(null));
        return rect;
    }

    public boolean checkDie(ArrayList<Bullet> arr){
        for (int i = 0; i < arr.size() ; i++) {
            Rectangle rect = getRect().intersection(arr.get(i).getRect());
            //intersection là kiểm tra giao nhau giữa 2 hcn, giá trị trả về là 1 rectangle
            if(rect.isEmpty() == false){
                arr.remove(i);
                return true;
            }
        }
        return false;
    }

}
