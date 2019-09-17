package com.project.model;

import com.project.gui.SnakeFrame;

import javax.swing.*;
import java.awt.*;

public class Snake {
    public static final int LEET = 0;
    public static final int RIGHT = 1;
    protected   int x, y, viTri, orient;
    protected Image[] images;
    protected  int speed = 1;

    public Snake(int x, int y, int viTri) {
        this.x = x;
        this.y = y;
        this.viTri = viTri;
        images = new Image[2];
        images[0] = getImage("player_green_left.png", getClass());
        images[1] = getImage("player_green_right.png", getClass());
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(images[viTri], x, y,null);
    }
    public void move(){
        int xR = x;
        int yR = y;
        switch (orient){
            case LEET:
                x -= speed;
                break;
            case RIGHT:
                x +=speed;
                break;
        }
        if(x<=0 || x>= SnakeFrame.W_FRAME - images[orient].getHeight(null)-18){
            x= xR;
        }
    }
    public void chaneOrient(int newOrient){
        this.orient = newOrient;
    }

    public static Image getImage(String name, Class clz){
        Image image = new ImageIcon(
                clz.getResource("/images/" + name)  // đường dẫn hình ảnh
        ).getImage();
        return image;
    }


}
