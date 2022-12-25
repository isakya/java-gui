package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    // init(); 初始化
    public void init() {
        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setVisible(true);
        jf.setBounds(200,200, 400,400);
        jf.setBackground(Color.CYAN);

        // 设置文字 JLabel
        JLabel label = new JLabel("izumi");
        jf.add(label);

        // 容器实例化


        // 关闭事件
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        // 建立一个窗口
        new JFrameDemo().init();
    }
}
