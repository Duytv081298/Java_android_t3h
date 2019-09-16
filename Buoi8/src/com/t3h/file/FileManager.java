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
        //check File có tồn tại hay không
        System.out.println(exists);
        if (exists == true){
            System.out.println(f.getName()); // lấy ra tên file
            System.out.println(f.length()); // dung lượng file byte
            long time = f.lastModified();  // thời gian cuối cùng sửa đổi file
            System.out.println(time);
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy"); // định dạng lại thời gian theo kiểu thời gian việt nam
            System.out.println(format.format(time));
        }else {
            try {
                f.getParentFile().mkdir(); // getParentFile lấy ra cha thư mục đang tìm kiếm  |||  mkdir kiểm tra thư mục tồn tại chưa
                f.createNewFile(); // tạo ra một thư mục mới
                System.out.println("Create success ^ - ^");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void readAllFile(File file){  // đọc file
        try{
            File[] files = file.listFiles(); // listFiles trả về tất cả các file, thư mục mà nó chứa, null nếu rỗng
            for (File f: files) {
                if (f.isDirectory()){ //Kiểm tra là thư mục hay không , nếu là thư mục trả về true, file trả về false
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
            boolean exists = f.exists(); // Kiểm tra file có tồn tại hay không
            if(exists == false){
                f.getParentFile().mkdir(); // kiểm tra thư mục tồn tại hay không
                f.createNewFile(); // Tạo file
                System.out.println("Create success ^ - ^");
            }
            //in output: thực thi trên internet. FileoutputStrem dùng ở local
            //FileOutputStream sử dụng để ghi file
            FileOutputStream out = new FileOutputStream(f, true); // true để ghi tiếp (txt, word), false để ghi lại toàn bộ(Video, ảnh)
            String str = "Hello World\n";
            out.write(str.getBytes());  // str.getBytes() mã hóa string thành các byte
            out.write(str.getBytes());  // write phương thức ghi của một đối tượng FileOutputStream
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
            //InputStream được sử dụng để đọc dữ liệu từ một nguồn
            FileInputStream in  = new FileInputStream(f);
            byte[] b = new byte[1024];
            int cout = in.read(b); // khi đọc hết byte cout trả về -1
            StringBuilder builder = new StringBuilder();
            while(cout != -1){
                String s = new String(b,0,cout,"utf-8"); // chuyển đổi byte về chuỗi tham số (mảng, vị trí bắt đầu lấy, lấy đến vị trí này(vị trí cuối), định dạng text sẽ nhận)
                builder.append(s); // append nối vào
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
            File file = new File("D:/T3Hs/Java_android_t3h/Buoi7/test_file/Video.mp4");  // khởi tạo đối tượng file
            file.createNewFile();  // tạo file
            // FileOutputStream di chuyển dữ liệu tới một điểm khác
            FileOutputStream out = new FileOutputStream(file);

            URL url = new URL(link); // tạo đối tượng url
            URLConnection connection = url.openConnection();   // URLConnection openConnection() mở kết nối với nguồn    |||

            InputStream in = connection.getInputStream();   // InputStream getInputStream() Trả về Input Stream của URL connection để đọc từ nguồn

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
