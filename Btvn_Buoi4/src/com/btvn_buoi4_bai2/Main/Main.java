package com.btvn_buoi4_bai2.Main;

import com.btvn_buoi4_bai2.AmNhac.Nhac;
import com.btvn_buoi4_bai2.AmNhac.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nhac htca = new Nhac("Hãy trao cho anh", "Sơn Tùng MTP", "6.9MB", "5:53");
        Nhac sg = new Nhac("Sóng Gio", "Jack", "7.4MB", "4:56");
        Nhac bp = new Nhac("Bạc Phận", "KICM", "8.7MB", "5:00");


        Video hn = new Video("Hồng Nhan", "Jack", "5.7MB", "5:05", "Hồng Nhan Bạc Phận");
        Video stth = new Video("Sầu Tím Thiệp Hồng", "Lệ Quyên", "6.8MB", "7:34", "Trữ Tình");
        Video vlmb = new Video("Vùng lá me bay", "Như Quỳnh", "4.7MB", "4:30", "Trữ Tình");
        Video gctt = new Video("Gõ cửa trái tim", "Quang Lê", "4.9MB", "4:50", "Trữ Tình");

        List<List> nhacs = new ArrayList<>();
        nhacs.add( htca.LuuTT());
        nhacs.add(sg.LuuTT());
        nhacs.add(bp.LuuTT());

        List<List> videos = new ArrayList<>();
        videos.add(hn.LuuTT());
        videos.add(stth.LuuTT());
        videos.add(vlmb.LuuTT());
        videos.add(gctt.LuuTT());

        System.out.println("Bạn muốn nghe nhạc hay xem video:\n");
        do {
            String result, n, m;
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextLine().toUpperCase();
            if (result.equals("NHAC")) {
                System.out.println("Bài hát đang phát: ");
                int viTri = 1;
                System.out.println(nhacs.get(viTri));
                do {
                    System.out.println("Enter your choise: \n" +
                            "1: Play \n" +
                            "2: Next \n" +
                            "3: Back \n" +
                            "4: Pause \n");
                    n = scanner.nextLine().toUpperCase();
                    if (n.equals("NEXT")) {
                        viTri += 1;
                        if(viTri > nhacs.size()) {
                            System.out.println("Không bài kế tiếp\n");
                            viTri -= 1;
                            System.out.println("Bài hát hiện tại: ");
                            System.out.println(nhacs.get(viTri));
                        }else {
                            System.out.println("Next bài mới:");
                            System.out.println(nhacs.get(viTri));
                        }
                    } else if (n.equals("BACK")) {
                        viTri -= 1;
                        if(viTri < 0) {
                            System.out.println("Không bài phía trước\n");
                            viTri += 1;
                            System.out.println("Bài hát hiện tại: ");
                            System.out.println(nhacs.get(viTri));
                        }else {
                            System.out.println("Quay lại bài trước: ");
                            System.out.println(nhacs.get(viTri));
                        }
                    } else if (n.equals("PLAY")) {
                        System.out.println("Bài hát đang phát: ");
                        System.out.println(nhacs.get(viTri));
                    } else if (n.equals("PAUSE")) {
                        System.out.println("Dừng bài hát đang phát: ");
                        System.out.println(nhacs.get(viTri));
                    } else if (n.equals("CLOSE")) {
                        break;
                    } else {
                        System.out.println("Nhập lại điều kiện");
                    }
                } while (true);
                break;
            } else if (result.equals("VIDEO")) {
                System.out.println("Video hát đang phát: ");
                int viTri = 1;
                System.out.println(videos.get(viTri));
                do {
                    System.out.println("Enter your choise: \n" +
                            "1: Play \n" +
                            "2: Next \n" +
                            "3: Back \n" +
                            "4: Pause \n");
                    m = scanner.nextLine().toUpperCase();
                    if (m.equals("NEXT")) {
                        viTri += 1;
                        if(viTri > videos.size()) {
                            System.out.println("Không bài kế tiếp\n");
                            viTri -= 1;
                            System.out.println("Bài hát hiện tại: ");
                            System.out.println(nhacs.get(viTri));
                        }else {
                            System.out.println("Next bài mới:");
                            System.out.println(videos.get(viTri));
                        }
                    } else if (m.equals("BACK")) {
                        viTri -= 1;
                        if(viTri < 0) {
                            System.out.println("Không bài phía trước\n");
                            viTri += 1;
                            System.out.println("Bài hát hiện tại: ");
                            System.out.println(nhacs.get(viTri));
                        }else {
                            System.out.println("Quay lại bài trước: ");
                            System.out.println(videos.get(viTri));
                        }
                    } else if (m.equals("PLAY")) {
                        System.out.println("Bài hát đang phát: ");
                        System.out.println(videos.get(viTri));
                    } else if (m.equals("PAUSE")) {
                        System.out.println("Dừng bài hát đang phát: ");
                        System.out.println(videos.get(viTri));
                    } else if (m.equals("CLOSE")) {
                        break;
                    } else {
                        System.out.println("Nhập lại điều kiện");
                    }
                } while (true);
                break;
            } else if (result.equals("CLOSE")) {
                break;
            } else {
                System.out.println("Nhập lại lựa chọn bạn muốn xem nhạc hay video");
            }
        }while (true);

    }
}
