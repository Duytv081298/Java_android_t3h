package com.t3h.mangtinh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MangTinh {
    private Integer [] arr = new Integer[10];
    private Random rd = new Random();


    public  MangTinh(){
        for (int i = 0; i <arr.length; i++){
            arr[i] = rd.nextInt(100);
        }
    }


    public void InMang(){
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public  void SSTangDan(){
//        for (int i = 0; i < arr.length -1; i++) {
//            for (int j = i+1; j < arr.length ; j++) {
//                if (arr[i] > arr[j]){
//                    int a = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = a;
//                }
//            }
//        }
        Arrays.sort(arr, comparator);  // Chỉ ss theo chiều tăng dần Arrays.sort(arr;

    }
    private Comparator<Integer > comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer t1, Integer t2) {
            return t1 - t2;
        }
    };


}


