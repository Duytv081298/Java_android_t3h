import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel  implements MouseMotionListener {
    private ConTro conTro = new ConTro(200, 200);
    public MyPanel() {
        setBackground(Color.black);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        conTro.draw(g2d);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        conTro.setY(e.getY());
        conTro.setX(e.getX());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
