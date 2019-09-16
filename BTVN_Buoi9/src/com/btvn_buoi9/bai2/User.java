package com.btvn_buoi9.bai2;

public class User {
    private String userName, password, name, dateOfBirth, job;
    private int age;

    public User(String userName, String password, String name, String dateOfBirth, String job, int age) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void showInfor(){
        System.out.println("Name: " + name);
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Job: " + job  );
    }
    public String changePassword(String password){
        if ( password == this.password){
            this.password = password;
            System.out.println("Đổi mật khẩu thành công");
            return password;
        }
        System.out.println("Mật khẩu không hợp lệ");
        return "";
    }
}
