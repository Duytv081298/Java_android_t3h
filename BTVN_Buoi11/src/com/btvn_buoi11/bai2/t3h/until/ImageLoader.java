package com.btvn_buoi11.bai2.t3h.until;

import javax.swing.*;
import java.awt.*;

public class ImageLoader {
    public static Image getImage(String name, Class clz){
        Image image = new ImageIcon(
                clz.getResource("/images/" + name)  // đường dẫn hình ảnh
        ).getImage();
        return image;
    }
}
