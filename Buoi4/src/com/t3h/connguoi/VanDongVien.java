package com.t3h.connguoi;

import com.t3h.dongvat.Cho;

public class VanDongVien extends  ConNguoi {
    private int soAo;
    private  String cauLacBo;
    private  String viTri;
    private Cho cho;

    public VanDongVien(String ten, int tuoi, boolean gioitinh, String diaChi, int soAo, String cauLacBo, String viTri, Cho cho) {
        super(ten, tuoi, gioitinh, diaChi);
        this.soAo = soAo;
        this.cauLacBo = cauLacBo;
        this.viTri = viTri;
        this.cho = cho;
    }

    public void datChoDiDao(){
        System.out.println("Dắt chó đi dạo");
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Số Áo: "+ soAo);
        System.out.println("Câu Lạc Bộ: "+ cauLacBo);
        System.out.println("Vị Trí: "+ viTri);
        System.out.println("Thông Tin Thú Cưng");
        cho.InThongTin();
        cho.Boi();
        cho.Koinha();
    }
}
