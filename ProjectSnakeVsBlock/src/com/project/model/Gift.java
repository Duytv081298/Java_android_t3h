package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Gift {
    protected int x, y, point;
    public static final int W_Gift = 30;


    private Random rd = new Random();

    public int getY() {
        return y;
    }

    public int getPoint() {
        return point;
    }

    public Gift(int x, int y, int point) {
        this.x = x;
        this.y = y;
        this.point = point;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, W_Gift, W_Gift);

        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 15));
        g2d.drawString(point + "", x + W_Gift / 2 - 1, y + W_Gift / 3);
    }

    public boolean move() {
        if (GameManager.CHECKMOVE >= 0){
            y += 2;
            if (y >= SnakeFrame.H_FRAME + W_Gift) {
                return false;
            }
        }
        return true;

    }


    public void generate(ArrayList<Gift> arr) {
        if(arr.get(arr.size()-1).getY() <= 350 ){
            return;
        }
        for (int i = 0; i < 3 ; i++) {
            int x = 50 + rd.nextInt(SnakeFrame.W_FRAME - 80);
            int y = 50 + rd.nextInt(SnakeFrame.H_FRAME/3);
            point = 1 + rd.nextInt(11);
            Gift gift = new Gift(x, y, point);
            arr.add(gift);
        }
    }
    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,W_Gift,W_Gift);
        return rect;
    }
}
