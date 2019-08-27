package com.btvn5.qlct;

public class Chi extends DichVu {
    private int stChi;
    private String lyDo;
    private Nguoi nguoiThuHuong;

    @Override
    public void InTT() {
        System.out.println("Thông tin khoản chi: ");
        super.InTT();
        System.out.println("Lý do: " +lyDo);

    }

    public int getStChi() {
        return stChi;
    }

    public void setStChi(int stChi) {
        this.stChi = stChi;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public Nguoi getNguoiThuHuong() {
        return nguoiThuHuong;
    }

    public void setNguoiThuHuong(Nguoi nguoiThuHuong) {
        this.nguoiThuHuong = nguoiThuHuong;
    }

    @Override
    public String getDiaDiem() {
        return super.getDiaDiem();
    }

    @Override
    public String getThoiGian() {
        return super.getThoiGian();
    }

}
