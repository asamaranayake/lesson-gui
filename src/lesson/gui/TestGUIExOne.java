/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.gui;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author asamaranay
 */
public class TestGUIExOne {
    
    public static void main(String[] args) {
        JFrame framObj = new JFrame("Welcome");
        
        JLabel lblName = new JLabel("Enter Your Name");
        JTextField txtName = new JTextField();
        JButton jButton = new JButton("Submit");
                
        lblName.setBounds(0,60,100,120);
        
        txtName.setBounds(150,60, 50,50);
        jButton.setBounds(100, 0, 60,60);
        
        framObj.add(lblName);
        framObj.add(txtName);
        framObj.add(jButton);
        framObj.setSize(400,400);
        framObj.setVisible(true);
        GridLayout gridLayoutObj = new GridLayout();
        gridLayoutObj.setHgap(10);
        gridLayoutObj.setVgap(10);
        framObj.setLayout(gridLayoutObj);
        framObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
