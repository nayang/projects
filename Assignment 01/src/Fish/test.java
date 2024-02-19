package Fish;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		int numberFish;
		double averageWeightPerFish;
		double totalWeight;
		Fish fish;
		
		Scanner sc = new Scanner(System.in);
		fish = new Fish();
		System.out.println("enter the number of fish");
		numberFish = sc.nextInt();
		fish.setNumberFish(numberFish);
		System.out.println("getFishNumber() is"+numberFish);
		
		System.out.println("enter the average weight per fish in kg");
		averageWeightPerFish = sc.nextDouble();
		fish.setAverageWeightPerFish(averageWeightPerFish);
		System.out.println("getaverageWeightPerFish is"+averageWeightPerFish);
		
		System.out.printf("the total weight is %.0f %s", fish.calculateTotalWeight(),"kg");
	}

}
