package com.kuang.lesson02;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ������¼�����
public class TestText01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        // ��������ı������������
        MyActionListrner2 myActionListrner2 = new MyActionListrner2();
        // ���»س��ͻᴥ������������¼�
        textField.addActionListener(myActionListrner2);

        // �����滻����
        textField.setEchoChar('*');

        pack();
        setVisible(true);
    }
}

class MyActionListrner2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource(); // ���һЩ��Դ, ����һ������
        System.out.println(field.getText()); // ���������е��ı�
        // �¼������������ı�
        field.setText("");
    }
}