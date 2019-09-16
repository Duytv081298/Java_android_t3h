package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Block {
    public static final int W_BLOCK = SnakeFrame.W_FRAME/5;
    public static final int H_BLOCK = SnakeFrame.H_FRAME/12;
    private Random rd = new Random();

    public static final Color COLORS[] = {Color.WHITE, Color.GREEN, Color.YELLOW, Color.MAGENTA, Color.RED};
    protected   int x, y;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2d){
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        int point = rd.nextInt(51);
        if (point <= 0){
            g2d.setColor(COLORS[0]);
        }else if(point <= 10){
            g2d.setColor(COLORS[1]);
        }else if(point <= 15){
            g2d.setColor(COLORS[2]);
        }else if(point <= 35){
            g2d.setColor(COLORS[3]);
        }else if(point <= 50){
            g2d.setColor(COLORS[4]);
        }
        g2d.fillRoundRect(x, y, W_BLOCK, H_BLOCK, 25, 25);
        System.out.println("X = "+ x + "\n y = " +y);
        g2d.setColor(COLORS[0]);
        g2d.setFont(new Font(null, Font.BOLD, 26));
        g2d.drawString(point+ "", x+ W_BLOCK/2 -20, y+ H_BLOCK/3*2 -1);
    }

    public void move(){
        y += 1;
    }
    public void generate(ArrayList<Block> arr){
        if(y<= 150){
            return;
        }
        for (int j = 0; j < SnakeFrame.W_FRAME / Block.W_BLOCK ; j++) {
            Block block = new Block(Block.W_BLOCK*j, - Block.H_BLOCK );
            arr.add(block);
        }
    }



}
