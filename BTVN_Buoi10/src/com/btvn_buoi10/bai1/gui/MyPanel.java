package com.btvn_buoi10.bai1.gui;

import javax.swing.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        setLayout(null);
        MenuPanel menuPanel = new MenuPanel();
        PlayGame playGame = new PlayGame();
        menuPanel.setSize(MyFrame.W_FRAME/3,MyFrame.H_FRAME);
        playGame.setLocation(MyFrame.W_FRAME/3, 0);
        playGame.setSize(MyFrame.W_FRAME/3*2,MyFrame.H_FRAME);
        add(menuPanel);
        add(playGame);
    }
}
