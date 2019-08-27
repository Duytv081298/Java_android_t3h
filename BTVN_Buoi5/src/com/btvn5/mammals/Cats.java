package com.btvn5.mammals;

public class Cats extends Mammals {
    private String nhinTrongBongDem;
    public void keu(){
        System.out.println("Mèo kêu meo meo     ");
    }
    public void BatChuot(){
        System.out.println("Bắt con chuột:  ");
    }
    public void SSBatChuot(){
        System.out.println("So sánh khả năng bắt chuột:     ");
    }

    public String getNhinTrongBongDem() {
        return nhinTrongBongDem;
    }

    public void setNhinTrongBongDem(String nhinTrongBongDem) {
        this.nhinTrongBongDem = nhinTrongBongDem;
    }
}
