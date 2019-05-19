r/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Queueee extends JFrame implements ActionListener{
    JLabel ins;
    JButton one,two,three;
 int[] aq = new int[999];
int choice;
public Queueee(){
 super("Queue");
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new FlowLayout());
 
ins = new JLabel("Instruction \n  press 1 to equeue \n press 2 to dequeue");
one = new JButton("One");
two = new JButton("Two");
three = new JButton("Three");

add(ins);
add(one);
add(two);
add(three);
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    Object o = e.getSource();
    if(o == one ){
        
    }
}
public class Enqueue extends JFrame implements ActionListener{
    
    public Enqueue(){
 super("Queue");
 setVisible(true);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new FlowLayout()); 
       
 for(int i = 0; i <999;i++)
    aq[i] = JOptionPane.showInputDialog(null, "Enter Value");
    }
public void actionPerformed(){
    
}
}
}