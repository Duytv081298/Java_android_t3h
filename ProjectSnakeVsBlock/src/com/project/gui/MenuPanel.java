package com.project.gui;

import until.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JTextField tfPlayerInfor;
    private JButton btnOk;
    private Image bg = ImageLoader.getImage("Menu.jpg" , getClass());

    public MenuPanel() {
        setLayout(null);
        setBackground(Color.gray);
        initComponents();
    }

    private void initComponents() {
        lbTitle = new JLabel();
        lbTitle.setForeground(Color.red);
        lbTitle.setFont(new Font(
                null,
                Font.BOLD,
                20
        ));
        lbTitle.setText("Snake Vs Block");
        lbTitle.setBounds(100, 100, 200, 200);
        add(lbTitle);

        tfPlayerInfor = new JTextField();
        tfPlayerInfor.setBounds(100, 300, 300, 30);
        add(tfPlayerInfor);

        btnOk = new JButton();
        btnOk.setText("OK");
        btnOk.setBounds(100, 500, 70, 30);
        add(btnOk);
        btnOk.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(
                null,
                tfPlayerInfor.getText()
        );

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g);
        g2d.drawImage(bg, 0,0, SnakeFrame.W_FRAME,SnakeFrame.H_FRAME, null);
    }
}
