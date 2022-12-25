package com.kuang.lesson06;

import javax.swing.*;
import java.awt.*;

// ÃÜÂë¿ò
public class TestTextDemo02  extends JFrame {
    public TestTextDemo02() {
        Container container = getContentPane();

        JPasswordField passwordField = new JPasswordField();

        passwordField.setEchoChar('*');

        container.add(passwordField);


        this.setBounds(100,100, 300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new TestTextDemo02();
    }
}