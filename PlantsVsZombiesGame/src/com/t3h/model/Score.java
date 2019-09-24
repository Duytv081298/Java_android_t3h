package com.t3h.model;

import java.awt.*;

public class Score {
    private int x;
    private int y;
    public static int score = 50;

    public Score(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.BLACK);
        g2d.drawString(score+"", x,y);
    }
}
