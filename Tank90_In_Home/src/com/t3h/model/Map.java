package com.t3h.model;

import com.t3h.until.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Map extends JPanel {
    public static final int ITEM_SIZE = 25;
    private int x, y,type;
    private Image[] images;
    public static ArrayList<Image> imageMap = new ArrayList<>();

    public Map(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
        images = new Image[6];
        images[0] = ImageLoader.getImage("den.png", getClass());
        images[1] = ImageLoader.getImage("gach.png", getClass());
        images[2] = ImageLoader.getImage("da2.png", getClass());
        images[3] = ImageLoader.getImage("la3.png", getClass());
        images[4] = ImageLoader.getImage("troi1.png", getClass());
        images[5] = ImageLoader.getImage("da5.png", getClass());
    }
//    public void loadImage(){
//        this.imageMap = ImageLoader.subImage("unit.png", ITEM_SIZE, ITEM_SIZE, 6, getClass());
//    }
    public void drawMap(Graphics2D g2d){
        g2d.drawImage(images[type], x*ITEM_SIZE, y*ITEM_SIZE, ITEM_SIZE, ITEM_SIZE,null);
    }
}
