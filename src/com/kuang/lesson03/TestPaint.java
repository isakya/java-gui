package com.kuang.lesson03;
import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200,200, 600, 400);
        setVisible(true);
    }

    // 画笔
    @Override
    public void paint(Graphics g) {
        // 画笔，需要有颜色，画笔可以画画
        g.setColor(Color.red);
        g.drawOval(100,100, 100, 100);
        g.fillOval(100,100, 100, 100); // 实心的圆

        g.setColor(Color.GREEN);
        g.fillRect(150, 200, 200,200);

        // 画笔用完，将他还原到最初的颜色
        g.setColor(Color.BLACK);
    }
}
