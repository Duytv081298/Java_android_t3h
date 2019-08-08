package com.btvn_buoi4_bai1.Hinh;

import com.btvn_buoi4_bai1.ButVe.ButVe;

public class HinhTamGiac extends Hinh {

    public HinhTamGiac(ButVe butve) {
        super(butve);
    }
    @Override
    public void ve() {
        System.out.print("Hình Tam Giác");
        super.ve();
    }

}
