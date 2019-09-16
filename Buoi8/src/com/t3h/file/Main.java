package com.t3h.file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.getFile();
        fileManager.readAllFile(new File("D:/"));
//        fileManager.write();
//        fileManager.read();
//        fileManager.download("https://vredir.nixcdn.com/PreNCT16/CaoOc20-BRayDatGMasewKICM-6008618.mp4?st=yaiZroVffS_5lnbIQ_hOOg&e=1567776394&t=1567689993340");

    }

}
