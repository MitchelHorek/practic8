package com.company;

import java.awt.*;

public class Kvadrat extends Shape{
    private int width;
    public Kvadrat(Color color, int x, int y, int width) {
        super(color, x, y);
        this.width = width;
    }

    @Override
    public void draw(Graphics form) {
        form.setColor(color);
        //form.fillRect(x,y,width,width);
        form.drawRect(x,y,width,width);

    }
}
