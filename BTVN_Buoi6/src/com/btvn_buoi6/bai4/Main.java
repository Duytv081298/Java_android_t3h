package com.btvn_buoi6.bai4;

public class Main {
    public static void main(String[] args) {
//        DanhBa db1 = new DanhBa("Tên số 1", 846954979);
//        DanhBa db2 = new DanhBa("Tên Số 2", 64561489);
//        DanhBa db3 = new DanhBa("Tên số 3", 568465468);

        QuanLy ql = new QuanLy();
        ql.addDanhBa("Tên số 1", 846954979);
        ql.addDanhBa("Tên Số 2", 64561489);
        ql.addDanhBa("Tên số 3", 568465468);

        ql.update(846954979, 555555555);
        ql.print();
    }
}
