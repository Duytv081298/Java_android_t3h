package com.btvn_buoi4_bai2.AmNhac;

import java.util.ArrayList;
import java.util.List;

public class Video extends Music {

    protected String album;

    public Video(String ten, String caSi, String dungLuong, String thoiGian, String album) {
        super(ten, caSi, dungLuong, thoiGian);
        this.album = album;
    }

    public List<String> LuuTT(){
        List<String> musics = new ArrayList<>();
        musics.add("Tên bài nhạc: "+ ten + "\n");
        musics.add("Ca sĩ thể hiện: " + caSi+ "\n");
        musics.add("Dung lượng: " + dungLuong+ "\n");
        musics.add("Thời gian: " + thoiGian+ "\n");
        musics.add("Album: " + album+ "\n");
        return musics;
    }
    @Override
    public void ThongTin() {
        super.ThongTin();
        System.out.println("Album: " + album);
    }

}
