package lab3;
/*Assessment: Lab 3
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/

/*
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */


/*	Add an import statement so this class can use the EventSchedule class				*/


/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * Complete the documentation of this class
 *@author Na Yang
 *@version 2.0
 *@see TestDemo
 *@since javac 21.0.1
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		/*	COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
		 *			Hint:  See the SampleOutput provided below to determine what print statements are required.
		*/

		/*
		 *	PROVIDE OUTPUT THAT LOOKS LIKE THE FOLLOWING (without the *):
		 * This was run on January 17, 2024
		 * 
		 * Just creating 4 EventSchedules
		 * 
		 * 
		 * EventSchedule1
		 * EventSchedule(int, int, int) was called
		 * EventSchedule() was called
		 * EventSchedule, 2024/1/17
		 *
		 * 
		 * EventSchedule2
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int) was called
		 * EventSchedule, 2023/1/17
		 * 
		 * 
		 * EventSchedule3
		 * EventSchedule(int, int, int) was called
		 * EventSchedule(int, int) was called
		 * EventSchedule, 2023/12/17
		 * 
		 * 
		 * EventSchedule4
		 * EventSchedule(int, int, int) was called
		 * EventSchedule, 2023/12/15
		 */
		System.out.println("This was run on Feb 20,2024");
		System.out.println();
		System.out.println("Just creating 4 EventSchedules");
		System.out.println();
		
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());
		System.out.println();
		
		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());
		System.out.println();
		
		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023,12).createReport());
		System.out.println();
		
		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023,12,15).createReport());
		
	}

}
