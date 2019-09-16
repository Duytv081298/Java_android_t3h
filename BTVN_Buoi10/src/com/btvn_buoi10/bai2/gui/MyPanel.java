package com.btvn_buoi10.bai2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements KeyListener, MouseMotionListener {
    int cout = 0;
    public MyPanel() {
        setLayout(null);
        /*Layout1 layout1 = new Layout1();
        layout1.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
        add(layout1);*/
        addKeyListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
/*        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_ENTER:
                Layout1 layout1 = new Layout1();
                layout1.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
                add(layout1);
                break;
            case KeyEvent.VK_BACK_SPACE:
                Layout2 layout2 = new Layout2();
                layout2.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
                add(layout2);
                break;
            default:
                Toolkit.getDefaultToolkit().beep();
        }*/

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
//        if(cout % 2 == 0){
//            Layout1 layout1 = new Layout1();
//            layout1.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
//            add(layout1);
//        }else {
//            Layout2 layout2 = new Layout2();
//            layout2.setSize(MyFrame.W_FRAME,MyFrame.H_FRAME);
//            add(layout2);
//        }
//        cout += 1;
//        System.out.println(cout);
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
