package com.kuang.snake;

import javax.swing.*;
import java.awt.*;

// ��Ϸ�����
public class GamePanel extends JPanel {

    // ������壬��Ϸ�е����ж����������������������
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ����

        // ���ƾ�̬�����
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // ͷ�������
        g.fillRect(25, 75, 850, 600); // Ĭ�ϵ���Ϸ����

    }
}
