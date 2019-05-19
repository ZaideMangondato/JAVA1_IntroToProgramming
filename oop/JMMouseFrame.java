/*
 * To change this template, choose Tools | Templa

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMMouseFrame extends JFrame 
     implements MouseListener {
     Container con = null;
     int x,y;
     int size,size2;
     
     public JMMouseFrame() {
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
         Graphics g= getGraphics();
         if(click == MouseEvent.BUTTON1){
             g.drawOval(x-size, y-size, size*3, size*3);  
             size = 60;
         }else{
             Graphics g2= getGraphics();
             if(click == MouseEvent.BUTTON2) 
              size2 = 4;
             g2.drawOval(x-size, y-size, size*3, size*3);
                
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
          
     }
     
     public static void main(String[] args) {
          JMMouseFrame mFrame = new JMMouseFrame();
          mFrame.setSize(400,400);
          mFrame.setVisible(true);
     }
}