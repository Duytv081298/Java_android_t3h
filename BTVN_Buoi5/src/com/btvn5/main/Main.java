package com.btvn5.main;

import com.btvn5.qlct.*;

import java.sql.Date;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Nguoi nguoiThuHuong = new Nguoi();
        Nguoi nguoiVay = new Nguoi();
        Nguoi nguoiChoVay = new Nguoi();
        nguoiThuHuong.setTen("Lớp LAND1602E");
        nguoiThuHuong.setCmt("3213445");
        nguoiVay.setTen("Chị Hồng");
        nguoiVay.setCmt("12321321");
        nguoiChoVay.setTen("Thắm");
        nguoiChoVay.setCmt("65346546");

        Chi khoanChi = new Chi();

        khoanChi.setLyDo("Mua đồ " +
                "sinh nhật " +
                "các bạn " +
                "tháng 3");
        khoanChi.setStChi(300000);
        khoanChi.setDiaDiem("Lớp LAND1602E");
        khoanChi.setThoiGian("20/03/2016");

        Thu khoanThu = new Thu();
        khoanThu.setLyDo("Lương tháng 3");
        khoanThu.setStThu(5000000);
        khoanThu.setDiaDiem("Cty FPT");
        khoanThu.setThoiGian("19/03/2016");

        Vay khoanVay = new Vay();
        khoanVay.setLyDo("Vay mua tủ lạnh");
        khoanVay.setXnTra(true);
        khoanVay.setNgayTra("12/03/2016");
        khoanVay.setLaiSuat(0);
        khoanVay.setThoihan(7);
        khoanVay.setStVay(1000000);
        khoanVay.setDiaDiem("Nhà riêng");
        khoanVay.setThoiGian("12/03/2016");

        No khoanNo = new No();
        khoanNo.setXnTra(false);
        khoanNo.setNgayTra("18/05/2016");
        khoanNo.setLaiSuat(1000);
        khoanNo.setThoihan(60);
        khoanNo.setLyDo("Vay mua may giặt");
        khoanNo.setStNo(10000000);
        khoanNo.setDiaDiem("Ngân hàng");
        khoanNo.setThoiGian("18/03/2016");


        System.out.println("Thông tin khoản chi: \n"+
        "================================ \n"+
        "Người thụ hưởng: "+ nguoiThuHuong.getTen()+"\n"+
        "Số chứng minh thư người thụ hưởng: " + nguoiThuHuong.getCmt()+"\n"+
        "Lý do: "+ khoanChi.getLyDo()+"\n"+
        "Số tiền" + khoanChi.getStChi()+"\n"+
        "Địa điểm: "+ khoanChi.getDiaDiem()+"\n"+
        "Thời gian: "+khoanChi.getThoiGian());

        boolean xnTra = khoanVay.isXnTra();

        System.out.println("\n\n\n");
        System.out.println("Thông tin khoản vay: \n"+
        "================================ \n"+
        "Người vay: "+ nguoiVay.getTen()+"\n"+
        "Số chứng minh thư người thụ hưởng: " + nguoiVay.getCmt()+"\n"+
        "Lý do: "+ khoanVay.getLyDo()+"\n"+
        "Xác Nhận Trả: "+ (xnTra == true ? "Đã Trả" : "Chưa trả")+"\n"+
        "Lãi xuất: "+ khoanVay.getLaiSuat()+"\n"+
        "Thời hạn: "+ khoanVay.getThoihan()+"\n"+
        "Số tiền vay: "+ khoanVay.getStVay()+"\n"+
        "Địa điểm: "+ khoanVay.getDiaDiem()+"\n"+
        "Thời gian: "+khoanVay.getThoiGian());

        System.out.println("\n\n\n");
        boolean xnNo = khoanNo.isXnTra();
        System.out.println("Thông tin khoản nợ: \n"+
        "================================ \n"+
        "Người vay: "+ nguoiChoVay.getTen()+"\n"+
        "Số chứng minh thư người thụ hưởng: " + nguoiChoVay.getCmt()+"\n"+
        "Lý do: "+ khoanNo.getLyDo()+"\n"+
        "Xác Nhận Trả: "+ (xnNo == true ? "Đã Trả" : "Chưa trả")+"\n"+
        "Lãi xuất: "+ khoanNo.getLaiSuat()+"\n"+
        "Thời hạn: "+ khoanNo.getThoihan()+"\n"+
        "Số tiền vay: "+ khoanNo.getStNo()+"\n"+
        "Địa điểm: "+ khoanNo.getDiaDiem()+"\n"+
        "Thời gian: "+khoanNo.getThoiGian());

        System.out.println("\n\n\n");
        System.out.println("Thông tin khoản thu: \n"+
        "================================ \n"+
        "Người thụ hưởng: "+ nguoiChoVay.getTen()+"\n"+
        "Số chứng minh thư người thụ hưởng: " + nguoiChoVay.getCmt()+"\n"+
        "Lý do: "+ khoanThu.getLyDo()+"\n"+
        "Số tiền" + khoanThu.getStThu()+"\n"+
        "Địa điểm: "+ khoanThu.getDiaDiem()+"\n"+
        "Thời gian: "+khoanThu.getThoiGian());

    }
}
