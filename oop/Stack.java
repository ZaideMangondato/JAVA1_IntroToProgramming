/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Ayco
 */
import java.util.Scanner;
public class Stack {
    public static void main(String[]args){
        int[] stack = new int[5];
        int i=0 ;
        int stack2;
        int number;
       Boolean isEmpty= true;
    
         Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        number =  input.nextInt();
        if(number == 1){
             for(; i <= stack.length;)
            System.out.println("Enter value \npush value to the stack ");
            stack2 = input.nextInt();
            stack2 = stack[i];  
            i++;
                      
            
            System.out.println(stack2);
        }      
        
    }
        
}
    
    

