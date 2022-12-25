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
                // 匿名内部类
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("关闭Closing");
                        System.exit(0);
                    }

                    @Override
                    public void windowActivated(WindowEvent e) {
                        WindowFrame source = (WindowFrame) e.getSource();
                        source.setTitle("被激活了");
                        System.out.println("窗口被激活Activated");
                    }
                }
        );
    }
}