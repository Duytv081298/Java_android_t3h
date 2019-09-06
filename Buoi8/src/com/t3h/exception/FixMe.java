package com.t3h.exception;

import javafx.util.Builder;

public class FixMe {
    private StringBuilder builder;

    public  FixMe(){
        builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" World");
    }
    public  void sumDigit(){
        int sum = 0;
        for (int i = 0; i <builder.length() ; i++) {
            if(i % 2 == 0 && i+3 < builder.length()){
                sum += builder.codePointAt(i+3);

            }else {
                sum += builder.codePointAt(i);
            }
        }
        System.out.println(sum);
    }
}
