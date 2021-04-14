package com.fww.listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        new MyCalculator().loadFrame();
    }
}

class MyCalculator extends Frame{

    //属性
    TextField textField1;
    TextField textField2;
    TextField textField3;
    Button button;
    Label label;

    //方法
    public void loadFrame(){
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        button = new Button("=");
        label = new Label("+");

        button.addActionListener(new MyCalculatorListener());
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        setVisible(true);
        pack();
    }

    //监听器类
    //内部类最大的好处就是可以畅通无阻的访问外部类的属性和方法
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            textField3.setText(""+(n1+n2));
        }
    }
}

