package lesson.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class FirstGUI {

    public static void main(String[] args){
        JFrame baseFrame =  new JFrame();
        JLabel lblOne = new JLabel("MY FIRST J LABEL");
        lblOne.setBounds(10,10,500,100);
        Color color = new Color(156, 43, 43);
        Font font = new Font("TIME NEW ROMAN",Font.ITALIC,30);
        lblOne.setFont(font);
        lblOne.setText("MY SECOND J LABEL");
        lblOne.setForeground(color);
        baseFrame.add(lblOne);
        baseFrame.setSize(900,1000);
        baseFrame.setLayout(new BorderLayout());
        baseFrame.setVisible(true);
        baseFrame.setTitle("TITLE TEST");
        baseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



}
