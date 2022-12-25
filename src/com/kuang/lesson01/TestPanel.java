package com.kuang.lesson01;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 面板 不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Panel panel = new Panel();

        // 设置布局
        frame.setLayout(null);

        // 坐标
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(110, 28, 28));

        // panel设置坐标，相对frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(25, 218, 25));

        // frame.add(panel)
        frame.add(panel);

        frame.setVisible(true);

        // 监听事件，监听窗口关闭事件 System.exit(0)
        // 适配器模式
        frame.addWindowListener(new WindowAdapter() {
            // 窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
