package com.t3h.dongvat;

public class Meo extends DongVat {
    public Meo(String ten, int tuoi, boolean gioitinh, String loai) {
        super(ten, tuoi, gioitinh, loai);
    }
    public void Batchuot(){
        System.out.println("Biết bắt chuột");
    }
    public void Treocay(){
        System.out.println("Biết trèo cây");
    }
}
