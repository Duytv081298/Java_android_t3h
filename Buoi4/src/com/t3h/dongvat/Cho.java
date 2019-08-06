package com.t3h.dongvat;

public class Cho extends DongVat {
    private boolean domDuoi;
    private  boolean huyenDe;

    public Cho(String ten, int tuoi, boolean gioitinh, String loai, boolean domDuoi, boolean huyenDe) {
        super(ten, tuoi, gioitinh, loai);
        this.domDuoi = domDuoi;
        this.huyenDe = huyenDe;
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Đốm Đuôi" + (domDuoi == true ? "Có" : "Không"));
        System.out.println("Đốm Đuôi" + (huyenDe == true ? "Có" : "Không"));
    }
    public void Koinha(){
        System.out.println("Sua koi nhà");
    }
    public void Boi(){
        System.out.println("Biết bơi");
    }
}
