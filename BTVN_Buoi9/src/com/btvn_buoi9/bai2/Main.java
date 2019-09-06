package com.btvn_buoi9.bai2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.dangKy("Duytv081298", "081298", "Duy", "08/12/1998", "Sinh Viên", 22);
        manager.dangKy("Xiaomi", "20192", "Redmi 5", "31/01/2018", "Điện thoại", 1);
        manager.dangKy("Strix", "111999", "steelseries", "25/05/2018","pad chuột", 2);
        manager.print();
        manager.dangNhap("Duytv081298", "081298");
        manager.doiMK("Duytv081298", "081298", "123456");
        manager.timKiem("Redmi 5");
        manager.xoaUser("Xiaomi", "20192");
        manager.timKiem("Redmi 5");
    }
}
