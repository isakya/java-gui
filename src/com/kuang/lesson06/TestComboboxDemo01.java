package com.kuang.lesson06;

import javax.swing.*;
import java.awt.*;

// ������
public class TestComboboxDemo01 extends JFrame {
    public TestComboboxDemo01() {
        Container container = getContentPane();

        JComboBox status = new JComboBox();

        status.addItem(null);
        status.addItem("������ӳ");
        status.addItem("���¼�");
        status.addItem("������ӳ");

        container.add(status);

        this.setBounds(100,100, 300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new TestComboboxDemo01();
    }
}
