package com.kuang.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 游戏的面板
public class GamePanel extends JPanel implements KeyListener, ActionListener {

    // 定义蛇的数据结构
    int length; // 蛇的长度
    int[] snakeX = new int[600]; // 蛇的x坐标 25*25
    int[] snakeY = new int[500]; // 蛇的y坐标 25*25
    String fx; // 初始方向
    // 游戏当前的状态：开始、停止
    boolean isStart = false; // 默认不开始

    // 定时器
    Timer timer = new Timer(100, this); // 100毫秒执行一次


    // 构造器
    public GamePanel() {
        init();
        // 获得焦点和键盘事件
        this.setFocusable(true); // 获得焦点事件
        this.addKeyListener(this); // 获得键盘监听事件
        timer.start(); // 游戏一开始、定时器就启动
    }

    // 初始化方法
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; // 脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100; // 第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100; // 第二个身体的坐标
        fx = "R";
    }

    // 绘制面板，游戏中的所有东西，都是用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏

        // 绘制静态的面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // 头部广告栏
        g.fillRect(25, 75, 850, 600); // 默认的游戏界面


        // 把小蛇画上去
        if (fx.equals("R")) {
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]); // 蛇头,需要通过方向来判断
        }else if(fx.equals("L")) {
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]); // 蛇头,需要通过方向来判断
        }else if(fx.equals("U")) {
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]); // 蛇头,需要通过方向来判断
        }else if(fx.equals("D")) {
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]); // 蛇头,需要通过方向来判断
        }

        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]); // 蛇身体
        }

        // 游戏状态
        if(isStart == false) {
            g.setColor(Color.white);
            // 设置字体
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("按下空格开始游戏", 300,300);
        }
    }

    // 键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode(); // 获得键盘按键
        if(keyCode == KeyEvent.VK_SPACE) {
            isStart = !isStart;
            repaint();
        }
        // 小蛇移动
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

    // 事件监听 --- 需要通过固定时间来刷新，1s=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart) { // 如果游戏是开始状态，就让小蛇动起来！
            // 移动
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i-1]; // 向前移动一节
                snakeY[i] = snakeY[i-1];
            }
            // 走向
            if(fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                // 边界判断
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

            repaint(); // 重绘页面
        }
        timer.start(); // 定时器开启
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
