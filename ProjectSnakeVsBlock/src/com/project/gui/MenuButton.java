package com.project.gui;

import until.ImageLoader;

import javax.swing.*;
import java.awt.*;

public class MenuButton extends JButton {
    private Image imSelect;
    private Image imNone;

    public MenuButton(String imSelect, String imNone) {
        this.imSelect = ImageLoader.getImage(imNone , getClass());
        this.imNone = ImageLoader.getImage(imNone , getClass());
        setSize(
                this.imNone.getWidth(null),
                this.imSelect.getHeight()
        );
    }
}
