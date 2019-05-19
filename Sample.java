import java.util.Scanner;
public class Sample{
	public static void main(String args[]){
		//Declarations
		int res;
		Scanner press = new Scanner(System.in);
		//The Display Generator or the OUTPUT
		System.out.println("Press \"1\" to continue");
		res = press.nextInt();
		if(res == 1)
			proceed();
		else
			System.exit(0);
	}
	public static void proceed(){
		//Declarations
		String a = "apple";
		String b = "bottle";
		String c = "cat";
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}