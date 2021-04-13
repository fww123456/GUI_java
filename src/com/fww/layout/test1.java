package com.fww.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("test1");
        frame.setLayout(new GridLayout(2,1));

        Button but1 = new Button("button");
        Button but2 = new Button("button");
        Button but3 = new Button("button");
        Button but4 = new Button("button");
        Button but5 = new Button("button");
        Button but6 = new Button("button");
        Button but7 = new Button("button");
        Button but8 = new Button("button");
        Button but9 = new Button("button");
        Button but10 = new Button("button");

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        panel2.add(but3);
        panel2.add(but4);
        panel1.add(but1,BorderLayout.WEST);
        panel1.add(panel2,BorderLayout.CENTER);
        panel1.add(but2,BorderLayout.EAST);

        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));
        panel4.add(but7);
        panel4.add(but8);
        panel4.add(but9);
        panel4.add(but10);
        panel3.add(but5,BorderLayout.WEST);
        panel3.add(panel4,BorderLayout.CENTER);
        panel3.add(but6,BorderLayout.EAST);

        frame.add(panel1);
        frame.add(panel3);

        frame.pack();
        frame.setSize(200,200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
