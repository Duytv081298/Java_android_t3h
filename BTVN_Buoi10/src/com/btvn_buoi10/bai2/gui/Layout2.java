package com.btvn_buoi10.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Layout2 extends JPanel implements MouseListener {
    public Layout2() {
        setLayout(null);
        setBackground(Color.WHITE);
        int w_h = MyFrame.W_FRAME/5;
        Color color[] = {Color.red, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK, Color.MAGENTA};
        String textColor[] = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PINK", "MAGENTA"};
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                OMau oMau = new OMau(textColor[i+j], 10 , w_h/2+3);
                oMau.setSize(w_h,w_h);
                oMau.setBackground(color[i+j]);
                oMau.setLocation(w_h*j*2,w_h*i*2-15*i);
                add(oMau);
            }
        }
        addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        mouseEvent.

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
