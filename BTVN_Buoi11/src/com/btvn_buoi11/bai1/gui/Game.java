package com.btvn_buoi11.bai1.gui;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    private GameManager manager = new GameManager();
    public Game() {
        setBackground(Color.BLACK);
        manager.initGame();
        setFocusable(true);

    }
}
