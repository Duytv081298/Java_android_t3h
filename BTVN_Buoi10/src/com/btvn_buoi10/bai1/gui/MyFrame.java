package com.btvn_buoi10.bai1.gui;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener {
    public static final int W_FRAME = 600;
    public static final int H_FRAME = 600;

    public MyFrame() {
        setTitle("BTVN Buổi 10");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(this);
        MyPanel panel = new MyPanel();
        add(panel);
    }
    @Override
    public void windowOpened(WindowEvent windowEvent) {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        int result = JOptionPane.showConfirmDialog(
                null,
                "Bạn có muốn thoát không?",
                "Thoát chương trình",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
