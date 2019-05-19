/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMMouseFramee extends JFrame implements MouseListener {
     Container con = null;
     int x,y;
     int size;
     
     public JMMouseFramee() {
          setTitle("JMouseFrame");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          con = this.getContentPane();
          addMouseListener(this);
     }
     
     public void mousePressed(MouseEvent e) {
          x = e.getX();//getting the X coordinate.
          y = e.getY();//getting the Y coordinate.
          
     }
     
     public void mouseClicked(MouseEvent e) {
         int click = e.getButton();
         //The condition when the user left or right clicks.
         if(click ==MouseEvent.BUTTON1){
               size = 15;
              
         }else{ if(click == MouseEvent.BUTTON3)
             size = 60;
            
         }
         repaint();
         }
    
     public void mouseEntered(MouseEvent e) {
    //The container simply set to background YELLOW when the cursor enters the frame.
         con.setBackground(Color.YELLOW);
     }
     
     public void  mouseExited(MouseEvent e) {
    //The container simply set to background BLACK when the cursor exited the frame.
         con.setBackground(Color.BLACK);
     }

     public void mouseReleased(MouseEvent e) {
     }
     
    
     public void paint(Graphics g) {
      // I have to overload the paint to rendered the components so i call super.
      super.paint(g);
      // The int x and y coordinate, specified where the user left or right clicks.
      // Also, x and y is minus by size to simply put the cursor in the circle when you click.  
      g.drawOval(x-size, y-size, size*3, size*3);  
     }
     public static void main(String[] args) {
          JMMouseFramee mFrame = new JMMouseFramee();
          mFrame.setSize(600,400);
          mFrame.setVisible(true);
     }
}