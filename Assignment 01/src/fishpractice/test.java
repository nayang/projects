package fishpractice;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		int fishNumber;
		double averageWeightPerFish;
		double totalWeight;
		String toString;
		fish Fish = new fish();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of fish caught:");
		fishNumber = sc.nextInt();
		Fish.setFishNumber(fishNumber);
		System.out.println("getFishNumber() returns: "+fishNumber);
		System.out.println("enter the average per fish:");
		averageWeightPerFish = sc.nextDouble();
		Fish.setAverageWeightPerFish(averageWeightPerFish);
		System.out.println("getAverageWeightPerFish returns: "+averageWeightPerFish);
		
		System.out.println(Fish.toString());
	}
}
