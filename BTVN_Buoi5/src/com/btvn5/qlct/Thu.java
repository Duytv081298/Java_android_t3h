package com.btvn5.qlct;

public class Thu extends DichVu {
    private int stThu;
    private String lyDo;
    private Nguoi nguoiThuHuong;

    @Override
    public void InTT() {
        System.out.println("Thông tin khoản chi: ");
        super.InTT();
        System.out.println("Lý do: " +lyDo);
        nguoiThuHuong.TTNguoi();
    }

    public int getStThu() {
        return stThu;
    }

    public void setStThu(int stThu) {
        this.stThu = stThu;
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
}
