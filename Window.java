package com.company;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class Window extends JFrame {

    private String s;

    private String checkPalindrome() {
        Palindorme stack = new Palindorme();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        String invertedWord = "";

        while (!stack.isEmpty()) {
            try {
                invertedWord = invertedWord + stack.pop();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println(s);
        System.out.println(invertedWord);
        if (s.equals(invertedWord)) {
            return "It's a true palindrome! ";
        } else {
            return "It's not a palindrome! ";
        }
    }

    public Window() {
        this.setTitle("Palindrome!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();

        JLabel label = new JLabel();
        label.setText("Insert the String please: ");

        JTextField field = new JTextField();
        field.setText(" ");
        field.setSize(120, 50);

        panel.add(label);
        panel.add(field);

        JButton button = new JButton();
        button.setText("Inspect!");

        JLabel label1 = new JLabel();
        label1.setText("Loading...");

        this.add(panel, BorderLayout.NORTH);
        this.add(button, BorderLayout.CENTER);
        this.add(label1, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s = field.getText().toLowerCase().replaceAll("\\s+","");;
                label1.setText(checkPalindrome());
            }
        });

        this.setSize(300, 150);
        this.setVisible(true);
    }
}
