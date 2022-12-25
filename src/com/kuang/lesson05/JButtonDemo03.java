package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo03 extends JFrame {
    public JButtonDemo03() {
        Container container = getContentPane();

        // ¶àÑ¡¿ò
        JCheckBox checkBox1 = new JCheckBox("checkbox1");
        JCheckBox checkBox2 = new JCheckBox("checkbox2");
        JCheckBox checkBox3 = new JCheckBox("checkbox3");

        container.add(checkBox3, BorderLayout.NORTH);
        container.add(checkBox2, BorderLayout.CENTER);
        container.add(checkBox1, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBounds(200,200, 300,300);
    }

    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
