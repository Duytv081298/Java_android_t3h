package com.project.model;

import com.project.gui.SnakeFrame;
import com.project.gui.SnakePanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Snake {

    public static final int W_SNAKE = 30;
    public static final int LEET = 0;
    public static final int RIGHT = 1;
    protected   int x, y, orient;
    public static  int  speed = 3;

    private int point ;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Snake(int x, int y) {
        this.x = x;
        this.y = y;
        this.point = 5;
    }


    public void drawChinh(Graphics2D g2d ){

        g2d.setColor(Color.red);
        g2d.fillOval(x, y, W_SNAKE, W_SNAKE);

        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 20));
        g2d.drawString(point + "", x+ W_SNAKE/2 - 10, y-5);
    }

    public void drawPhu(Graphics2D g2d){
        g2d.setColor(new Color(0,178,191));
        g2d.fillOval(x, y, W_SNAKE, W_SNAKE);
    }

    public void move(){
        int xR = x;
        switch (orient){
            case LEET:
                x -= speed;
                break;
            case RIGHT:
                x += speed;
                break;
        }
        if(x<=0 || x>= SnakeFrame.W_FRAME - 47){
            x= xR;
        }

    }

    public void chaneOrient(int newOrient){
        this.orient = newOrient;
    }
    public Rectangle getRect(){
        Rectangle rect = new Rectangle(x,y,W_SNAKE,W_SNAKE);
        return rect;
    }
    public Rectangle getRectUp(){
        Rectangle rect = new Rectangle(x+ 5 ,y,W_SNAKE - 10,5);
        return rect;
    }
    public Rectangle getRectRight(){
        Rectangle rect = new Rectangle(x+ W_SNAKE -5 ,y+5,5,W_SNAKE - 10);
        return rect;
    }
    public Rectangle getRectLeft(){
        Rectangle rect = new Rectangle(x,y+5,5,W_SNAKE - 10);
        return rect;
    }


    public void generate(ArrayList<Snake> arr){
        int congThem = GameManager.checkSnakeToGift();
        for (int j = 0; j < congThem ; j++) {
            Snake snake = new Snake(SnakeFrame.W_FRAME / 2, SnakeFrame.H_FRAME / 2 + Snake.W_SNAKE * (GameManager.snakes.size()-1) + Snake.W_SNAKE * j);
            arr.add(snake);
        }
    }





}
