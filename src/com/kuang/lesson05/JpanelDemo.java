package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;

public class JpanelDemo extends JFrame {
    public JpanelDemo() {
        Container container = this.getContentPane();
        // 后面两个参数是间距
        container.setLayout(new GridLayout(2, 1, 10, 10));

        JPanel panel1 = new JPanel(new GridLayout(1, 3));

        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));

        container.add(panel1);

        this.setVisible(true);
        this.setSize(700,700);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JpanelDemo();
    }
}
