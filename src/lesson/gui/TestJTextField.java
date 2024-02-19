package lesson.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJTextField {

    public static void main(String[] args){

        JFrame frameOne = new JFrame();
        frameOne.setTitle("Test JTextField");
        frameOne.setSize(800, 600);

        JTextField textField = new JTextField();
        textField.setSize(1000,1000);

        JButton jButton = new JButton();
        jButton.setText("Click ME");
        jButton.setSize(200,300);

        JLabel labelOne = new JLabel();
        labelOne.setBounds(100,-50,200,200);
        labelOne.setText("Enter Any thing and Click the Button");
        labelOne.setBackground(Color.BLUE);
        labelOne.setVisible(true);

        frameOne.add(textField);
        frameOne.add(labelOne);
        frameOne.add(jButton);

        frameOne.setVisible(true);
        frameOne.setLayout(new GridLayout());
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String userEnteredText =  textField.getText();
                labelOne.setText(userEnteredText);
            }

        });

    }

}
