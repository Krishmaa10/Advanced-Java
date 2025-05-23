package Swings;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {
    JLabel label;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");
        label = new JLabel();
        label.setBounds(50, 50, 600, 100);
        label.setFont(new Font("Arial", Font.BOLD, 40));

        // Load images from project folder (adjust the path as needed)
        ImageIcon clockIcon = new ImageIcon(getClass().getResource("/images/digitalclock.jpg"));
        ImageIcon hourglassIcon = new ImageIcon(getClass().getResource("/images/hourglass.jpg"));

        JButton btnClock = new JButton(" Digital Clock ", clockIcon);
        JButton btnHourGlass = new JButton(" Hour Glass ", hourglassIcon);

        btnClock.setBounds(100, 200, 200, 100);
        btnHourGlass.setBounds(350, 200, 200, 100);

        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}
