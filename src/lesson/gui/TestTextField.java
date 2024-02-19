/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author asamaranay
 */
public class TestTextField {

    public static void main(String arg[]) {

        //Initialize the JFrame Object
        JFrame framObj = new JFrame("JTExtField Example");
        
        JTextField txtFldObj = new JTextField();
        txtFldObj.setBounds(50, 60, 200, 50);
        txtFldObj.setBackground(Color.cyan);
                     
        framObj.add(txtFldObj);
        framObj.setSize(400, 600);
        framObj.setLayout(null);
        framObj.setVisible(true);
        
 
        
        


    }

}
