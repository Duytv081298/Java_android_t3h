package com.btvn_buoi4_bai1.Hinh;

import com.btvn_buoi4_bai1.ButVe.ButVe;

public class HinhChuNhat extends Hinh {
    public HinhChuNhat(ButVe butve) {
        super(butve);
    }
    @Override
    public void ve() {
        System.out.print("Hình Chữ Nhật");
        super.ve();
    }
}
