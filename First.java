public class First{
	public static void main(String args[]){
		nameAndAddress();
		System.out.println("First Java App");
		predictRaise();
	}
	public static void nameAndAddress(){
		System.out.println("Mangondato Programming Studio");
		System.out.println("Central Poblacion Kalilangan Bukidnon");
		System.out.println("Owned and Manage by Zaide A. Mangondato");
	}
	public static void predictRaise(double moneyAmount){
		double newAmount;
		final double RAISE_AMOUNT = 1.10;
		newAmount = moneyAmount * RAISE_AMOUNT;
		System.out.println("With raise, salary is " + newAmount);
	}
}