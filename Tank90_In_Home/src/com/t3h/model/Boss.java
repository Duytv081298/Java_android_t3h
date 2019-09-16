package com.t3h.model;

import com.t3h.until.ImageLoader;

public class Boss extends Tank {

    public Boss(int x, int y) {
        super(x, y, DOWN);;
        images[LEET] = ImageLoader.getImage("bossyellow_left.png", getClass());
        images[RIGHT] = ImageLoader.getImage("bossyellow_right.png", getClass());
        images[UP] = ImageLoader.getImage("bossyellow_up.png", getClass());
        images[DOWN] = ImageLoader.getImage("bossyellow_down.png", getClass());
    }
}
