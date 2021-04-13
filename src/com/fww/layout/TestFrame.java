package com.fww.layout;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        //Frame
        Frame frame = new Frame("my first java UI.");

        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //背景颜色
        frame.setBackground(new Color(1, 234, 255));

        //弹出的初始位置
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);
    }
}
