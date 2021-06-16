package com.snow;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SnowCanvas extends Canvas{
    List<Snow> snows = new ArrayList<>();

    public SnowCanvas(){
        setBackground(Color.black);
        for (int i = 0; i < 100; i++) {
            Snow snow = new Snow(this);
            snow.start();
            snows.add(snow);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        for (Snow snow:snows) {
            g.drawString("雪", snow.x, snow.y);
        }
    }
}
