package com.t3h.hinhhoc;

public class HinhTron extends HinhHoc {
    private float r ;
    private final float PI = 3.14f;   // final hằng số không thể thay đổi, các ký thự viết hoa và phân cách dùng dấu "_" vd: SO_PI   || Ngăn chặn việc thay đổi giá trị

    public HinhTron(String tenHinh, float r) {
        super(tenHinh);
        this.r = r;
    }

    @Override
    public void tinhChuVi() {
        float chuVi = 2 *PI * r;
        System.out.println("Chu vi là: " +chuVi);
    }

    @Override
    public void tinhDienTich() {
        float dienTich = PI*r*r;
        System.out.println("Diện tích là: " + dienTich);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Bán kính: " +r);
    }
    public void xoayTron(){
        System.out.println("Xoay Tròn");
    }

    public void setR(float r) {
        this.r = r;
    }

}
