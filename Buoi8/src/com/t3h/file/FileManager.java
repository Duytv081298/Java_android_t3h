package com.t3h.file;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;

public class FileManager {
    /*  Sử dụng đẻ quản lý
        Đọc, ghi
    */
    String path = "D:/T3Hs/Java_android_t3h/Buoi7/test_file/Info.txt";
    public void getFile(){
        File f = new File(path);
        boolean exists = f.exists();
        System.out.println(exists);
        if (exists == true){
            System.out.println(f.getName());
            System.out.println(f.length());
            long time = f.lastModified();
            System.out.println(time);
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println(format.format(time));
        }else {
            try {
                f.getParentFile().mkdir();
                f.createNewFile();
                System.out.println("Create success ^ - ^");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void readAllFile(File file){
        try{
            File[] files = file.listFiles();
            for (File f: files) {
                if (f.isDirectory()){
                    readAllFile(f);
                }else {
                    System.out.println(f.getName());
                }
            }
        }catch (Exception ex){

        }

    }
    public void write(){
        File f = new File(path);
        try{
            boolean exists = f.exists();
            if(exists == false){
                f.getParentFile().mkdir();
                f.createNewFile();
                System.out.println("Create success ^ - ^");
            }
            //in output: thực thi trên internet. FileoutputStrem dùng ở local
            FileOutputStream out = new FileOutputStream(f, true); // true để ghi tiếp (txt, word), false để ghi lại toàn bộ(Video, ảnh)
            String str = "Hello World\n";
            out.write(str.getBytes());
            out.write(str.getBytes());
            out.close(); // đóng luồng Stream
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    public void read(){
        try{
            File f = new File(path);
            if(f.exists() == false){
                System.out.println("File not exists");
                return;
            }
            FileInputStream in  = new FileInputStream(f);
            byte[] b = new byte[1024];
            int cout = in.read(b); // khi đọc hết byte cout trả về -1
            StringBuilder builder = new StringBuilder();
            while(cout != -1){
                String s = new String(b,0,cout,"utf-8"); // chuyển đổi byte về chuỗi tham số (mảng, vị trí bắt đầu lấy, lấy đến vị trí này(vị trí cuối), định dạng text sẽ nhận)
                builder.append(s); // append nỗi vào
                cout = in.read(b);
            }
            in.close();
            System.out.println(builder);



        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public  void  download(String link){
        try{
            File file = new File("D:/T3Hs/Java_android_t3h/Buoi7/test_file/Video.mp4");
            file.createNewFile();
            FileOutputStream out = new FileOutputStream(file);

            URL url = new URL(link);
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();

            long total = connection.getContentLengthLong();
            long downloaded = 0;

            byte[] b = new byte[2048];
            int count = in.read(b);

            int currentPercent = 0;
            long start = System.currentTimeMillis();
            while (count != -1){
                downloaded += count;
                int percent = (int)((double) downloaded/total*100);
                if(currentPercent != percent){
                    System.out.println(percent);
                    currentPercent = percent;
                }
                out.write(b,0,count);
                count = in.read(b);
            }
            start = System.currentTimeMillis() - start;
            System.out.println(start);
            out.close();
            in.close();


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
