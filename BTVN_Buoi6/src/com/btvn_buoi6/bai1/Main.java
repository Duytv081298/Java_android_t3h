package com.btvn_buoi6.bai1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,2,3,1,5,4,1,4,5,3,2};

        System.out.println("Hai số liên tiếp có tổng nhỏ hơn 8 là:");
        for (int i = 0; i < arr.length -1; i++) {
            int j = i +1;
            if (arr[i]+arr[j] < 8 ){
                System.out.println(arr[i] + " + " + arr[j] +" = "+ (arr[i]+arr[j]) + " < 8");
            }
        }

        for (int i = 0; i < arr.length -2; i++) {
            int tong = arr[i]+arr[i+1]+arr[i+2];
            for (int j = i+1; j < arr.length -2 ; j++) {
                if (arr[j] + arr[j + 1] + arr[j + 2] == tong) {
                    System.out.println(arr[i] + " + " + arr[i + 1] + " + " + arr[i + 2] + "  =  " + arr[j] + " + " + arr[j + 1] + " + " + arr[j + 2] + " = " + tong);
                    System.out.println(arr[i] + " Vị Trí: " + i);
                    System.out.println(arr[i + 1] + " Vị Trí: " + (i + 1));
                    System.out.println(arr[i + 2] + " Vị Trí: " + (i + 2));
                    System.out.println(arr[j] + " Vị Trí: " + j);
                    System.out.println(arr[j + 1] + " Vị Trí: " + (j + 1));
                    System.out.println(arr[j + 2] + " Vị Trí: " + (j + 2));
                }
            }

        }

        Arrays.sort(arr);

        System.out.print("Giá trị nhỏ thứ 2 của dãy: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[1] != arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }

        Comparator<Integer > comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2 - t1;
            }
        };
        Arrays.sort(arr, comparator);


        //in mảng
        System.out.println("Dãy đã sắp xếp theo thứu tự giảm dần");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
