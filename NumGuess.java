import java.util.Scanner;
public class NumGuess {
    public static void main(String args[]){
        proceed();
    }
    public static void proceed(){
        int response;
        int num = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        //System.out.println("Hint: " + num);
        System.out.println("Guess a Number from 1 to 10");
        response = input.nextInt();
        if(response > num){
            System.out.println("the answer is " + num);
            System.out.println("Your guess is too much high");
            proceed();
        }
        else if(response < num){
            System.out.println("the answer is " + num);
            System.out.println("Your guess is too much low");
            proceed();
        }
        else
            System.out.println("the answer is " + num);
            System.out.println("Your Guess is Correct");
            System.exit(0);
    }
}