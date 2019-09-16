package com.btvn_buoi11.bai1.gui;

import javax.swing.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null);
        Menu menu= new Menu();
        Game game = new Game();
        menu.setSize(MyFrame.W_FRAME/3,MyFrame.H_FRAME);
        game.setLocation(MyFrame.W_FRAME/3, 0);
        game.setSize(MyFrame.W_FRAME/3*2,MyFrame.H_FRAME);
        add(menu);
        add(game);

    }
}
