package com.t3h.mangdong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(2);
        arr.add(5);
        arr.add(1,100);

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(88);
        arr1.add(888);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(99);
        arr1.add(999);

        arr.addAll(arr1);
        arr.addAll(1, arr2);
        arr.set(2,10000000);

        arr.remove(2);

//        arr.clear();

//        Random rd = new Random();
//        for (Integer i = 0; i <arr.size(); i++){
//            arr.add(i) = rd.Next(100);
//        }

        // Đảo chiều
        Collections.reverse(arr);
        //đảo ngẫu nhiên
        Collections.shuffle(arr);


        // sắp xếp tăng dần
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1 -t2;
            }
        });

        int size = arr.size();
        System.out.println(size);
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }
    }
}
