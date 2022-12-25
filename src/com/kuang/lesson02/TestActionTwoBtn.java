package com.kuang.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwoBtn {
    public static void main(String[] args) {
        // ������ť��ʵ��ͬһ������
        Frame frame = new Frame("��ʼ-ֹͣ");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        // ���ð�ť����Ϣ��û�����þͲ���Ĭ��ֵlabel
        // ���Զ����ť��ֻдһ�������࣬���������õ�ֵ�����֣�����Ĭ��ֵҲ����
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
        // e.getActionCommand() ��ȡ��ť����Ϣ
        System.out.println("��ť������ˣ�msg=" + e.getActionCommand());
    }
}
