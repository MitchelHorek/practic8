package com.company;

import java.awt.*;

public class Oval extends Shape{
    private int radious;
    public Oval(Color color, int x, int y, int radious) {
        super(color, x, y);
        this.radious = radious;
    }

    @Override
    public void draw(Graphics form) {
        form.setColor(color);
        //form.fillOval(x,y,radious*2,radious*2);
        form.drawOval(x,y,radious*2,radious*2);

    }
}
