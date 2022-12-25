package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyJframe2().init();
    }
}

class MyJframe2 extends JFrame {
    public void init() {
        this.setVisible(true);
        this.setBounds(300,300,300,300);

        this.add(new JLabel("izumi"));


        // 获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.CYAN);
    }

}
