package com.btvn_buoi6.bai3;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    private int n;
    private int [] arr;

    public  ArrayUtil(int n){
        this.n =n;
        arr = new int[n];

        Random rd = new Random();
        for (int i = 0; i <arr.length; i++) {
            arr[i] = rd.nextInt(50);
        }
    }
//    int arr[]={1,2,3,4,5,2,3,1,5,4,1,4,5,3,2};

    public void findTriangle(){
        System.out.println("Bộ 3 các vị trí liên tiếp có giá trị tạo thành 1 tam giác là: ");
        int cout = 0;
        for (int i = 0; i < arr.length -2; i++) {
            if (arr[i]+arr[i+1] > arr[i+2] && arr[i]+arr[i+2] > arr[i+1] && arr[i+1]+arr[i+2] > arr[i] && arr[i]  != 0 && arr[i+1] != 0 && arr[i+2] !=0 ){
                System.out.println(arr[i]+", "+arr[i+1]+", "+arr[i+2]);
                cout += 1;
            }
        }
        if(cout == 0){
            System.out.println("Không có bộ 3 các vị trí liên tiếp có giá trị tạo thành 1 tam giác");
        }
    }
    public int findSecondSmallestElement(){
        int check = -1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] != arr[i]){
                return arr[i];
            }
        }return check;
    }


    public void print(){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

}
