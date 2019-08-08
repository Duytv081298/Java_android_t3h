package com.btvn_buoi4_bai1.Hinh;

import com.btvn_buoi4_bai1.ButVe.ButVe;

public class Hinh {
    private ButVe butve;

    public Hinh(ButVe butve) {
        this.butve = butve;
    }

    public void ve(){
        System.out.print(" được vẽ bằng ");
        butve.ve();
    }
}
