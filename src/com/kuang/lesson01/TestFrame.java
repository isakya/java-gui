package com.kuang.lesson01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        Frame frame = new Frame("�ҵĵ�һ��Javaͼ�ν��洰��");

        // ��Ҫ���ÿɼ��� w h
        frame.setVisible(true);

        // ���ô��ڴ�С
        frame.setSize(400, 400);

        // ���ñ�����ɫ
        frame.setBackground(new Color(232, 35, 232));

        // �����ĳ�ʼλ��
        frame.setLocation(200, 200);

        // ���ô�С�̶�
        frame.setResizable(false);
    }
}
