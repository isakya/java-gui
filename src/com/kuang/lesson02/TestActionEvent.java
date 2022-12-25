package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLOutput;

// �¼�����
public class TestActionEvent {
    public static void main(String[] args) {
        // ���°�ť������һЩ�¼�
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

    // �رմ�����¼�
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

// �¼�����
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
