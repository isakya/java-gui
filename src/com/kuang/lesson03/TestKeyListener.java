package com.kuang.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// 监听键盘事件
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame {
    public KeyFrame() {

        setBounds(200,200,400,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            // 键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取当前键盘的码
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_UP) {
                    System.out.println("你按下了上键");
                }
            }
        });
    }
}
