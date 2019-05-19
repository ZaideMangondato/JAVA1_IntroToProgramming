/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaide
 */
public abstract class NewspaperSubscriber {
    protected String subAdd;
    protected double subRate;
    int length;
    //protected double rate;
    public NewspaperSubscriber(String subAdd, double subRate){
        setSubAdd(subAdd);
        setSubRate(subRate);
        setRate();
    }public String getSubAd(){
        return subAdd;
    }public double getSubRate(){
        return subRate;
    }public void setSubAdd(String add){
        subAdd = add;
    }public void setSubRate(double rate){
        subRate = rate;
    }public abstract void setRate();
}
