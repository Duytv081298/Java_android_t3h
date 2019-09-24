package com.t3h.gui;

import com.t3h.model.GameManager;
import com.t3h.model.Tank;
import com.t3h.until.SoundLoader;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankPanel extends JPanel implements KeyListener,Runnable {
    private GameManager manager = new GameManager();
    private boolean[] flags = new boolean[256]; //256 phím và tổ hợp phím
    private Clip clip;
    public TankPanel() {
        setBackground(Color.BLACK);
        manager.initGame();

        setFocusable(true); // kéo sự Focusable của người dùng vào frame đang được sử dụng
        addKeyListener(this);
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        super.paintComponent(graphics2D);
        manager.draw(graphics2D);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) { // keyTyped

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) { // keyPressed: ấn phím
        /*switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_LEFT:
                manager.playerMove(Tank.LEET);
                break;
            case KeyEvent.VK_RIGHT:
                manager.playerMove(Tank.RIGHT);
                break;
            case KeyEvent.VK_UP:
                manager.playerMove(Tank.UP);
                break;
            case KeyEvent.VK_DOWN:
                manager.playerMove(Tank.DOWN);
                break;
        }
        repaint();*/

        flags[keyEvent.getKeyCode()] = true;



    }

    @Override
    public void keyReleased(KeyEvent keyEvent) { // keyReleased: Nhả phím
        flags[keyEvent.getKeyCode()] = false;
    }
    private void checkSoundMove(){
        if( flags[KeyEvent.VK_LEFT]
                ||flags[KeyEvent.VK_RIGHT]
                || flags[KeyEvent.VK_UP]
                || flags[KeyEvent.VK_DOWN]){
            if(clip == null){
                    clip = SoundLoader.play("move.wav");
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        }else {
            if(clip != null){
                clip.stop();
                clip = null;
            }

        }
    }

    @Override
    public void run() {
        while (true){
            if(flags[KeyEvent.VK_LEFT]){
                manager.playerMove((Tank.LEET));
            }else                               //sử dụng if else tránh di chuyển chéo
            if(flags[KeyEvent.VK_RIGHT]){
                manager.playerMove((Tank.RIGHT));
            }else
            if(flags[KeyEvent.VK_UP]){
                manager.playerMove((Tank.UP));
            }else
            if(flags[KeyEvent.VK_DOWN]){
                manager.playerMove((Tank.DOWN));
            }
            if(flags[KeyEvent.VK_SPACE]){
                manager.playerFrire();
            }
            checkSoundMove();
            boolean isDie = manager.AI();
            if (isDie){
                int result = JOptionPane.showConfirmDialog(null, "DO you wan to replay", "Game over",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION ){
                    flags = new boolean[256];
                    manager.initGame();
                }else {
                    System.exit(0);
                }
            }
            repaint(); //vẽ lại giao diện
            try {
                Thread.sleep(7); // yêu cầu Thread nghỉ
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
