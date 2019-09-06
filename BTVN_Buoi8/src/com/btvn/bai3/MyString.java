package com.btvn.bai3;

public class MyString {
    private String numA, numB;

    public MyString(String numA, String numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public  String hieu(){
        int  term = 0;
        int soDu = 0;
        String hieu = "";
        String conA ="";
        if (numA.length() > numB.length()){
            conA = numA.substring(numA.length() -numB.length());
        }else {
            conA = numA;
        }

        for (int i = 1; i <= conA.length() ; i++) {
            soDu = 0;
            term = (int)conA.charAt(conA.length()-i) - (int)numB.charAt(numB.length()-i) - soDu;
            if (term < 0){
                soDu = 1;
                term = (int)conA.charAt(conA.length()-i) + 10 - (int)numB.charAt(numB.length()-i) - soDu;
            }
            hieu = term + hieu;
        }
        String conLai = "0";
        if (numA.length() > numB.length()){
            conLai = numA.substring(0, numA.length() -numB.length());
        }
        int conLai1 = Integer.parseInt(conLai) - soDu;
        hieu =  conLai1 + hieu;
        return hieu;
    }
    public  String tong(){
        int term = 0;
        int nho = 0;
        String tong = "";
        String conA ="";
        if (numA.length() > numB.length()){
            conA = numA.substring(numA.length() -numB.length());
        }else {
            conA = numA;
        }
        for (int i = 1; i <= conA.length() ; i++) {
            nho = 0;
            term = Integer.parseInt(String.valueOf(conA.charAt(conA.length()-i))) + Integer.parseInt(String.valueOf(numB.charAt(numB.length()-i))) + nho;
            if (term >=10){
                nho = 1;
                term = term = Integer.parseInt(String.valueOf(conA.charAt(conA.length()-i))) + Integer.parseInt(String.valueOf(numB.charAt(numB.length()-i))) + nho - 10;
            }
            tong = term + tong;
        }
        String conLai = "0";
        if (numA.length() > numB.length()){
            conLai = numA.substring(0, numA.length() -numB.length());
        }else {
            conLai = numB.substring(0, numB.length() -numA.length());
        }
        int conLai1 = Integer.parseInt(conLai) + nho;
        tong =  conLai1 + tong;
        return tong;
    }




}
