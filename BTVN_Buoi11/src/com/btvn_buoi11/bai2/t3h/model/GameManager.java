package com.btvn_buoi11.bai2.t3h.model;

import java.awt.*;

public class GameManager {
    private Player player;

    public void initGame(){
//        player = new Player(200,200,3);
        player = new Player(200,200,3);
    }
    public void draw(Graphics2D g2d){
        player.draw(g2d);
    }
    public void playerMove(int newOrient){
        player.chaneOrient(newOrient);
        player.move();
    }

}
