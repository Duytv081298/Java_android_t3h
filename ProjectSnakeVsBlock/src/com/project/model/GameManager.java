package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    private Snake snake;
    public ArrayList<Block> blocks;
    public ArrayList<Gift> gifts;
    public void initGame(){
        gifts = new ArrayList<>();
        blocks = new ArrayList<>();
        generate();

    }



    public void generate(){

        for (int j = 0; j < SnakeFrame.W_FRAME / Block.W_BLOCK ; j++) {
            Block block = new Block(Block.W_BLOCK*j, - Block.H_BLOCK );
            blocks.add(block);
        }
        for (int i = 0; i < 7 ; i++) {
            Gift gift = new Gift();
            gifts.add(gift);
        }

    }


    public void draw(Graphics2D g2d){
        for (int i = blocks.size() -1; i >= blocks.size() -5 ; i--) {
            blocks.get(i).draw(g2d);
            System.out.println( blocks.size());
        }
        for (int i = 0; i <= blocks.size() -6 ; i++) {
            int point  = Block.points.get(i);
            blocks.get(i).drawMove(g2d, point );
        }
        for (int i = gifts.size() -1; i >= gifts.size()-7 ; i--) {
            gifts.get(i).draw(g2d);
            System.out.println( gifts.size());
        }
        for (int i = 0; i <= gifts.size() -8 ; i++) {
            int point  = Gift.pointGift.get(i);
            gifts.get(i).drawMove(g2d, point );
        }

    }

    public  void AI(){

        blocks.get(blocks.size() -1).generate(blocks);
        gifts.get(gifts.size() -1).generate(gifts);

        for (int i = blocks.size() -1; i >=0 ; i--) {
            boolean moveBlock = blocks.get(i).move();
            if (moveBlock == false){
                blocks.remove(i);
                Block.points.remove(i);
            }
        }

        for (int j = gifts.size()-1; j >= 0 ; j--) {
            boolean moveGift = gifts.get(j).move();
            if (moveGift == false){
                gifts.remove(j);
                Gift.pointGift.remove(j);
            }
        }
    }
}
