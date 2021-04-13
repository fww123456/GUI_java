package com.fww.listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionLayout {
    public static void main(String[] args) {

        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //显示定义触发命令
        button1.setActionCommand("button01_start");
        button2.setActionCommand("button02_stop");

        button1.addActionListener(new MyActionLister());
        button2.addActionListener(new MyActionLister());

        frame.add(button1,BorderLayout.WEST);
        frame.add(button2,BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
        windowClose(frame);
    }
    public static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//事件监听
class MyActionLister implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了"+e.getActionCommand()); //获取按钮信息
    }
}
