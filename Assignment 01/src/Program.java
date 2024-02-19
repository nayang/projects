/* student name: Na Yang
 * student number:040744984
 * class section:353
 */

import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		double cylinderRadius;
		double cylinderHeight;
		double cylinderVolume;
		Cylinder cylinder;
		
		cylinder = new Cylinder();//call cylinder object
		//use scanner to get variable cylinderRadius and cylinderHeight
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to My Program");
		System.out.println("Please enter the cylinder height.");
		cylinderHeight = scanner.nextDouble();
		cylinder.setCylinderHeight(cylinderHeight);
		System.out.println("Please enter the cylinder radius.");
		cylinderRadius = scanner.nextDouble();
		cylinder.setCylinderRadius(cylinderRadius);
		
		
		
		System.out.printf("The cylinder volume is: %.2f",cylinder.calculateCylinderVolume());//keep the result with 2 decimals
		System.out.println();
		System.out.println("Program by Na Yang, Lab SEC #353, Lab Professor Mel Sanshagrin.");
	}

}
