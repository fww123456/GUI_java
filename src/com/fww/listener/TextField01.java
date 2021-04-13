package com.fww.listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField01 {
    public static void main(String[] args) {
        new MyFrame();//启动
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        //监听
        //按下回车就会触发
        textField.addActionListener(new ActionListener (){

            @Override
            public void actionPerformed (ActionEvent e){
                TextField field = (TextField) e.getSource();//获得一些资源，返回一个对象
                System.out.println(field.getText());//获得输入框的文本
                field.setText("");//回车后清空
            }
        }); //为文本框添加监听

        setVisible(true);
        pack();
    }
}

