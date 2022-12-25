package com.kuang.lesson04;

import javax.swing.*;
import java.awt.*;

// ͼ�ꡢ��Ҫʵ���࣬ Frame�̳�
public class IconDemo extends JFrame implements Icon {
    private int width;
    private int height;

    public IconDemo() {} // �޲ι���
    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(15, 15);
        // ͼ����ڱ�ǩ�ϣ�Ҳ���Է��ڰ�ť��
        JLabel label = new JLabel("", iconDemo, SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, width, height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
