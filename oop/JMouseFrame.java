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
public class JMouseFrame extends JFrame implements MouseListener {
     
    int x,y;
    public JMouseFrame(){
        super("Mouse Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,400);
        addMouseListener(this);
 
    }
    public void mouseClicked(MouseEvent e){
        Graphics pen = getGraphics();
        int click = e.getButton();
        if(click == MouseEvent.BUTTON1){
            pen.drawOval(x-80, y-80, 140, 140);
        }else{
            if(click == MouseEvent.BUTTON3)
            pen.drawOval(x-140, y-140, 280, 280);
        }
           
         repaint();       
        
    }
    public void mouseEntered(MouseEvent e){
       Object source = e.getSource();
       Container con = getContentPane();
       con.setBackground(Color.YELLOW);
       
    }
    public void mouseExited(MouseEvent e){
       Object source = e.getSource();
       Container con = getContentPane();
       con.setBackground(Color.BLACK);
    }
    public void mousePressed(MouseEvent e){
          x = e.getX();
          y = e.getY();
    }
    public void mouseReleased(MouseEvent e){
        
    }
    public void pain(Graphics g){
        super.paint(g);
    }
    public static void main(String[]args){
        new JMouseFrame();
    }
}


