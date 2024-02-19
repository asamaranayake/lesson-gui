package lesson.gui;

import javax.swing.*;
import java.awt.event.*;

    public class VTAQuestionSix extends JFrame {

        private JTextField textField1;
        private JTextField textField2;
        private JTextPane textPane;
        private JButton okButton;
        private JButton clearButton;
        private JButton exitButton;

        public  VTAQuestionSix() {
            super("My Swing Form");

            // Initialize components
            textField1 = new JTextField(10);
            textField2 = new JTextField(10);
            textPane = new JTextPane();
            textPane.setBounds(100,100,100,100);
            okButton = new JButton("OK");
            clearButton = new JButton("Clear");
            exitButton = new JButton("Exit");

            // Add event listeners
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text1 = textField1.getText();
                    String text2 = textField2.getText();

                    if (text1.isEmpty() || text2.isEmpty()) {
                        textPane.setText("Please enter values in both fields.");
                    } else {
                        try {
                            int num1 = Integer.parseInt(text1);
                            int num2 = Integer.parseInt(text2);
                            int min = Math.min(num1, num2);
                            int max = Math.max(num1, num2);
                            textPane.setText("Integers between " + min + " and " + max + ":");
                            for (int i = min + 1; i < max; i++) {
                                textPane.setText(" " + i);
                            }
                        } catch (NumberFormatException ex) {
                            textPane.setText("Invalid input. Please enter valid numbers.");
                        }
                    }
                }
            });

            clearButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField1.setText("");
                    textField2.setText("");
                    textPane.setText("");
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });

            // Set layout (replace with your preferred layout)
            JPanel panel = new JPanel();
            panel.add(textField1);
            panel.add(textField2);
            panel.add(textPane);
            panel.add(okButton);
            panel.add(clearButton);
            panel.add(exitButton);
            add(panel);

            // Set window size and visibility
            pack();
            setVisible(true);
        }

        public static void main(String[] args) {
            new VTAQuestionSix();
        }
    }
