package com.btvn5.mammals;

public class Mammals {
    protected String chungLoai;
    protected String nguonGoc;
    protected String mauSac;
    protected String ten;
    protected String dacDiem;
    protected String dacTinh;
    protected int tuoi;


    public void MoTa(){
        System.out.println("Hiển thị mô tả: " +
                            "\nChủng loài: " + chungLoai
                          + "\nNguồn gốc: " + nguonGoc
                          + "\nMàu sắc: " + mauSac
                          + "\nTên : " + ten
                          + "\nTuổi: " + tuoi
                          + "\nĐặc điểm: " + dacDiem
                          + "\nĐặc Tính: " + dacTinh);
    }
    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDacDiem() {
        return dacDiem;
    }

    public void setDacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }

    public String getDacTinh() {
        return dacTinh;
    }

    public void setDacTinh(String dacTinh) {
        this.dacTinh = dacTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
