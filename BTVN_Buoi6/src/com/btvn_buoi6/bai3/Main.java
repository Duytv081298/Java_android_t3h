package com.btvn_buoi6.bai3;

public class Main {
    public static void main(String[] args) {
        ArrayUtil arr = new ArrayUtil(10);

        arr.print();
        System.out.println();
        arr.findTriangle();

        if (arr.findSecondSmallestElement()>=0 ){
            System.out.print("Giá trị nhỏ thứ 2 của dãy: " + arr.findSecondSmallestElement() );
        }else System.out.println("Không tồn tại giá trị bé thứ 2");

    }
}
