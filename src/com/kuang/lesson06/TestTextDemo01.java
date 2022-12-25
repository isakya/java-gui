package com.kuang.lesson06;

import javax.swing.*;
import java.awt.*;

// нд╠╬©Р
public class TestTextDemo01 extends JFrame {
    public TestTextDemo01() {
        Container container = getContentPane();

        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world", 20);

        container.add(textField1, BorderLayout.NORTH);
        container.add(textField2, BorderLayout.SOUTH);


        this.setBounds(100,100, 300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new TestTextDemo01();
    }
}