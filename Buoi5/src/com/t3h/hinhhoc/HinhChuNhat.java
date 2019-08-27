package com.t3h.hinhhoc;

public class HinhChuNhat extends HinhHoc {
    private float chieuRong;
    private float chieuDai;

    public HinhChuNhat(String tenHinh, float chieuRong, float chieuDai) {
        super(tenHinh);
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    @Override
    public void tinhChuVi() {
        float chuVi = 2*(chieuRong + chieuDai);
        System.out.println("Chu vi là: " +chuVi);
    }

    @Override
    public void tinhDienTich() {
        float dienTich = chieuRong * chieuDai;
        System.out.println("Diện tích là: " + dienTich);

    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
    }
    public void bienHinh(){
        System.out.println("Biến thành hình vuông");
    }

}
