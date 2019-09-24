import javax.swing.*;
import java.awt.*;

public class MyFrame extends Frame {
    public static final int W_FRAME = 1120;
    public static final int H_FRAME = 630;

    public MyFrame() {
        setTitle("Plants and Zombies Game");
        setSize(W_FRAME,H_FRAME);
        setLocationRelativeTo(null);
        setResizable(false);

        MyPanel myPanel = new MyPanel();
        add(myPanel);
    }
}
