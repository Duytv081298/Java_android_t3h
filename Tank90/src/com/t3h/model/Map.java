package com.t3h.model;

import com.t3h.until.ImageLoader;

import java.awt.*;

public class Map {
    private int x, y, bit;

    public int getBit() {
        return bit;
    }

    private Image[] images = {
            ImageLoader.getImage("gach.png", getClass()),
            ImageLoader.getImage("da2.png", getClass()),
            ImageLoader.getImage("troi1.png", getClass()),
            ImageLoader.getImage("la3.png", getClass()),
            ImageLoader.getImage("da5.png", getClass()),
            ImageLoader.getImage("chim1.png", getClass()),
            ImageLoader.getImage("chim2.png", getClass()),
            ImageLoader.getImage("chim3.png", getClass()),
            ImageLoader.getImage("chim4.png", getClass()),
    };

    public Map(int x, int y, int bit) {
        this.x = x;
        this.y = y;
        this.bit = bit;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(images[bit - 1], x, y, null);
    }

    public Rectangle getRect() {
        int w = images[bit - 1].getWidth(null);
        int h = images[bit - 1].getHeight(null);
        return new Rectangle(x, y, w, h);
    }

}
