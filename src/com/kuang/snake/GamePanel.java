package com.kuang.snake;

import javax.swing.*;
import java.awt.*;

// ��Ϸ�����
public class GamePanel extends JPanel {

    // �����ߵ����ݽṹ
    int length; // �ߵĳ���
    int[] snakeX = new int[600]; // �ߵ�x���� 25*25
    int[] snakeY = new int[500]; // �ߵ�y���� 25*25
    String fx; // ��ʼ����
    // ��Ϸ��ǰ��״̬����ʼ��ֹͣ
    boolean isStart = false; // Ĭ�ϲ���ʼ


    // ������
    public GamePanel() {
        init();
    }

    // ��ʼ������
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; // �Դ�������
        snakeX[1] = 75;snakeY[1] = 100; // ��һ�����������
        snakeX[2] = 50;snakeY[2] = 100; // �ڶ������������
        fx = "R";
    }

    // ������壬��Ϸ�е����ж����������������������
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ����

        // ���ƾ�̬�����
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // ͷ�������
        g.fillRect(25, 75, 850, 600); // Ĭ�ϵ���Ϸ����


        // ��С�߻���ȥ
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]); // ��ͷ,��Ҫͨ���������ж�
        }else if(fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]); // ��ͷ,��Ҫͨ���������ж�
        }else if(fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]); // ��ͷ,��Ҫͨ���������ж�
        }else if(fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]); // ��ͷ,��Ҫͨ���������ж�
        }

        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]); // ������
        }

        // ��Ϸ״̬
        if(isStart == false) {
            g.setColor(Color.white);
            // ��������
            g.setFont(new Font("΢���ź�", Font.BOLD, 40));
            g.drawString("���¿ո�ʼ��Ϸ", 300,300);
        }
    }
}
