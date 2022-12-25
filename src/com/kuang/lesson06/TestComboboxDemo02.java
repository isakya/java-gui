package com.kuang.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

// 展示列表
public class TestComboboxDemo02 extends JFrame {
    public TestComboboxDemo02() {
        Container container = getContentPane();

        // 生成列表的内容 静态
        // String[] contents = {"1","2","3"};

        // 生成列表内容 动态
        Vector contents = new Vector();

        JList jList = new JList(contents);

        contents.add("1");
        contents.add("2");
        contents.add("3");

        container.add(jList);

        this.setBounds(100,100, 300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new TestComboboxDemo02();
    }
}