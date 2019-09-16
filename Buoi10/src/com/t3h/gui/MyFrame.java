package com.t3h.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener { // implements thực thi implements WindowListener, sự kiện tiếp theo
    public static final int W_FRAME = 800;  // final không thể thay đổi, hằng số
    public static final int H_FRAME = 600;  // static

    public MyFrame() {
        setTitle("Buoi 10"); // Hiển thị lên phần trên cùng
        setSize(W_FRAME,H_FRAME); // Thay đổi kích thước. tính theo đơn vị pixel
//        setLocation(100, 100); // Vị trí hiển thị trên màn hình
        setLocationRelativeTo(null);// Hiển thi giữa màn hình
        setResizable(false); // không thể thay đổi kích thước
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        /*
        DO_NOTHING_ON_CLOSE: sử lý tắt bằng code
        HIDE_ON_CLOSE: Chỉ ẩn
        DO_NOTHING_ON_CLOSE: Không cho phép tắt
        DISPOSE_ON_CLOSE kiểm tra xem chương trình còn mấy fram, chỉ thực hiện đóng chương trình khi không còn fram nào được mở
        EXIT_ON_CLOSE tắt ngay lập tức khoogn cần biết bao nhiêu faram đang được mở
        */
        addWindowListener(this); // this gọi WindowListener thể hiện sự đa hình

        //Đưa Panel lên frame
        MyPanel panel = new MyPanel();
        add(panel);

    }








    @Override
    public void windowOpened(WindowEvent windowEvent) {
        // Trạng thái windows được mở lên lần đầu
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        // đang đóng
        int result = JOptionPane.showConfirmDialog(
                null,
                "Do you wan to exit?",
                "Exit app",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE // style option
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
