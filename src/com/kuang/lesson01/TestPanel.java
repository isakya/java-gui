package com.kuang.lesson01;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// ��� ���ܵ�������
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Panel panel = new Panel();

        // ���ò���
        frame.setLayout(null);

        // ����
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(110, 28, 28));

        // panel�������꣬���frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(25, 218, 25));

        // frame.add(panel)
        frame.add(panel);

        frame.setVisible(true);

        // �����¼����������ڹر��¼� System.exit(0)
        // ������ģʽ
        frame.addWindowListener(new WindowAdapter() {
            // ���ڵ���رյ�ʱ����Ҫ��������
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
