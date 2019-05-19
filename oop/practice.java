/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import java.util.GregorianCalendar;
public class practice  {
    public static void main(String[]args)throws InterruptedException{
            while(true){
                GregorianCalendar gc = new GregorianCalendar();
                int hour = gc.get(GregorianCalendar.HOUR);
                int minute = gc.get(GregorianCalendar.MINUTE);
                int seconds = gc.get(GregorianCalendar.SECOND);
                int ampm = gc.get(GregorianCalendar.AM_PM);
                
                String AmPm = "PM";
                if(ampm ==0)AmPm = "AM";
                System.out.println(hour+":"+minute+":"+seconds+":"+AmPm);
                Thread.sleep(10000);
        
    }
}
}
