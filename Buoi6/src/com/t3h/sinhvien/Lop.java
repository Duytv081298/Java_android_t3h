package com.t3h.sinhvien;

import java.util.ArrayList;
import java.util.Comparator;

public class Lop {

    ArrayList<SinhVien> sinhViens = new ArrayList<>();

    private  int check(String mSV){
        for (int i = 0; i <  sinhViens.size(); i++) {
            if (sinhViens.get(i).getmSV().equals(mSV)){
                return i;
            }
        }
        return -1;
    }

    public  void add(SinhVien sinhvien){
        if (check(sinhvien.getmSV()) == -1){
            sinhViens.add(sinhvien);
        }else {
            System.out.println("Sinh viên đã tồn tại");
        }
    }

    public void update(SinhVien sv){
        int index = check(sv.getmSV());
        if (index >= 0){
            sinhViens.set(index, sv);
        }else {
            System.out.println("Sinh viên không tồn tại");
        }
    }

    public  void delete(String mSV){
        int index = check(mSV);
        if (index >= 0){
            sinhViens.remove(index);
        }else {
            System.out.println("Sinh viên không tồn tại");
        }
    }

    public  void sort(){
        sinhViens.sort(comparator);

    }
    Comparator<SinhVien> comparator = new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            if (sv1.getDiem() > sv2.getDiem()){
                return 1;
            }
            return -1;
        }
    };

    public void print(){
        for (SinhVien sinhVien : sinhViens){
            sinhVien.inThongTin();
            System.out.println("========================");
        }
    }



}
