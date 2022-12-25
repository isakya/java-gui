package com.kuang.lesson02;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 输入框事件监听
public class TestText01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        TextField textField = new TextField();
        add(textField);

        // 监听这个文本框输入的文字
        MyActionListrner2 myActionListrner2 = new MyActionListrner2();
        // 按下回车就会触发这个输入框的事件
        textField.addActionListener(myActionListrner2);

        // 设置替换编码
        textField.setEchoChar('*');

        pack();
        setVisible(true);
    }
}

class MyActionListrner2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource(); // 获得一些资源, 返回一个对象
        System.out.println(field.getText()); // 获得输入框中的文本
        // 事件处理完后清空文本
        field.setText("");
    }
}