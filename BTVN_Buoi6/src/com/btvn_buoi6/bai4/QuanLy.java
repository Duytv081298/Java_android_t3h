package com.btvn_buoi6.bai4;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<DanhBa> listDB = new ArrayList<>();

    public boolean ktTonTai(int gtSĐT){

        for (int i = 0; i <  listDB.size(); i++) {
            if (listDB.get(i).getSdt() == gtSĐT ){

                return true;
            }
        }
        return false;
    }

    public void addDanhBa(String ten, int sdt){
        boolean check = ktTonTai(sdt);
        if (check == true){
            System.out.println("Danh bạ này đã tồn tại");
        }else {
            DanhBa db = new DanhBa(ten, sdt);
            listDB.add(db);
            System.out.println("Đã thêm danh bạ thành công");
        }
    }

    public void update(int sdt, int sdtm){
        for (int i = 0; i <  listDB.size(); i++) {
            if (listDB.get(i).getSdt() == sdt ){
                String gtTen = listDB.get(i).getTen();
                DanhBa db = new DanhBa(gtTen, sdtm);
                listDB.set(i, db);
                System.out.println("Đã sửa danh bạ thành công");
                break;
            }System.out.println("Danh bạ này không tồn tại");
        }
    }


    public void print(){
        for (DanhBa db : listDB){
            System.out.println("Tên Danh Bạ: " + db.getTen() );
            System.out.println("Số Điện Thoại Danh Bạ: " + db.getSdt() );
            System.out.println("========================");
        }
    }
}
