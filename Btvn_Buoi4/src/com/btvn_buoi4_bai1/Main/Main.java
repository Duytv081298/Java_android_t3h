package com.btvn_buoi4_bai1.Main;

import com.btvn_buoi4_bai1.ButVe.ButDo;
import com.btvn_buoi4_bai1.ButVe.ButVe;
import com.btvn_buoi4_bai1.ButVe.ButXanh;
import com.btvn_buoi4_bai1.Hinh.HinhChuNhat;
import com.btvn_buoi4_bai1.Hinh.HinhTamGiac;
import com.btvn_buoi4_bai1.Hinh.HinhTron;

public class Main {
    public static void main(String[] args) {
        ButDo bd = new ButDo();
        ButXanh bx = new ButXanh();
        HinhTron ht = new HinhTron(bd);
        HinhChuNhat hcn = new HinhChuNhat(bx);
        HinhTamGiac htg = new HinhTamGiac(bd);
        ht.ve();
        hcn.ve();
        htg.ve();



    }
}
