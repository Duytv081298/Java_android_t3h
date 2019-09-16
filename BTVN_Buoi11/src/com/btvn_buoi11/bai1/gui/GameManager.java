package com.btvn_buoi11.bai1.gui;

import java.awt.*;
import java.util.ArrayList;

public class GameManager {
    private OTrong oTrong;
    private int wf = MyFrame.W_FRAME/3;
    private int hf = MyFrame.H_FRAME;
    public ArrayList<OTrong> oTrongs = new ArrayList<>();

    public void initGame(){
        for (int i = 0; i * OTrong.w < wf  ; i++) {
            for (int j = 0; j * OTrong.h < hf ; j++) {
                OTrong oTrong = new OTrong(i * OTrong.w +1, i * OTrong.h +1);
                oTrongs.add(oTrong);
            }
        }
    }


}
