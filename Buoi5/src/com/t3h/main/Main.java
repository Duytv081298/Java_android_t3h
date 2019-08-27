package com.t3h.main;

import com.t3h.hinhhoc.HinhChuNhat;
import com.t3h.hinhhoc.HinhHoc;
import com.t3h.hinhhoc.HinhTron;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        HinhTron ht = new HinhTron("Hình tròn", 15f);
//        HinhChuNhat hcn = new HinhChuNhat("Hình Chữ Nhật", 5f, 10f);
//        ht.inThongTin();
//        ht.tinhChuVi();
//        ht.tinhDienTich();
//        hcn.inThongTin();
//        hcn.tinhChuVi();
//        hcn.tinhDienTich();

//        Random rd = new Random();
//        Boolean v = rd.nextBoolean(); // Random ra biến có kiểu giá trị đó
//        HinhHoc hinhHoc;
//        if (v == true){
//            hinhHoc = new HinhTron("Hình tròn", 15f); // ht là hình tròn nhưng được thể hiện dưới dạng hình học
//        }else {
//            hinhHoc = new HinhChuNhat("Hình Chữ Nhật", 5f, 10f);
//
//        }
//        hinhHoc.inThongTin();
//        hinhHoc.tinhChuVi();
//        hinhHoc.tinhDienTich();
//        boolean check = hinhHoc instanceof HinhTron;  // instanceof sử dụng để kiểm tra bản chất của đối tượng vd: hinhHoc có phải là HinhTron không
//        if (check == true){
//            ((HinhTron) hinhHoc).xoayTron();
//        }else {
//            HinhChuNhat hcn = (HinhChuNhat) hinhHoc;
//            hcn.bienHinh();
//        }
        int a = 3;
        HinhTron ht = new HinhTron("Hình tròn", 15f);
        ht.inThongTin();
        ht.tinhChuVi();
        ht.tinhDienTich();
        System.out.println("============================");
        changValue(a,ht);
        System.out.println("a = " + a);
        ht.inThongTin();
        ht.tinhChuVi();
        ht.tinhDienTich();


    }
    private static void changValue(int a, HinhTron ht){
        a = 4;
        ht.setR(10);
    }



}
