package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() {
        JLabel label = new JLabel("IZUMI");
        // 获取图片的地址,同级资源,图片放在out的同级目录下才可以不报空指错误
        URL url = ImageIconDemo.class.getResource("izumi.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(100,100,3000,3000);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
