package com.kuang.lesson01;

import java.awt.*;
// 流式布局
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        // 按钮组件
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        // 设置为流式布局 从左到右依次排列就是流式布局
        // frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200,200);

        // 把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
