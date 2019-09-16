package com.btvn_buoi10.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    public static final int W_FRAME = 600;
    public static final int H_FRAME = 600;
    public MyFrame() {
        setTitle("BTVN Buổi 10");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
        setResizable(false);
/*        MyPanel myPanel = new MyPanel();
        add(myPanel);*/
//        Layout2 layout2 = new Layout2();
//        add(layout2);

        Layout1 layout1 = new Layout1();
        add(layout1);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_ENTER:
                Layout2 layout2 = new Layout2();
                layout2.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
                add(layout2);
                break;
            case KeyEvent.VK_D:
                Layout1 layout1 = new Layout1();
                layout1.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
                add(layout1);
                break;
            case KeyEvent.VK_E:
                Layout3 layout3 = new Layout3();
                layout3.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
                add(layout3);
                break;
            default:
                Toolkit.getDefaultToolkit().beep();
        }
        System.out.println("Hết");
    }
    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
