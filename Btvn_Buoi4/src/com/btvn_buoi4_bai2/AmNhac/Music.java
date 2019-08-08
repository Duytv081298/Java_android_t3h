package com.btvn_buoi4_bai2.AmNhac;

import java.util.ArrayList;
import java.util.List;

public class Music<thoiGian, dungLuong, caSi, ten> {
    protected String ten;
    protected String caSi;
    protected String dungLuong;
    protected String thoiGian;

    public Music(String ten, String caSi, String dungLuong, String thoiGian) {
        this.ten = ten;
        this.caSi = caSi;
        this.dungLuong = dungLuong;
        this.thoiGian = thoiGian;

    }
    public void ThongTin(){
        System.out.println("Tên bài hát: " + ten);
        System.out.println("Ca sĩ thể hiện: " + caSi);
        System.out.println("Dung lượng: " + dungLuong);
        System.out.println("Thời gian: " + thoiGian);
    }
    public List<String> LuuTT(){
        List<String> musics = new ArrayList<>();
        musics.add("Tên bài hát: "+ ten + "\n");
        musics.add("Ca sĩ thể hiện: " + caSi+ "\n");
        musics.add("Dung lượng: " + dungLuong+ "\n");
        musics.add("Thời gian: " + thoiGian+ "\n");
        return musics;
    }
}
