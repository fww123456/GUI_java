package com.fww.paint_listener;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听
public class TestMouselistener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

//自己的类
class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前位置，需要集合来存储这个点
    ArrayList points;//动态数组，存放point，使用add可添加

    public MyFrame(String title){ //构造函数
        super(title); //继承父类构造器
        setBounds(200,200,400,300);//定义画布大小

        //存鼠标点击的点
        points = new ArrayList<>();

        //为窗口添加鼠标监听器
        this.addMouseListener(new MyMouseListener());

        setVisible(true);
    }

    //重写画笔
    @Override
    public void paint(Graphics g) {
        //画画需要监听鼠标的事件
        Iterator iterator = points.iterator();//iterator()返回一个迭代器对象

        while (iterator.hasNext()){
            Point point = (Point) iterator.next(); //坐标(x,y)结构
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加点到界面上
    public void addPaint(Point point){
        points.add(point);//关联
    }


    //适配器模式
    private class MyMouseListener extends MouseAdapter{
        //鼠标按下
        @Override
        public void mousePressed(MouseEvent e) { //e表示鼠标事件
            MyFrame frame = (MyFrame)e.getSource();//拿到窗口
            //这里我们点击的时候就会在界面上产生点
            //这个点就是鼠标的点
            frame.addPaint(new Point(e.getX(),e.getY()));//拿到鼠标的坐标

            //每次点击鼠标都会重新画一遍
            frame.repaint();//刷新  刷新后执行paint方法
        }
    }
}