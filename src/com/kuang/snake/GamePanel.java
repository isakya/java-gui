package com.kuang.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

// ��Ϸ�����
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    // �����ߵ����ݽṹ
    int length; // �ߵĳ���
    int[] snakeX = new int[600]; // �ߵ�x���� 25*25
    int[] snakeY = new int[500]; // �ߵ�y���� 25*25
    String fx; // ��ʼ����
    // ʳ�������
    int foodx;
    int foody;
    Random random = new Random();
    // ��Ϸ��ǰ��״̬����ʼ��ֹͣ
    boolean isStart = false; // Ĭ�ϲ���ʼ
    int score; // �ɼ�
    // ��ʱ��
    Timer timer = new Timer(100, this); // 100����ִ��һ��

    // ��Ϸ�Ƿ�ʧ��
    boolean isFail = false; // Ĭ�ϲ�ʧ��


    // ������
    public GamePanel() {
        init();
        // ��ý���ͼ����¼�
        this.setFocusable(true); // ��ý����¼�
        this.addKeyListener(this); // ��ü��̼����¼�
        timer.start(); // ��Ϸһ��ʼ����ʱ��������
    }

    // ��ʼ������
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; // �Դ�������
        snakeX[1] = 75;snakeY[1] = 100; // ��һ�����������
        snakeX[2] = 50;snakeY[2] = 100; // �ڶ������������
        fx = "R";
        // ��ʳ������ֲ��ڽ�����
        foodx = 25 + 25*random.nextInt(34);
        foody = 75 + 25*random.nextInt(24);
        score = 0;
    }

    // ������壬��Ϸ�е����ж����������������������
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // ����

        // ���ƾ�̬�����
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // ͷ�������
        g.fillRect(25, 75, 850, 600); // Ĭ�ϵ���Ϸ����
        // ������
        g.setColor(Color.ORANGE);
        g.setFont(new Font("΢���ź�", Font.BOLD, 18));
        g.drawString("���� " + length, 750, 35);
        g.drawString("���� " + score, 750, 50);

        // ʳ��
        Data.food.paintIcon(this, g, foodx, foody);
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

        if(isFail) {
            g.setColor(Color.RED);
            // ��������
            g.setFont(new Font("΢���ź�", Font.BOLD, 40));
            g.drawString("ʧ�ܣ����¿ո����¿�ʼ", 300,300);
        }
    }

    // ���̼����¼�
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode(); // ��ü��̰���


        if(keyCode == KeyEvent.VK_SPACE) {
            if(isFail) {
                isFail = false;
                init();
            } else {
                isStart = !isStart;
            }
            repaint();
        }
        // С���ƶ�
        if(keyCode == KeyEvent.VK_UP) {
            fx = "U";
        } else if(keyCode == KeyEvent.VK_DOWN) {
            fx = "D";
        }else if(keyCode == KeyEvent.VK_LEFT) {
            fx = "L";
        }else if(keyCode == KeyEvent.VK_RIGHT) {
            fx = "R";
        }
    }

    // �¼����� --- ��Ҫͨ���̶�ʱ����ˢ�£�1s=10��
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart && isFail == false) { // �����Ϸ�ǿ�ʼ״̬������С�߶�������
            // ��ʳ��
            if(snakeX[0] == foodx && snakeY[0] == foody) {
                length++; // ���峤�� + 1
                // �ٴ��������ʳ��
                foodx = 25 + 25*random.nextInt(34);
                foody = 75 + 25*random.nextInt(24);
                // ����+10
                score += 10;
            }
            // �ƶ�
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i-1]; // ��ǰ�ƶ�һ��
                snakeY[i] = snakeY[i-1];
            }
            // ����
            if(fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                // �߽��ж�
                if(snakeX[0] > 850) { snakeX[0] = 25; }
            } else if(fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                if(snakeX[0] < 25) { snakeX[0] = 850; }
            } else if(fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                if(snakeY[0] < 75) { snakeY[0] = 650; }
            } else if(fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                if(snakeY[0] > 650) { snakeY[0] = 75; }
            }
            // ʧ���жϣ�װ���Լ���ʧ��
            for (int i = 1; i < length; i++) {
                if(snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint(); // �ػ�ҳ��
        }
        timer.start(); // ��ʱ������
    }

    @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyReleased(KeyEvent e) { }
}
