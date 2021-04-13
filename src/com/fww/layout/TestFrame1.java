package com.fww.layout;

import java.awt.*;

public class TestFrame1 {
    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(200,200,400,400,new Color(1,234,255));
        MyFrame frame2 = new MyFrame(600,200,400,400,Color.WHITE);

    }
}

class MyFrame extends Frame {
    public static int id=0;
    int name;
    public MyFrame(int x,int y,int w,int h,Color bgcolor) {
        super("MyFrame" + (id++));
        setBackground(bgcolor);
        setVisible(true);
        setSize(w,h);
        setLocation(x,y);
    }
}