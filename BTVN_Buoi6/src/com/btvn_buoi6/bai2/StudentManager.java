package com.btvn_buoi6.bai2;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    private  int check(String id){
        for (int i = 0; i <  students.size(); i++) {
            if (students.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public  void addStudents(Student student){
        if (check(student.getId()) == -1){
            students.add(student);
        }else {
            System.out.println("Sinh viên đã tồn tại");
        }
    }
    public void print(){
        int cout = 0;
        if(cout<5){
            for (Student student : students){
                System.out.println(student.toString());
                System.out.println("========================");
                cout +=1;
            }
        }
    }
    public void findStudentByScore(float score){
        System.out.println("Sinh viên có điểm bằng: ");
        for (int i = 0; i <  students.size(); i++) {
            if (students.get(i).getScore() == score){
                System.out.println(students.get(i).toString());
            }else {
                System.out.println("Không có sinh viên tồn tại!!!!");
                break;
            }
        }

    }

}
