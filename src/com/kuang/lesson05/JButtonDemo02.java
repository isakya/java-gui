package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

// ��ѡ��ť
public class JButtonDemo02 extends JFrame {
    public JButtonDemo02() {
        Container container = getContentPane();

        // ��ѡ��
        JRadioButton radioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton02 = new JRadioButton("JRadioButton01");
        JRadioButton radioButton03 = new JRadioButton("JRadioButton01");

        // ���ڵ�ѡ��ֻ��ѡ��һ�������飬һ������ֻ��ѡ��һ��
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton01);
        buttonGroup.add(radioButton02);
        buttonGroup.add(radioButton03);

        // add
        container.add(radioButton01, BorderLayout.CENTER);
        container.add(radioButton02, BorderLayout.NORTH);
        container.add(radioButton03, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBounds(200,200, 300,300);
    }

    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
