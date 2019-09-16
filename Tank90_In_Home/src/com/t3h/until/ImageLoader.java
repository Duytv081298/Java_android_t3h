package com.t3h.until;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ImageLoader {
    public static Image getImage(String name, Class clz){
        Image image = new ImageIcon(
                clz.getResource("/images/" + name)  // đường dẫn hình ảnh
        ).getImage();
        return image;
    }
//    public static ArrayList<Image> subImage(String name, int w, int h, int number, Class clz){
//        ArrayList<Image> arrayResults = new ArrayList<>();
//        try{
//            BufferedImage bufferedImage = ImageIO.read(clz.getResourceAsStream("/images/" + name));
//            BufferedImage subImage;
//            for (int i = 0; i < number ; i++) {
//                subImage = bufferedImage.getSubimage(0,i*h,w,h);
//                arrayResults.add(subImage);
//            }
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return arrayResults;
//    }
}
