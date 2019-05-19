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

public class JChangeFont extends JApplet implements ActionListener {
    JLabel lb = new JLabel("Noel L. Ayco");
    Font bigF = new Font("Arial",Font.BOLD,24);
    JButton btn = new JButton("Clickmee");
public void init(){
    setLayout(new FlowLayout(FlowLayout.CENTER));
    add(lb);
    add(btn);
    btn.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    Object o = e.getSource();
    if(o == btn){
        lb.setFont(bigF);
    }
}
}
    
