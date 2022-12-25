package com.kuang.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

// �������¼�
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("��ͼ");
    }
}

class MyFrame extends Frame {
    // ������Ҫ���ʣ���Ҫ������ǰ����λ�ã���Ҫ�������洢�����
    ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);

        // ��������ĵ�
        points = new ArrayList<>();

        // ���������������������
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // ���������������¼�
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    // ���һ���㵽������
    public void addPaint(Point point) {
        points.add(point);
    }

    // ������ģʽ
    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            // �����ʱ��ͻ��ڽ����ϲ���һ����
            // �����������ĵ�
            frame.addPaint(new Point(e.getX(), e.getY()));

            // ÿ�ε����궼��Ҫ���»�һ��
            frame.repaint();
        }
    }

}