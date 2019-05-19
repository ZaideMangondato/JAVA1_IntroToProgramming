/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author zaide
 */
public class WeekdaySubscriber extends NewspaperSubscriber {
        private double rate;
    public WeekdaySubscriber(){
        super(null, 3.50);
    }   @Override
        public void setRate(){
        subAdd = JOptionPane.showInputDialog(null,"Enter Subscribers Street Address : ");
        rate = subRate;
    }@Override
    public String toString(){
        return "Weekday Subscriber\nSubscribers Street Address: " + getSubAd() + "\nSubscibers Rate: $" + getSubRate();
        
    }
}
