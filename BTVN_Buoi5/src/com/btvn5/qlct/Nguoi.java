package com.btvn5.qlct;

public class Nguoi {
    private String ten;
    private String cmt;
    public void TTNguoi(){
        System.out.println("Tên: " + ten +
                "Số chứng minh thư nhân dân: "+ cmt );
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
}
