package com.kuang.lesson01;

import java.awt.*;

// Á·Ï°µÄDemo
public class ExDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setLayout(new GridLayout(2,1));

        // 4¸öÃæ°å
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        frame.setBackground(new Color(124, 17, 17));
        frame.setLocation(200,200);
        frame.setSize(400,400);
        frame.setVisible(true);


        p1.add(new Button("East-1"), BorderLayout.EAST);
        p1.add(new Button("West-1"), BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2, BorderLayout.CENTER);


        p3.add(new Button("East-2"), BorderLayout.EAST);
        p3.add(new Button("West-2"), BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            p4.add(new Button("for-" + i));
        }
        p3.add(p4, BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);
    }
}
