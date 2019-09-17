package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.Random;

public class Gift {
    public static final int W_Gift = SnakeFrame.W_FRAME/75;
    public static final int H_Gift = SnakeFrame.H_FRAME/110;
    protected int x, y;

    private Random rd = new Random();

    public Gift() {
    }

    private long t;

    public void draw(Graphics2D g2d){
        Long T = System.currentTimeMillis();
        if(T - t <750){
            return;
        }
        t = T;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        int point = rd.nextInt(11);
        int x = rd.nextInt(SnakeFrame.W_FRAME);
        int y = rd.nextInt(SnakeFrame.H_FRAME);

        g2d.setColor(Color.RED);
        g2d.fillOval(x, y,W_Gift,H_Gift);
        System.out.println("x,y gift:      X = "+ x + "\n y = " +y);

        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 20));
        g2d.drawString(point + "", x+ W_Gift/2 -1, y+ H_Gift/3*2);
    }
    public boolean move(){
        y += 1;
        if( y>= SnakeFrame.H_FRAME + H_Gift ){
            return false;
        }else {
            return true;
        }
    }
}
