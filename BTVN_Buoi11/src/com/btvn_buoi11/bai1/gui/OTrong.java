package com.btvn_buoi11.bai1.gui;

import com.btvn_buoi11.bai1.until.ImageLoader;

import java.awt.*;

public class OTrong  {

    public static final int TRANG = 0;
    public static final int X = 1;
    public static final int O = 2;
    public static final int w = 5;
    public static final int h = 5;
    protected   int x, y, luaChon;
    protected Image[] images;

    public OTrong(int x, int y) {
        this.x = x;
        this.y = y;
        images = new Image[3];
        images[TRANG] = ImageLoader.getImage("trang.png", getClass());
        images[X] = ImageLoader.getImage("Dau_x.png", getClass());
        images[O] = ImageLoader.getImage("Dau_o.png", getClass());
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(images[luaChon], x, y,w,h,null);
    }
}
