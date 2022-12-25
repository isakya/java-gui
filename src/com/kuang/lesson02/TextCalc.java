package com.kuang.lesson02;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ���׼�����
public class TextCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.loadFrame();
    }
}

// ��������
class Calculator extends Frame {
    // ����
    TextField num1, num2, num3;

    // ����
    public void loadFrame() {
        // 3���ı���
        num1 = new TextField(10); // �����ַ���
        num2 = new TextField(10); // �����ַ���
        num3 = new TextField(20); // �����ַ���

        // 1����ť
        Button button = new Button("=");
        // 1����ǩ
        Label label = new Label("+");

        // ����¼�
        button.addActionListener(new MyCalculatorListener());

        // ����
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }

    // ��������
    // �ڲ�������ô������ǿ��Գ�ͨ����ķ����ⲿ������Ժͷ�����
    private class MyCalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // 1. ��ü����ͱ�����
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());

            // 2. �����ֵ�ӷ�����󣬷ŵ���������
            num3.setText(""+(n1+n2));

            // 3. ���ǰ������
            num1.setText("");
            num2.setText("");
        }
    }
}

