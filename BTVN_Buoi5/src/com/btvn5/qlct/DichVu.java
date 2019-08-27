package com.btvn5.qlct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.sql.Date.valueOf;

public class DichVu {
    private String thoiGian;
    private String diaDiem;
    public void InTT(){
        System.out.println("Thời gian: " + thoiGian +
                           "\nĐịa điểm: "+ diaDiem );
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dates = new SimpleDateFormat("dd/MM/yyyy").parse(thoiGian);
        String date = formatter.format(dates);
        this.thoiGian = date;
    }



    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
}
