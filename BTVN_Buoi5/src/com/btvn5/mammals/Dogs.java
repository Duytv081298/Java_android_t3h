package com.btvn5.mammals;

public class Dogs extends Mammals {
    private String danhHoi;
    public void Sua(){
        System.out.println("Chó sủa:    ");
    }
    public void CoiNha(){
        System.out.println("Chó Koi Nhà:    ");
    }
    public void SsDanhHoi(){
        System.out.println("So Sánh Khả Năng Đánh Hơi:  ");
    }

    public String getDanhHoi() {
        return danhHoi;
    }

    public void setDanhHoi(String danhHoi) {
        this.danhHoi = danhHoi;
    }

}
