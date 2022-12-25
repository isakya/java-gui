package com.kuang.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.BLUE);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        this.addWindowListener(
                // �����ڲ���
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("�ر�Closing");
                        System.exit(0);
                    }

                    @Override
                    public void windowActivated(WindowEvent e) {
                        WindowFrame source = (WindowFrame) e.getSource();
                        source.setTitle("��������");
                        System.out.println("���ڱ�����Activated");
                    }
                }
        );
    }
}