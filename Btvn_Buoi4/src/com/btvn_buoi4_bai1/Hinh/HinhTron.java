package com.btvn_buoi4_bai1.Hinh;

import com.btvn_buoi4_bai1.ButVe.ButVe;

public class HinhTron extends Hinh {

    public HinhTron(ButVe butve) {
        super(butve);
    }

    @Override
    public void ve() {
        System.out.print("Hình Tròn");
        super.ve();
    }
}
