/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author zaide
 */
public class SevenDaySubscriber extends NewspaperSubscriber {
    private double rate;
    public SevenDaySubscriber(){
        super(null, 4.50);
    }@Override
    public void setRate(){
        subAdd = JOptionPane.showInputDialog(null,"Enter Subscribers Street Address : ");
        rate = subRate;
    }@Override
    public String toString(){
        return "Seven Day Subscriber\nSubscribers Street Address: " + getSubAd() + "\nSubscibers Rate: $" + getSubRate();
        
    }
}
