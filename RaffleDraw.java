import java.util.Scanner;
public class RaffleDraw{
	public static void main(String args[]){
		int ran1 = ((int)(Math.random()*20)+1);
		int ran2 = ((int)(Math.random()*20)+1);
		int ran3 = ((int)(Math.random()*20)+1);
		Scanner input = new Scanner(System.in);
		System.out.println("The 1st draw goes to number " + ran1);
		System.out.println("The 2nd draw goes to number " + ran2);
		System.out.println("The 3rd draw goes to number " + ran3);
	}
}
		