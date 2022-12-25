package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
// ͼƬ��ť
public class JButtonDemo01 extends JFrame {

    public JButtonDemo01() {
        Container container = getContentPane();

        // ��һ��ͼƬ���ͼ��
        URL resource = JButtonDemo01.class.getResource("izumi.jpg");

        Icon icon = new ImageIcon(resource);

        // �����ͼ����ڰ�ť��
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("ͼƬ��ť");

        // add
        container.add(button);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setBounds(200,200, 2000,3000);
    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
