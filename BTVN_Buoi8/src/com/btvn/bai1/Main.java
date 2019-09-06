package com.btvn.bai1;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString("Dung  thu Tien em");
        System.out.println(myString.tong());
        myString.sapxep();
        System.out.println();
        myString.timChuHoa();
        myString.vietHoaChuCaiDau();
        myString.daonguoc();
        System.out.println(myString.tong1("hkjh213jkh598udsf7"));
        System.out.println(myString.tong2("hkjh213jkh598udsf7"));
        myString.xoaDauCach();
        System.out.println(myString.check());
        myString.boDau("dừng thu tiền em");
//        System.out.println(myString.convertStr("dừng thu tiền em"));
    }
}
