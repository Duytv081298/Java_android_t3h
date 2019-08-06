package com.t3h.connguoi;

public class ConNguoi {
    protected  String ten;
    protected  int tuoi;
    protected boolean gioitinh;
    protected  String diaChi;

    public ConNguoi(String ten, int tuoi, boolean gioitinh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.diaChi = diaChi;
    }
    public void InThongTin(){
        System.out.println("Tên: "+ ten);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("Giới Tính: "+ (gioitinh == true ? "Đực" : "Cái"));
        System.out.println("Địa chỉ: "+ diaChi);
    }
}
