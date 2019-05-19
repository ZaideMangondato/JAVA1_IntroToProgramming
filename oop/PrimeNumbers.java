package oop;
import java.util.Scanner;

public class PrimeNumbers implements Runnable{
    
    public void run(){
        System.out.println("Please Enter a number");
        int x;
        Scanner key = new Scanner(System.in);
        x = key.nextInt();
        System.out.println(x +" is a PRIME? answer is ----->   " 
                + Prime(x));        
    }       
     
    public static boolean Prime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false;
           }
        }
        return true;
    }
}
class PrimeEx2{    
    public static void main(String args[]){
        Thread t = new Thread(new PrimeNumbers());
        Thread t2 = new Thread(new PrimeNumbers());
        t.start();
     
    }
}