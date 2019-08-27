package com.btvn_buoi6.bai2;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("GCH17645","Không Có Tên" ,7.6f);
        Student st6 = new Student("GCH17324","Test thêm" ,7.6f);
        Student st2 = new Student("GCH17345","Mất Tên Rồi" ,5.7f);
        Student st3 = new Student("GCH17987","Đừng Hỏi Lại" ,8.6f);
        Student st4 = new Student("GCH17285","Tên Trùng Lặp" ,9.5f);
        Student st5 = new Student("GCH17594","Nhập Lại Tên" ,7.3f);

        StudentManager manager = new StudentManager();
        manager.addStudents(st1);
        manager.addStudents(st2);
        manager.addStudents(st3);
        manager.addStudents(st4);
        manager.addStudents(st5);
        manager.addStudents(st6);

        manager.print();

        manager.findStudentByScore(7.6f);


    }
}
