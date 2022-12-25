package com.kuang.snake;

import javax.swing.*;
import java.awt.*;

// 游戏的面板
public class GamePanel extends JPanel {

    // 绘制面板，游戏中的所有东西，都是用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // 清屏

        // 绘制静态的面板
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this, g, 25, 11); // 头部广告栏
        g.fillRect(25, 75, 850, 600); // 默认的游戏界面

    }
}
