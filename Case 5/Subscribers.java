/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author zaide
 */
public class Subscribers {
    public static void main(String args[]){
        NewspaperSubscriber[] newsSub = new NewspaperSubscriber[1];
        int x;
        for(x = 0; x < newsSub.length;++x){
            String entry;
            int subType;
            entry = JOptionPane.showInputDialog(null,"Select Service Type\n"
                    + "1 - Week Day Subscriber\n2 - Seven Day Subscriber");
            subType = Integer.parseInt(entry);
            if(subType == 1){
                SevenDaySubscriber sevenSub = new SevenDaySubscriber();
                JOptionPane.showMessageDialog(null,sevenSub.toString());
            }else if(subType == 2){
                WeekdaySubscriber weekSub = new WeekdaySubscriber();
                JOptionPane.showMessageDialog(null,weekSub.toString());
        }
    }
    }
}
