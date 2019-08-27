package com.t3h.sinhvien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("GCH17645","Tống Ra Đường", 100, true,100.f);
        SinhVien sv2 = new SinhVien("GCH17643","Trui Gầm Cầu", 65, false,45.f);
        SinhVien sv3 = new SinhVien("GCH17667","Bắt Về Phường", 56, true,67.f);
        SinhVien sv4 = new SinhVien("GCH17667","Ngồi Bóc Lịch", 23, true,63.f);


        Lop lop1 = new Lop();
        lop1.add(sv1);
        lop1.add(sv2);
        lop1.add(sv3);
        lop1.add(sv4);

        lop1.print();
//        System.out.println("=====================================================================");
//        lop1.delete("GCH17643");
//        lop1.print();

//        System.out.println("=====================================================================");
//        lop1.sort();
//        lop1.print();

        System.out.println("=====================================================================");
        lop1.update(sv3);
        lop1.print();

    }
}
