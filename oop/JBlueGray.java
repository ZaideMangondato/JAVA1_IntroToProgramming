/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBlueGray extends JFrame implements ActionListener{
   String name = "Noel L. Ayco";
    JButton btn = new JButton("Click me!!!");
    Font bigF = new Font("Arial",Font.BOLD,24);
    private static int counter =1;
public JBlueGray(){
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(300,500);
 setVisible(true);
 add(btn);
 setLayout(new FlowLayout(FlowLayout.CENTER));

btn.addActionListener(this);

}
public void actionPerformed(ActionEvent e){
    Object o =e.getSource();
 
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.drawString(name,50,50);
        counter = counter +1;
    
    if(counter==2){
        setBackground(Color.BLACK);
      
        g.setColor(Color.DARK_GRAY);
        g.setFont(bigF);
        g.drawString(name, 50, 50);
    }
}
public static void main(String[]args){
    new JBlueGray();
}
}