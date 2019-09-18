package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Gift {
    protected int x, y;
    public static final int W_Gift = SnakeFrame.W_FRAME / 20;
    public static final int H_Gift = SnakeFrame.H_FRAME / 30;
    public static  ArrayList<Integer> pointGift = new ArrayList<>();


    private Random rd = new Random();

    public Gift() {
    }


    public void draw(Graphics2D g2d) {
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        int point = rd.nextInt(11);
        pointGift.add(point);
        this.x = 10+ rd.nextInt(SnakeFrame.W_FRAME + 10);
        this.y = 10+ rd.nextInt(SnakeFrame.H_FRAME/3);

        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, W_Gift, H_Gift);

        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 15));
        g2d.drawString(point + "", x + W_Gift / 2 - 1, y + H_Gift / 3);
    }

    public void drawMove(Graphics2D g2d, int point) {
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, W_Gift, H_Gift);

        g2d.setColor(Color.white);
        g2d.setFont(new Font(null, Font.BOLD, 15));
        g2d.drawString(point + "", x + W_Gift / 2 - 1, y + H_Gift / 3);
    }

    public boolean move() {
        y += 1;
        if (y >= SnakeFrame.H_FRAME + H_Gift) {
            return false;
        } else {
            return true;
        }
    }

    private long t;

    public void generate(ArrayList<Gift> arr) {
        Long T = System.currentTimeMillis();
        if (T - t < 750) {
            return;
        }
        t = T;
        for (int i = 0; i < 7; i++) {
            Gift gift = new Gift();
            arr.add(gift);
        }
    }
}
