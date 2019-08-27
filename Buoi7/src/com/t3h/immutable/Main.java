package com.t3h.immutable;

public class Main {
    public static void main(String[] args) {
        String str = "lúa nếp là lúa nếp làng lúa lên lớp lớp lòng nàng lâng lâng";
/*
        //Đếm số ký tự
        int len = str.length();
        System.out.println(len);
        //Lấy ra vị trí ký tự
        char c = str.charAt(2);
        System.out.println(c);
        // CHuyển ký tự sáng hệ thập phân
        int valueC = (int)c;
        System.out.println(valueC);
        // CHuyển từ số sáng ký tự
        int a = 65;
        char valueA = (char) a;
        System.out.println(valueA);
        // indexOf  lấy ra vị trí xuất hiện đầu tiên
        int index = str.indexOf("l");
        // Tìm kiếm từ sau vị trí 3 trở đi
        index = str.indexOf("l", 3);
        System.out.println(index);
        int lastIndex = str.lastIndexOf("l");
        System.out.println(lastIndex);
*/

        int cout =0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 108){
                System.out.println(i);
                cout += 1;
            }
        }
        System.out.println("Có " + cout + " vị trí chứa ký tự l");

        int indexL = str.indexOf("l");
        while (indexL != -1){
            System.out.println(indexL);
            indexL = str.indexOf("l",indexL+1);
        }

        // replaceFirst thay thế ký tự đầu tiên
        // replace thay thế toàn bộ ký tự trong chuỗi
        str = str.replaceAll("l", "L");
        System.out.println(str);
        //Cắt chuỗi (6,9]
        String str1 = str.substring(6,9);
        System.out.println(str1);
        //Viết hoa toàn bộ
        str = str.toUpperCase();
        System.out.println(str);
        //Viết thường toàn bộ
        str = str.toLowerCase();
        System.out.println(str);


        str = " " + str;
        int indexCach = str.indexOf(" ");
        while (indexCach != -1){
            String v = str.substring(indexCach, indexCach + 2);
            str = str.replace(v, v.toUpperCase());
            indexCach = str.indexOf(" ",indexCach+1);
        }
        // bỏ toàn bộ khoảng trắng tại đầu và đuôi
        str = str.trim();
        System.out.println(str);

        str = "Duytv_GCH17645_@fpt.edu.vn";
        // split sử dụng để cắt chuỗi và add vầ arr
        String[] arr = str.split("_");

        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // Kiểm tra chuỗi có chứa 1 chuỗi hay không
        str = "lúa nếp là lúa nếp làng lúa lên lớp lớp lòng nàng lâng lâng";
        boolean contain = str.contains("nếp làng");
        System.out.println(contain);

        //equals So sánh 2 đối tượng
        String s1 = "hello";
        String s2 = "hello";
        boolean equals = s1.equals(s2);
        System.out.println(equals);

        s1 = "hello";
        s2 = "Hello";
        // equalsIgnoreCase so sánh không phân biệt hoa thường
        boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
        System.out.println(equalsIgnoreCase);
        // compareTo Trừ lần lượt các ký tự sau khi chuyển đổi qua bảng mã
        // compare không biệt hoa thường
        int compare = s1.compareTo(s2);
        System.out.println(compare);

        // trả về giá trị ascii tại vị trí tìm kiếm
        int ascii = s1.codePointAt(0);
        System.out.println(ascii);


    }
}
