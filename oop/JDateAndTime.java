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
import java.util.GregorianCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
public class JDateAndTime extends JApplet implements ActionListener{
    JButton b = new JButton("Click ME!!!");
    JTextField txt = new JTextField(20);

public void init(){
   setLayout(new FlowLayout(FlowLayout.CENTER));
   add(b);
   add(txt);
   b.addActionListener(this);
   
}
public void actionPerformed(ActionEvent e){
    Object o = e.getSource();
if(o ==b){
    GregorianCalendar gC = new GregorianCalendar();
    int day = gC.get(GregorianCalendar.DAY_OF_MONTH);
    int month = gC.get(GregorianCalendar.MONTH)+1;
    int year = gC.get(GregorianCalendar.YEAR);
    int hour = gC.get(GregorianCalendar.HOUR);
    int minute = gC.get(GregorianCalendar.MINUTE);
    int ampm = gC.get(GregorianCalendar.AM_PM);
    
    String strAmPm = "AM";
    if(ampm ==1) strAmPm ="PM";
String msg="Today is:" +month+ "/"+day+"/"+year+" Time is :"+hour+":"+minute+strAmPm;
txt.setText(msg);

}
}
}