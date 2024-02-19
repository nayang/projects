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
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedicalCalculatorTest {
	/**
	 * This test correct returns the calculated Body Mass Index (BMI) from data provided.
	 * return weight * 703 / (height * height);
	 */
	@Test
	void calculateBMI() {
		double weight = 200;
		double height  = 175;
		double expectedBMI = 4.591;
		double actualBMI = MedicalCalculator.calculateBMI(weight, height);
		assertEquals(expectedBMI,actualBMI,0.01);
	}
	/**
	 * This test incorrect returns the calculated Body Mass Index (BMI) from data provided.
	 * return weight + 703 / (height * height);
	 */
	@Test
	void incorrectBMI() {
		
		double weight = 200;
		double height  = 175;
		double expectedBMI = 4.591;
		double incorrectBMI  = MedicalCalculator.incorrectBMI(weight, height);
		//double correctBMI = MedicalCalculator.calculateBMI(weight, height);
		//assertNotEquals(correctBMI,incorrectBMI );
		assertEquals(expectedBMI,incorrectBMI,0.01);
		System.out.printf("correct BMI: %.2f, actualBMI: %.2f" , expectedBMI ,incorrectBMI);
	}

}
