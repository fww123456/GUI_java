package com.fww.layout;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestGridLayout");

        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");
        Button but1 = new Button("but1");

        frame.setLayout(new GridLayout(3,2));
        frame.add(east);
        frame.add(west);
        frame.add(south);
        frame.add(north);
        frame.add(center);
        frame.add(but1);

        frame.pack();//java函数，自动填充
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
