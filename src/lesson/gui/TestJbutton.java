/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author asamaranay
 */
public class TestJbutton {
    
    
    public static void main(String arg[]) {
        
        JFrame framObj = new JFrame("JButton Example");
        JButton btnObj = new JButton("Click Me");
        JLabel lb1Obj = new JLabel("MY FIRST GUI Label");
        
        
        
        lb1Obj.setBounds(10, 40, 200, 120);
        btnObj.setBounds(60, 100, 100, 120);
        btnObj.setBackground(Color.red);
        btnObj.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                lb1Obj.setText("CLICKED");
           
            }
     
       });
        
        framObj.add(btnObj);
        framObj.add(lb1Obj);
        framObj.setSize(400, 400);
        framObj.setLayout(null);
        framObj.setVisible(true);
        framObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
    
  
}
