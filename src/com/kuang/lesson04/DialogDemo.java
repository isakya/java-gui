package com.kuang.lesson04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// ������
public class DialogDemo extends JFrame {
    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700,700);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        // JFrame �Ŷ�������Ҫ����
        Container container = this.getContentPane();
        // ���Բ���
        container.setLayout(null);
        
        // ��ť
        JButton button = new JButton("�������һ���Ի���"); // ��������
        button.setBounds(30,30,200,50);

        // ��������ť��ʱ�򣬵�������
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ����
                new MyDialogDemo();
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

// �����Ĵ���
class MyDialogDemo extends JDialog {
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100, 500,500);
        // ����Ĭ�Ͼ��йر��¼�
        // this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("izumi!!!!"));

    }
}