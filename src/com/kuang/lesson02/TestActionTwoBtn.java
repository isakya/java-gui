package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwoBtn {
    public static void main(String[] args) {
        // 两个按钮，实现同一个监听
        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        // 设置按钮的信息，没有设置就采用默认值label
        // 可以多个按钮，只写一个监听类，用这里设置的值来区分，或者默认值也可以
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

        frame.pack();
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getActionCommand() 获取按钮的信息
        System.out.println("按钮被点击了：msg=" + e.getActionCommand());
    }
}
