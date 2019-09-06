package com.btvn_buoi7.bai1;

public class MyString {
    private String value = "15a8ndr01oi12d";

//    public MyString(String value) {
//        this.value = value;
//    }

    public int tong1(){
        int tong1 = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i)<=57 && 48 <= value.charAt(i)){
                tong1 += Integer.parseInt(String.valueOf(value.charAt(i)));
            }
        }
        return tong1;
    }
    public int tong2(){
        int tong2 = 0;
        String value1 = "";
        int tongTam = 0;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i)<=57 && 48 <= value.charAt(i) && value.length()-1 == i) {
                value1 = String.valueOf(value.charAt(i));
                tongTam = tongTam * 10 + Integer.parseInt(value1);
                tong2 += tongTam;
            }else if (value.charAt(i)<=57 && 48 <= value.charAt(i)){
                value1 = String.valueOf(value.charAt(i));
                tongTam = tongTam *10 + Integer.parseInt(value1);
            } else {
                tong2 += tongTam;
                tongTam = 0;
            }
        }
        return tong2;
    }
    public boolean check(){
        boolean b = true ;
        int len = value.length();
        if (len %2 ==0 ){
            int a = len/2;
            for (int i = len/2 -1; i >= 0; i--) {
                if ( value.charAt(i) == value.charAt(a) ){
                    b = true;
                }else {
                    b = false;
                    break;
                }
                a += 1;
            }
        }else {
            int a = len/2 + 1;
            for (int i = len/2-1; i >= 0 ; i--) {
                if ( value.charAt(i) == value.charAt(a) ){
                    b = true;
                }else
                {
                    b = false;
                    break;
                }
                a += 1;

            }
        }
        return b;
    }

}
