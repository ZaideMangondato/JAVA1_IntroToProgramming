/*
 * To change this template, choose Tools | Templa

/**
 *
 * @author User
 */
package oop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMMouseFrame2 extends JFrame 
     implements MouseListener {
     Container con = null;
     int x,y;
     int size;
     
     public JMMouseFrame2() {
          setTitle("Mouse");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          con = this.getContentPane();
          addMouseListener(this);
     }
     
     public void mousePressed(MouseEvent e) {
          x = e.getX();
          y = e.getY();
        
     }
     
     public void mouseClicked(MouseEvent e) {
         int click = e.getButton();
         if(click ==MouseEvent.BUTTON1){
             repaint();  
             size = 70;
           
         }else{ if(click == MouseEvent.BUTTON2)
               size = 40;
               repaint();
         }
    }
    
     public void mouseEntered(MouseEvent e) {
          con.setBackground(Color.yellow);
     }
     
     public void  mouseExited(MouseEvent e) {
          con.setBackground(Color.black);
     }

     public void mouseReleased(MouseEvent e) {
     }
     
    
     public void paint(Graphics g) {
          g.drawOval(x-size, y-size, size*3, size*3);
     }
     
     public static void main(String[] args) {
          JMMouseFrame2 mFrame = new JMMouseFrame2();
          mFrame.setSize(400,400);
          mFrame.setVisible(true);
     }
}