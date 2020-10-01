package com.company;

import java.awt.*;

public class Treangle extends Shape {
    private int y1;
    private int y2;
    private int x1;
    private int x2;
    public Treangle(Color color, int x, int y, int x1, int y1, int x2, int y2) {
        super(color, x, y);
        this.y1 = y1;
        this.y2 = y2;
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public void draw(Graphics form) {
        form.setColor(color);
        int[] arrayX = {x,x1,x2};
        int[] arrayY = {y,y1,y2};
        //form.fillPolygon(arrayX,arrayY,3);
        form.drawPolygon(arrayX,arrayY,3);

    }
}
