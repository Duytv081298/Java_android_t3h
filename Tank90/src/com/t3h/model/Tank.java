package com.t3h.model;

import com.t3h.gui.TankFrame;
import com.t3h.gui.TankPanel;

import java.awt.*;
import java.util.ArrayList;

public abstract class Tank {
    public static final int LEET = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    protected   int x, y, orient;
    protected Image[] images;
    protected  int speed = 1;

    public Tank(int x, int y, int orient) {
        this.x = x;
        this.y = y;
        this.orient = orient;
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(images[orient], x, y,null);
    }
    public void move(){
        int xR = x;
        int yR = y;
        switch (orient){
            case LEET:
                x -= speed;
                break;
            case RIGHT:
                x+=speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
        }

        if(x<=0 || x>= TankFrame.W_FRAME - images[orient].getHeight(null)-18){
            x= xR;
        }if(y<=0 || y>= TankFrame.H_FRAME - images[orient].getHeight(null)-40){
            y= yR;
        }
    }
    private long t;
    public void fire (ArrayList<Bullet> arr){
        Long T = System.currentTimeMillis();
        if(T - t <500){
            return;
        }
        t = T;
        int xB = x + images[orient].getWidth(null)/2;
        int yB = y + images[orient].getHeight(null)/2;
        Bullet b = new Bullet(xB, yB, orient);
        arr.add(b);
    }
    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y, images[orient].getWidth(null),
                                            images[orient].getHeight(null));
        return rect;
    }
    public boolean checkDie(ArrayList<Bullet> arr){
        for (int i = 0; i < arr.size() ; i++) {
            Rectangle rect = getRect()
                    .intersection(arr.get(i).getRect()); // intersection kiểm tra giao nhau giữa 2 hình chữ nhật nếu giao trả về 1 hình trữ nhật
            if (rect.isEmpty() == false){
                arr.remove(i);
                return  true;
            }
        }
        return  false;
    }
}
