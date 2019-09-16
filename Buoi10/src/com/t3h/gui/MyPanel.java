package com.t3h.gui;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public MyPanel(){
        setBackground(Color.GRAY);
        setLayout(null);
        MyPanelGame panelGame = new MyPanelGame();
        MyPanelMenu panelMenu = new MyPanelMenu();
        add(panelGame);
        add(panelMenu);
    }
}
