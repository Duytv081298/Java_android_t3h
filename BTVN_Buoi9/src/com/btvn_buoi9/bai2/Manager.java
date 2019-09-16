package com.btvn_buoi9.bai2;
import java.util.ArrayList;
public class Manager {
    ArrayList<User> arrayUser = new ArrayList<>();

    public int check(String userName){
        for (int i = 0; i <  arrayUser.size(); i++) {
            if (arrayUser.get(i).getUserName().equals(userName)){
                return i;
            }
        }
        return -1;
    }
    public  void dangKy(String userName, String password, String name, String dateOfBirth, String job, int age){
            if (check(userName)>=0){
                System.out.println("Đăng ký thất bại");
            }else {
                User user = new User(userName,password, name ,dateOfBirth, job, age);
                arrayUser.add(user);
                System.out.println("Đăng ký thành công");
            }
    }

    public int checkThongTin(String userName, String password){
        for (int i = 0; i < arrayUser.size() ; i++) {
            if(arrayUser.get(i).getUserName().equals(userName) && arrayUser.get(i).getPassword().equals(password) ){
                return i;
            }
        }
        return -1;
    }

    public void dangNhap(String userName, String password){
        if (checkThongTin(userName, password) == -1){
            System.out.println("Tài khoản hoặc mật khẩu không đúng");
        }else {
            System.out.println("Đăng nhập thành công");
            System.out.println("Vị trí của user là: " + checkThongTin(userName, password));
        }
    }

    public void doiMK(String userName, String password, String newPassword){
        int index = checkThongTin(userName, password);
        String password1 = arrayUser.get(index).changePassword(password);
        if (index >= 0 && password1 != ""){
            String name = arrayUser.get(index).getName();
            String dateOfBirth = arrayUser.get(index).getDateOfBirth();
            String job = arrayUser.get(index).getJob();
            int age = arrayUser.get(index).getAge();
            User user = new User(userName,newPassword, name ,dateOfBirth, job, age);
            arrayUser.set(index, user );
            System.out.println("Thông tin tài khoản hiện tại của bạn là: ");
            arrayUser.get(index).showInfor();
        }else {
            System.out.println("Đổi mật khẩu thất bại!");
        }
    }

    public void xoaUser(String userName, String password){
        int index = checkThongTin(userName, password);
        if (index >= 0){
            arrayUser.remove(index);
            System.out.println("Xóa User thành công!");
        }else{
            System.out.println("Xóa không thành công!");
        }
    }

    public void timKiem(String name){
        int a = 0;
        for (int i = 0; i <  arrayUser.size(); i++) {
            if (arrayUser.get(i).getName().equals(name)){
                arrayUser.get(i).showInfor();
                a += 1;
            }
        }
        if(a == 0){
            System.out.println("User tìm kiếm không tồn tại");
        }
    }
    public void print () {
        for (User news : arrayUser) {
            news.showInfor();
            System.out.println("========================");
        }
    }
}
