import java.awt.*;

public class ConTro {
    private int x,y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ConTro(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.red);
        g2d.fillOval(x, y, 100, 100);
    }
}
