package polymorphism;
/*Assessment: Lab 5
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/

import java.util.ArrayList;
/**
* @author Na Yang
* @see Employees
* @see Supervisors
* @see Millers
* @see Consultants
* @since javac 17.0.1
* @version 2.0
*/
import java.util.Scanner;

/**
 * This class is called the MillerTest Class and provides the main method for
 * your program. This program shows polymorphism by applying a method to objects
 * of different classes. Note that in your program, the Users should be prompted
 * to input hours done worked by each miller. You must implement using an array.
 * The order of the workers in the output is Consultants, Employees and
 * Supervisors. Use the names in the output sample file provided for you. Assume
 * an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
 */

public class MillersTest {

	/**
	 * Main entry point for testing purposes
	 * 
	 * @param args argument list as entered on the command line
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userResponse;

		// Initialize an array of Consultants/Employees/Supervisors with one element
		ArrayList<Millers> millers = new ArrayList<Millers>();
		Consultants consultant = new Consultants("Abby, Obi", 30);
		Employees employee = new Employees("Andrew, Goodman", 26000);
		Supervisors supervisor = new Supervisors("Gloria, Myers", 52520, 30);
		millers.add(consultant);
		millers.add(employee);
		millers.add(supervisor);
		
		
		processUsers(millers, sc);
		ArrayList<Millers> newMillers = new ArrayList<Millers>();
		do {
			System.out.println("Do you want check more user? yes or no.");
			userResponse = sc.next().toLowerCase();

			// If yes, ask for new user details and add them to the appropriate list
			if (userResponse.equals("yes")) {
				sc.nextLine(); // Consume newline left-over
				System.out.println("Please type the user name:");
				String name = sc.nextLine();
				System.out.println("Please type the user wage/annual pay:");
				int wage = sc.nextInt();
				sc.nextLine(); // Consume newline left-over
				System.out.println("Please type the user type from (Consultant(C), Employee(E), and Supervisor)(S):");
				String type = sc.nextLine().toLowerCase();
				Millers newMiller = null;
				switch (type) {
				case "consultant":
				case "c":
					newMiller = new Consultants(name, wage);
					break;
				case "employee":
				case "e":
					newMiller = new Employees(name, wage);
					break;
				case "supervisor":
				case "s":
					newMiller = new Supervisors(name, wage, 30); // Assuming 30 as a default value for extra parameter
					break;
				default:
					System.out.println("Invalid user type.");
				}
				
				//add new miller to both array list
				if (newMillers != null) {
                    millers.add(newMiller);
                    newMillers.add(newMiller); // Add to the list of new millers
                }
				
				if(!newMillers.isEmpty()) {
					System.out.println("Newly added millers:");
					processUsers(newMillers, sc);
				}
			}
			
			
		} while (userResponse.equalsIgnoreCase("yes"));


		
		sc.close();

	}

	public static void processUsers(ArrayList<Millers> millers, Scanner sc) {
		// Loop over the array of consultants
		for (int i = 0; i < millers.size(); i++) {

			System.out.print("Enter the hours done by " + millers.get(i).getName() + " :");
			int hours = sc.nextInt();
			System.out.printf("Total Pay for this miller is: %.1f", millers.get(i).biWeeklyPay(hours));
			System.out.println("");
			System.out.println("");

		}
		System.out.println("");

	}
}
