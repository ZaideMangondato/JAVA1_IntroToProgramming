import java.util.Scanner;
public class RandomPower
{
	public static void main(String args[])
	{
		System.out.println("RandomPower.java");
		proceed();
	}
	public static void proceed()
	{
		int ran = ((int)(Math.random() * 100)+1);
		System.out.println("Your power is " + ran + " %");
		if(ran == 100)
		{
			System.out.println("you're fully Powered");
			System.exit(0);
		}
		else
			proceed();
	}
}
		