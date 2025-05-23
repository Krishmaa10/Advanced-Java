package Swings;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class SwingExample {
    SwingExample() {
        JFrame jfrm = new JFrame("A Simple Swing Application");
        jfrm.setSize(700, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel(" Hello! I am Krishma Shetty!");
        jlab.setFont(new Font("Verdana", Font.PLAIN, 32));
        jlab.setForeground(new Color(0, 0, 255));

        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
