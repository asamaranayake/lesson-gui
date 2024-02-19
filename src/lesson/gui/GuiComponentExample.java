/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class GuiComponentExample {

    public static void main(String[] args) {

        // |Creating Component objects
        JFrame frameObj = new JFrame("My First JFrame");
        JLabel lableOne = new JLabel("LABEL ONE");
        JLabel lableTwo = new JLabel("LABEL TWO");
        JTextField textFlfOne = new JTextField("TEXT HERE");
        JButton buttonObject = new JButton("Click me");
        
        
        JMenuBar menuBarObj = new JMenuBar();
        JMenu fileMenu = new JMenu("FILE");
        JMenuItem newMenuItem = new JMenuItem("New File");

        fileMenu.add(newMenuItem);
        menuBarObj.add(fileMenu);

        // Set Label Bounds 
        lableOne.setBounds(50, 50, 100, 100);
        lableTwo.setBounds(50, 80, 100, 100);

        textFlfOne.setBounds(170, 50, 100, 50);
        buttonObject.setBounds(170, 70, 100, 100);
        buttonObject.setBackground(Color.red);
        buttonObject.setEnabled(true);
        //Set UI Layout
        frameObj.setLayout(null);

        //Add lable component into the Frame
        frameObj.add(lableOne);
        frameObj.add(lableTwo);
        frameObj.add(textFlfOne);
        frameObj.add(buttonObject);
        // Set Menu Bar object into Frame
        frameObj.setJMenuBar(menuBarObj);

        // SET Frame properties
        frameObj.setSize(400, 400);
        frameObj.setDefaultCloseOperation(3);
        frameObj.setVisible(true);
    }

}
