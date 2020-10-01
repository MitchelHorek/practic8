package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    Main(){
        super("ПРиветики");
        setLayout(new FlowLayout());//установка слоя
        setSize(500,500);
        setVisible(true);
        setResizable(false);
    }
    public void paint(Graphics form){
        super.paint(form);
        for(int i = 0; i<20;i++) {
            int MinShape = 1;
            int MaxShape = 3;
            int MinColor = 1;
            int MaxColor = 4;
            int Minx = 10;
            int Maxx = 400;
            int Miny = 40;
            int Maxy = 400;
            int numberShape = MinShape + (int) (Math.random() * ((MaxShape - MinShape) + 1));
            int numberColor = MinColor + (int) (Math.random() * ((MaxColor - MinColor) + 1));
            int x = Minx + (int) (Math.random() * ((Maxx - Minx) + 1));
            int y = Miny + (int) (Math.random() * ((Maxy - Miny) + 1));
            Color color = Color.red;
            //создание рандомного x, y, color
            switch(numberColor){
                case 1:
                    color = Color.cyan;
                    break;
                case 2:
                    color = Color.green;
                    break;
                case 3:
                    color = Color.YELLOW;
                    break;
                case 4:
                    color = Color.MAGENTA;
                    break;
            }
            switch (numberShape) {
                case 1:
                    Oval oval = new Oval(color, x, y, 50);
                    oval.draw(form);
                    break;
                case 2:
                    Kvadrat kvadrat = new Kvadrat(color, x, y, 200);
                    kvadrat.draw(form);
                    break;
                case 3:
                    Treangle treangle = new Treangle(color, x, y, 20, 68, 80, 85);
                    treangle.draw(form);
                    break;
            }
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}
