package test;
import com.t3h.model.ImageLoader;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMotionListenerExample2 extends Frame implements MouseMotionListener, MouseListener {
    Image counter = ImageLoader.getImage("Counter.png",getClass());
    Label label;
    Color color = Color.BLUE;

    public MouseMotionListenerExample2() {
        label = new Label();
        label.setBounds(20, 40, 100, 20);
        add(label);

        addMouseMotionListener(this);
        addMouseListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
//        label.setText("X=" + e.getX() + ", Y=" + e.getY());
//        Graphics g = getGraphics();
//        g.drawImage(counter,e.getX(), e.getY(),null);
//        repaint();
//        try {
//            Thread.sleep(20);
//        } catch (InterruptedException k) {
//            k.printStackTrace();
//        }

    }

    public void mouseMoved(MouseEvent e) {
        label.setText("X=" + e.getX() + ", Y=" + e.getY());
//        Graphics g = getGraphics();
//        g.drawImage(counter,e.getX(), e.getY(),null);
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample2();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("X=" + e.getX() + ", Y=" + e.getY());
        Graphics g = getGraphics();
        g.drawImage(counter,e.getX(), e.getY(),null);

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
