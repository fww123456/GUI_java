## AWT

元素：窗口、按钮、文本框

包：java.awt

##### 计算器

###### 组合

```java
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

        button.addActionListener(new MyCalculatorListener(this));
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        setVisible(true);
        pack();
    }
}

class MyCalculatorListener implements ActionListener{

    //在一个类里组合另外一个类
    MyCalculator myCalculator=null;
    public MyCalculatorListener(MyCalculator myCalculator){
        this.myCalculator = myCalculator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(myCalculator.textField1.getText());
        int n2 = Integer.parseInt(myCalculator.textField2.getText());
        myCalculator.textField3.setText(""+(n1+n2));
    }
}
```

###### 内部类

