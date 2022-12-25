package com.kuang.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {

    public JScrollDemo() {
        Container container = getContentPane();

        // Œƒ±æ”Ú
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("izumi");
        
        // Scroll√Ê∞Â
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(300,300,300,300);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
