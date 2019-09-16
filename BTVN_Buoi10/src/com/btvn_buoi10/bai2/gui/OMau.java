package com.btvn_buoi10.bai2.gui;

import javax.swing.*;
import java.awt.*;

public class OMau extends JPanel {
    private String mau;
    private int x,y;

    public OMau(String mau, int x, int y) {
        this.mau = mau;
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D graphics2d = (Graphics2D) graphics;
        super.paintComponent(graphics2d);
        graphics2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        graphics2d.setColor(Color.BLACK);
        graphics2d.setFont(new Font("null", Font.BOLD, 15)); // tham số 1 tên font
        graphics2d.drawString(mau, x, y);

    }

}
