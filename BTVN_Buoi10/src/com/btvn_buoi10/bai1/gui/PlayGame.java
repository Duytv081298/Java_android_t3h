package com.btvn_buoi10.bai1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayGame extends JPanel implements MouseListener {
    public PlayGame() {
        setBackground(Color.BLUE);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        setBackground(Color.BLUE);
    }
}
