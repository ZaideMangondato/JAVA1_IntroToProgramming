package oop;
import java.util.*;
public class2 Insertion`Sort2 {
   static int step = 1;
   private static Scanner keyB = new Scanner(System.in);
   public static void main(String[]args){
       int[] input = new int[5];    
       for(int i = 0;i<input.length;i++){
       System.out.println("Enter five numbers: ");
       input[i] = keyB.nextInt();   
   }
              insertionSort(input);
   }
   private static void printNumbers(int[] input){
       System.out.println("Step "+step);
       System.out.println("-------------------");
       step++; 
       for(int i = 0; i < input.length;i++){
      System.out.print(input[i]+", ");
       }
      System.out.println("\n");
   }
   public static void insertionSort(int array[]){
       int n = array.length;
       for(int j =1;j < n;j++){
       
       int key = array[j];
       int i = j-1;
       while((i>-1)&&(array[i]>key)){
       array[i+1]=array[i];
           i--;
       }
       array[i+1]=key;
       printNumbers(array);
   }
  }
}
