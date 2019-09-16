package com.t3h.gui;

import javax.swing.*;
import java.awt.*;

public class MyPanelGame extends JPanel {
    public MyPanelGame(){
        setBackground(Color.BLACK);
        setBounds(MyFrame.W_FRAME/3,0,MyFrame.W_FRAME/3*2, MyFrame.H_FRAME);

    }

    @Override
    protected void paintComponent(Graphics graphics) { // graphics Sử dụng để vẽ (Bút vẽ)
        Graphics2D graphics2d = (Graphics2D) graphics;
        super.paintComponent(graphics2d);
        graphics2d.setRenderingHint( /// chống răng cưa
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        graphics2d.setColor(Color.white);
        graphics2d.setStroke(new BasicStroke(30)); // setStroke kích thước nét vẽ hình học
        graphics2d.drawLine(0, 0, 800, 800);
        graphics2d.setColor(Color.yellow);
        graphics2d.drawOval(200, 200, 100, 100);
        graphics2d.setColor(Color.white);
        graphics2d.setFont(new Font("Edwardian Script ITC", Font.BOLD, 26)); // tham số 1 tên font
        graphics2d.drawString("Hello World", 200, 100);

    }
}
