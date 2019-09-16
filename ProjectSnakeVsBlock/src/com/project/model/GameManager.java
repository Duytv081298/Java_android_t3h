package com.project.model;

import com.project.gui.SnakeFrame;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    public ArrayList<Block> blocks;
    public void initGame(){
        blocks = new ArrayList<>();
        generateBlock();
    }


    private long t;
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
//        for (int i = 0; i < SnakeFrame.W_FRAME /BlockPanel.W_BLOCK ; i++) {
//            for (int j = 0; j < SnakeFrame.W_FRAME /BlockPanel.W_BLOCK ; j++) {
//                BlockPanel blockPanel = new BlockPanel(BlockPanel.W_BLOCK*i, BlockPanel.H_BLOCK*j );
//                blockPanels.add(blockPanel);
//            }
//        }
    }


    public void draw(Graphics2D g2d){
        for (Block block: blocks
        ) {
            block.draw(g2d);
        }
    }

    public  void AI(){
        for (int i = blocks.size() -1; i >=0 ; i--) {
            blocks.get(blocks.size() -1).generate(blocks);
            blocks.get(i).move();
        }
    }
}
