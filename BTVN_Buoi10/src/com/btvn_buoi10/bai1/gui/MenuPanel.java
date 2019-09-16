package com.btvn_buoi10.bai1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MenuPanel extends JPanel implements MouseMotionListener, MouseListener {
    public MenuPanel(){
        setBackground(Color.red);
        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {   //phương thức này được gọi khi người dùng nhấn một nút chuột và kéo trên một component.
        setBackground(Color.white);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) { // phương thức này được gọi khi di chuyển chuột trên component
        setBackground(Color.pink);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) { //được gọi khi một nút chuột được nhấn và nhả trên component mà không di chuyển chuột.
        setBackground(Color.yellow);
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) { // được gọi khi một nút chuột được nhấn và con trỏ chuột ở trên component.
        setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) { // được gọi khi một nút chuột nhả ra khi kéo rê.
        setBackground(Color.BLACK);
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) { // được gọi khi con trỏ chuột vào trong đường biên của một component.
        setBackground(Color.pink);
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) { // được gọi khi con trỏ chuột ra khỏi đường biên của một component.
        setBackground(Color.red);
    }
}
