package com.t3h.dongvat;

public class DongVat {
    protected  String ten;
    protected  int tuoi;
    protected boolean gioitinh;
    protected  String loai;

    public DongVat(String ten, int tuoi, boolean gioitinh, String loai) {  //alt insert
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.loai = loai;
    }
    public void InThongTin(){
        System.out.println("Tên: "+ ten);
        System.out.println("Tuổi: "+ tuoi);
        System.out.println("Giới Tính: "+ (gioitinh == true ? "Đực" : "Cái"));
        System.out.println("Loài: "+ loai);
    }
}
