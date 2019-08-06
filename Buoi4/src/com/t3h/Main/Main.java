package com.t3h.Main;

import com.t3h.connguoi.NguoiMau;
import com.t3h.connguoi.VanDongVien;
import com.t3h.dongvat.Cho;
import com.t3h.dongvat.Meo;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("Tâm Chó", 5, true, "alaska", true, false);
        Meo meo = new Meo("Thắm Mèo", 2, true, "Mướp");
        VanDongVien vdv = new VanDongVien("Trần Đức Lương", 20, true, "Hà Nam", 7, "MU", "Chạy Cánh", cho);
        NguoiMau nm = new NguoiMau("Cao Kỳ Duyên", 25, true, "Tuyên Quang", 154, 90,90,90);
        vdv.InThongTin();
        vdv.datChoDiDao();
        System.out.println("=============================");
        nm.InThongTin();
        nm.DatMeo();

    }
}
