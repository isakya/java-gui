package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
// 图片按钮
public class JButtonDemo01 extends JFrame {

    public JButtonDemo01() {
        Container container = getContentPane();

        // 将一个图片变成图标
        URL resource = JButtonDemo01.class.getResource("izumi.jpg");

        Icon icon = new ImageIcon(resource);

        // 把这个图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

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
