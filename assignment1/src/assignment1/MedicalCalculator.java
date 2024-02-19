package assignment1;
/*Assessment: Assignment 1
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 1.0
@since javac 21.0.1
*/
/**
 * Class to apply calculations to specific type of EMR's and data. Currerntly
 * supports BMI (Body Mass Index) calculations.
 */
public class MedicalCalculator {
	private MedicalCalculator() {
	}

	/**
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * 
	 * @param weight the Weight of the patient in pounds.
	 * @param height the Height of the patient in inches.
	 * @return BMI value
	 */
	public static double calculateBMI(double weight, double height) {
		return weight * 703 / (height * height);
	}

	/**
	 * Incorrect BMI calculation method with a deliberate error in the math.
	 * @param weight the weight of user
	 * @param height the height of user
	 * @return incorrect BMI value;
	 */
	public static double incorrectBMI(double weight, double height) {
		return weight + 703 / (height * height);
	}

	/**
	 * Main entry point for quick and dirty test purposes.
	 * 
	 * @param args Command line arguments submitted thru the VM
	 */
	public static void main(String[] args) {
		System.out.println("BMI:" + calculateBMI(165, 69));

		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}
}