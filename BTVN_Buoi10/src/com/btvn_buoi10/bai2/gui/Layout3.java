package com.btvn_buoi10.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Layout3 extends JPanel implements MouseListener{
    public Layout3() {
        setLayout(null);
        setBackground(Color.BLACK);
        int width = MyFrame.W_FRAME/6;
        int height = MyFrame.W_FRAME/10;
        Color color[] = {Color.red, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.MAGENTA};
        String textColor[] = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PINK", "MAGENTA"};
        addMouseListener(this);

        for (int i = 1; i < 5 ; i++) {
            OMau oMau = new OMau(textColor[i-1], 10 , height/2+3);
            oMau.setSize(width,height);
            oMau.setBackground(color[i-1]);
            oMau.setLocation(width*i, height + height*i -height/3*2);
            add(oMau);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        setBackground(Color.GRAY);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        setBackground(Color.WHITE);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        setBackground(Color.BLACK);
    }

}
