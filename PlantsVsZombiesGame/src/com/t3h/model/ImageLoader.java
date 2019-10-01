package com.t3h.model;

import javax.swing.*;
import java.awt.*;

public class ImageLoader {
    public static Image getImage(String name, Class clz) {
        Image im = new ImageIcon(
                clz.getResource("/images/" + name)
        ).getImage(); // trỏ vào file ảnh lấy ảnh. gọi hàm đưa tên hình ảnh muốn load.
        return im;
    }
}
