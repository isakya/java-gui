package com.kuang.snake;

import javax.swing.*;

// ��Ϸ����������
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setBounds(10,10,900,720);
        frame.setResizable(false); // ���ڴ�С���ɱ�
        frame.add(new GamePanel());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
