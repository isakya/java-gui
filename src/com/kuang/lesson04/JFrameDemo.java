package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo {
    // init(); ��ʼ��
    public void init() {
        JFrame jf = new JFrame("����һ��JFrame����");
        jf.setVisible(true);
        jf.setBounds(200,200, 400,400);
        // ����ʵ������ʵ������������ñ�����ɫ
        jf.getContentPane().setBackground(Color.ORANGE);

        // �������� JLabel
        JLabel label = new JLabel("izumi");
        jf.add(label);



        // �ر��¼�
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        // ����һ������
        new JFrameDemo().init();
    }
}
