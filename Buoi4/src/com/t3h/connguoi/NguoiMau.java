package com.t3h.connguoi;

import com.t3h.dongvat.Meo;

public class NguoiMau extends ConNguoi {
    private  int chieuCao;
    private int v1;
    private int v2;
    private int v3;
    private Meo meo;

    public NguoiMau(String ten, int tuoi, boolean gioitinh, String diaChi, int chieuCao, int v1, int v12, int v3) {
        super(ten, tuoi, gioitinh, diaChi);
        this.chieuCao = chieuCao;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public void MuaSam(){
        System.out.println("Đi Mua Sắm");
    }
    public void DatMeo(){
        System.out.println("Dắt Mèo");
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Chiều Cao: "+ chieuCao + " cm");
        System.out.println("Số đo ba vòng: ");
        System.out.println("Vòng 1: "+ v1);
        System.out.println("Vòng 2: "+ v2);
        System.out.println("Vòng 3: "+ v3);
        System.out.println("Thông Tin Thú Cưng");
        meo.InThongTin();
        meo.Batchuot();
        meo.Treocay();
    }
}
