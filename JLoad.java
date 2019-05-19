import java.util.Scanner;
public class JLoad
{
	public static void main(String args[])
	
	{
		int num;
		int amount;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mobile number >> ");
		num = input.nextInt();
		System.out.println("Enter amount >> ");
		amount = input.nextInt();
		System.out.println("the Mobile number "+num+" has been loaded Php"+amount+"\nThank you for using our Services");
	}
}