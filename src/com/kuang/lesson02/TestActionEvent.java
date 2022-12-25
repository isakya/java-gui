package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLOutput;

// 事件监听
public class TestActionEvent {
    public static void main(String[] args) {
        // 按下按钮，触发一些事件
        Frame frame = new Frame();
        Button button = new Button("Button");

        //
        MyActionListener myActionListener = new MyActionListener();

        button.addActionListener(myActionListener);

        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(200,200);
        frame.setVisible(true);
        windowClose(frame);
    }

    // 关闭窗体的事件
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

// 事件监听
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
