package cat;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int catWeight;
		int catCount;
		int catTotalWeight;
		cat Cat;
		
		Scanner sc = new Scanner(System.in);
		Cat = new cat();
		System.out.println("enter cat count");
		catCount = sc.nextInt();
		//Cat.setCatCount(catCount);
		System.out.println("enter cat weight");
		catWeight = sc.nextInt();
		//Cat.setCatWeight(catWeight);
		Cat = new cat(catWeight,catCount);
		System.out.println(Cat.toSting());
		
	}

}
