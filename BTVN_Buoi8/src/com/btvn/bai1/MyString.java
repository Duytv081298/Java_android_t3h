package com.btvn.bai1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }
    public int tong(){
        int tong = 0;
        for (int i = 0; i < str.length() ; i++) {
            tong += (int)(str.charAt(i));
        }
        return tong;
    }
//    public void sapxep(){
//        for (int i = 0; i < str.length() -1 ; i++) {
//            for (int j = i+1; j < str.length(); j++) {
//                if (Integer.parseInt(String.valueOf(str.charAt(i))) > Integer.parseInt(String.valueOf(str.charAt(j)))){
//                        String a = String.valueOf(str.charAt(i));
//                        str = str.replaceFirst(String.valueOf(str.charAt(i)), String.valueOf(str.charAt(j)));
//                }
//
//            }
//        }
//    }

    public void sapxep(){
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            arr.add(str.charAt(i));
        }
        Collections.sort(arr);
        for (int i = 0; i <arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
    public void timChuHoa(){
        for (int i = 0; i < str.length() ; i++) {
            int a = (int)str.charAt(i);
            if((int)(str.charAt(i)) >= 65 && (int)(str.charAt(i)) <= 90){
                System.out.println(str.charAt(i));
            }
        }
    }
    public boolean check(){
        boolean b = true ;
        int len = str.length();
        if (len %2 ==0 ){
            int a = len/2;
            for (int i = len/2 -1; i >= 0; i--) {
                if ( str.charAt(i) == str.charAt(a) ){
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
                if ( str.charAt(i) == str.charAt(a) ){
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

    public void vietHoaChuCaiDau(){
        str = " " + str;
        int indexCach = str.indexOf(" ");
        while (indexCach != -1){
            String v = str.substring(indexCach, indexCach + 2);
            str = str.replace(v, v.toUpperCase());
            indexCach = str.indexOf(" ",indexCach+1);
        }
        str = str.trim();
        System.out.println(str);
    }
    public  void daonguoc(){
        String string = new StringBuffer(str).reverse().toString();
        System.out.println(string);
    }
    public int tong1(String string){
        int tong1 = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)<=57 && 48 <= string.charAt(i)){
                tong1 += Integer.parseInt(String.valueOf(string.charAt(i)));
            }
        }
        return tong1;
    }
    public int tong2(String string){
        int tong2 = 0;
        String value1 = "";
        int tongTam = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)<=57 && 48 <= string.charAt(i) && string.length()-1 == i) {
                value1 = String.valueOf(string.charAt(i));
                tongTam = tongTam * 10 + Integer.parseInt(value1);
                tong2 += tongTam;
            }else if (string.charAt(i)<=57 && 48 <= string.charAt(i)){
                value1 = String.valueOf(string.charAt(i));
                tongTam = tongTam *10 + Integer.parseInt(value1);
            } else {
                tong2 += tongTam;
                tongTam = 0;
            }
        }
        return tong2;
    }
    public void xoaDauCach(){
        str = str.replace("  ", " ");
        str = str.trim();
        System.out.println(str);
    }
    public void boDau(String a){
//        String str1= "";
//        for (int i = 0; i < str.length() ; i++) {
//            System.out.println(str.charAt(i));
//            System.out.println((int)str.charAt(i));
//
//
//        }
        a = a.replace("á","a");
        a = a.replace("à","a");
        a = a.replace("ạ","a");
        a = a.replace("ã","a");
        a = a.replace("ả","a");

        a = a.replace("ắ","a");
        a = a.replace("ă","a");
        a = a.replace("ằ","a");
        a = a.replace("ẵ","a");
        a = a.replace("ặ","a");
        a = a.replace("ẳ","a");

        a = a.replace("ấ","a");
        a = a.replace("â","a");
        a = a.replace("ẫ","a");
        a = a.replace("ậ","a");
        a = a.replace("ầ","a");
        a = a.replace("ẩ","a");


        a = a.replace("é","e");
        a = a.replace("è","e");
        a = a.replace("ẹ","e");
        a = a.replace("ẽ","e");
        a = a.replace("ẻ","e");

        a = a.replace("ê","e");
        a = a.replace("ế","e");
        a = a.replace("ề","e");
        a = a.replace("ễ","e");
        a = a.replace("ệ","e");
        a = a.replace("ể","e");

        a = a.replace("ì","i");
        a = a.replace("í","i");
        a = a.replace("ị","i");
        a = a.replace("ĩ","i");
        a = a.replace("ỉ","i");

        a = a.replace("ó","o");
        a = a.replace("ò","o");
        a = a.replace("ọ","o");
        a = a.replace("õ","o");
        a = a.replace("ỏ","o");

        a = a.replace("ô","o");
        a = a.replace("ố","o");
        a = a.replace("ồ","o");
        a = a.replace("ỗ","o");
        a = a.replace("ộ","o");
        a = a.replace("ổ","o");

        a = a.replace("ơ","o");
        a = a.replace("ớ","o");
        a = a.replace("ờ","o");
        a = a.replace("ợ","o");
        a = a.replace("ỡ","o");
        a = a.replace("ở","o");

        a = a.replace("ù","u");
        a = a.replace("ú","u");
        a = a.replace("ụ","u");
        a = a.replace("ũ","u");
        a = a.replace("ủ","u");

        a = a.replace("ư","u");
        a = a.replace("ứ","u");
        a = a.replace("ừ","u");
        a = a.replace("ự","u");
        a = a.replace("ữ","u");
        a = a.replace("ử","u");

        a = a.replace("ỹ","y");
        a = a.replace("ý","y");
        a = a.replace("ỳ","y");
        a = a.replace("ỵ","y");
        a = a.replace("ỷ","y");

        System.out.println(a);




//        return str1;
    }
//    public String convertStr(String str)
//    {
//        String[] mangA = new String[] { "a", "á", "à", "ạ", "ả", "ắ", "ằ", "ặ", "ẳ", "ẵ", "ấ", "ầ", "ậ", "ẩ", "ẫ" };
//        String[] mangE = new String[] { "e", "é", "è", "ẹ", "ẻ", "ẽ", "ê", "ế", "ề", "ệ", "ể", "ễ" };
//        for (int i = 0; i< mangA.length;i++){
//            str = str.replace(mangA[i], mangA[0]);
//        }
//        for (int i = 0; i< mangE.length;i++){
//            str = str.replace(mangE[i], mangE[0]);
//        }
//
//        return str;
//    }

}
