package com.btvn5.qlct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class No extends DichVu {
    private int stNo;
    private int thoihan;
    private String ngayTra;
    private String lyDo;
    private int laiSuat;
    private boolean xnTra;
    private Nguoi nguoiChoNo;
    @Override
    public void InTT() {
        System.out.println("Thông tin khoản vay: ");
        super.InTT();
        System.out.println("Số tiền nợ: " +stNo);
        System.out.println("Thời hạn: " +thoihan);
        System.out.println("Ngày Trả: " +ngayTra);
        System.out.println("Lý do: " +lyDo);
        System.out.println("Lãi Suất: " +laiSuat);
        nguoiChoNo.TTNguoi();
        System.out.println("Xác Nhận Trả: "+ (xnTra == true ? "Đã Trả" : "Chưa trả"));
    }

    public int getStNo() {
        return stNo;
    }

    public void setStNo(int stNo) {
        this.stNo = stNo;
    }

    public int getThoihan() {
        return thoihan;
    }

    public void setThoihan(int thoihan) {
        this.thoihan = thoihan;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dates = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
        String date = formatter.format(dates);
        this.ngayTra = date;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public boolean isXnTra() {
        return xnTra;
    }

    public void setXnTra(boolean xnTra) {
        this.xnTra = xnTra;
    }

    public Nguoi getNguoiChoNo() {
        return nguoiChoNo;
    }

    public void setNguoiChoNo(Nguoi nguoiChoNo) {
        this.nguoiChoNo = nguoiChoNo;
    }
}
