/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayco
 */
package oop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OOP extends JFrame implements ActionListener {
        JLabel label = new JLabel("Enter your name ");
        JTextField field = new JTextField(12);
        JButton button = new JButton("OK");
         
        
public OOP(){
    super("JButton");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(label);
    add(button);
    add(field);
    button.addActionListener(this);
    field.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    label.setText("Thank you");
    button.setText("Done");
}   
public static void main(String[]args){
    OOP aFrame = new OOP();
    final int width = 350;
    final int height = 150;
    aFrame.setSize(width,height);
    aFrame.setVisible(true);
}
}