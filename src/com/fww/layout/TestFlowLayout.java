package com.fww.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //按钮组件
        Button button01 = new Button("button01");
        Button button02 = new Button("button02");
        Button button03 = new Button("button03");

        //设置为流式布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(400,400);

        //可见
        frame.setVisible(true);

        //添加button
        frame.add(button01);
        frame.add(button02);
        frame.add(button03);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
