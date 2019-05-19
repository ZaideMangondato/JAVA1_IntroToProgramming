/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
public class JFontSizeDemo extends JFrame {
    String fname = "Noel";
    public JFontSizeDemo(){
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    public void paint(Graphics g){
        super.paint(g);
        for(int i = 4; i<=24;i+=2){
        g.setFont(new Font("Arial",Font.BOLD,i));
        g.drawString(fname + i, 100, i*15);
        }
}
    public static void main(String[]args){
        new JFontSizeDemo();
                
                
    }
}
