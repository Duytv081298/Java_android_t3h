package com.t3h.sinhvien;

public class SinhVien {
    private String mSV;
    private String ten;
    private int tuoi;
    private Boolean gioiTInh;
    private float diem;



    public void  inThongTin(){
        System.out.println("Mã Sinh Viên: " + mSV);
        System.out.println("Tên Sinh Viên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm Sinh Viên: " + diem);
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Boolean getGioiTInh() {
        return gioiTInh;
    }

    public void setGioiTInh(Boolean gioiTInh) {
        this.gioiTInh = gioiTInh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public SinhVien(String mSV, String ten, int tuoi, Boolean gioiTInh, float diem) {
        this.mSV = mSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTInh = gioiTInh;
        this.diem = diem;
    }
}
