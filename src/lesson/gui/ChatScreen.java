package lesson.gui;

import javax.swing.*;
import java.awt.*;

public class ChatScreen {


    public static void main(String args[]) {


        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar ob = new JMenuBar();
        JMenu ob1 = new JMenu("FILE");
        JMenu ob2 = new JMenu("Help");
        ob.add(ob1);
        ob.add(ob2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        ob1.add(m11);
        ob1.add(m22);

        JPanel panel = new JPanel(); // the panel is not visible in output
        panel.setSize(50,50);
        JPanel panel2 = new JPanel();
        panel2.setSize(100,200);
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        JTextArea ta = new JTextArea("TEST");
        panel2.add(ta);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.EAST, ta);
        frame.getContentPane().add(BorderLayout.PAGE_START,ob);
        frame.setVisible(true);
    }
}
