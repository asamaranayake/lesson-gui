/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.gui;

import javax.swing.*;
/**
 *
 * @author asamaranay
 */
public class TestJlable {
    
     public static void main(String[] args) {   
        
         JFrame frameObj = new JFrame("JLabel Example");
         JLabel lb1Obj = new JLabel("MY FIRST GUI Label");
         lb1Obj.setBounds(40, 40, 200, 120);
         
         frameObj.add(lb1Obj);
         frameObj.setSize(400, 600);
         frameObj.setLayout(null);
         frameObj.setVisible(true);
         frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
    }
    
}
