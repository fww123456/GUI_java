package com.fww.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//可以看成一个空间
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161,35));

        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(38, 214, 220));

        //添加面板
        frame.add(panel);
        frame.setVisible(true);

        //监听事件
        //适配器模式
        frame.addWindowListener(new WindowAdapter() { //接口适配器（多态）
            @Override
            public void windowStateChanged(WindowEvent e) { //WindowAdapter抽象类，需要重写方法
                //结束程序
                System.exit(0);
            }
        });
    }
}
