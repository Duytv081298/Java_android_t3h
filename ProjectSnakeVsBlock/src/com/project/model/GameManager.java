package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    public ArrayList<Block> blocks;
    public ArrayList<Gift> gifts;
    public void initGame(){
        gifts = new ArrayList<>();
        blocks = new ArrayList<>();
        generateBlock();
        generateGift();
    }


//    private long t;
    public void generateBlock(){
//        Long T = System.currentTimeMillis();
//        if(T - t <750){
//            return;
//        }
//        t = T;
        for (int j = 0; j < SnakeFrame.W_FRAME / Block.W_BLOCK ; j++) {
            Block block = new Block(Block.W_BLOCK*j, - Block.H_BLOCK );
            blocks.add(block);
        }
            Gift gift = new Gift();
            gifts.add(gift);

    }
    public void generateGift(){
        Gift gift = new Gift();
        gifts.add(gift);

    }


    public void draw(Graphics2D g2d){
//        for (Block block: blocks
//        ) {
//            block.draw(g2d);
//        }
        for (int i = blocks.size() -1; i >= blocks.size() -5 ; i--) {
            blocks.get(i).draw(g2d);
        }
        for (int i = 0; i <= blocks.size() -6 ; i++) {
            int point  = Block.points.get(i);
            blocks.get(i).drawMove(g2d, point );
        }
        for (Gift gif: gifts
             ) {
            gif.draw(g2d);
        }
    }

    public  void AI(){
        boolean move ;

        blocks.get(blocks.size() -1).generate(blocks);

        for (int i = blocks.size() -1; i >=0 ; i--) {
            move = blocks.get(i).move();
            if (move == false){
                blocks.remove(i);
                Block.points.remove(i);
            }
        }
        for (int j = gifts.size()-1; j >= 0 ; j--) {
            move = gifts.get(j).move();
            if (move == false){
                gifts.remove(j);
            }
        }
    }
}
