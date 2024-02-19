package pizza;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		double countTopping;
		double costPerTopping;
		double totalToppingCost;
		pizza Pizza;
		
		Scanner sc = new Scanner(System.in);
		Pizza = new pizza();
		System.out.println("enter count of toppings:");
		countTopping = sc.nextDouble();
		Pizza.setCountTopping(countTopping);
		System.out.println("enter cost per toppings:");
		costPerTopping = sc.nextDouble();
		Pizza.setCostPerTopping(costPerTopping);
		System.out.println("getCountTopping() reports:"+countTopping);
		System.out.println("getCostPerTopping() reports:"+costPerTopping);
		System.out.println(Pizza.toString());
		System.out.println("Program by Student na");
	}
}
