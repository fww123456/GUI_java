package com.fww.paint_listener;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new Mypaint().loadFrame();
    }
}

class Mypaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) { //paint是container中的方法，Frame继承container
        //画笔颜色，画画
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);//空心圆

        g.setColor(Color.GREEN);
        g.fillRect(150,200,200,200);

        //画笔用完后，将他还原到最初的颜色
    }
}