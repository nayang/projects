package polymorphism;
/*Assessment: Lab 5
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/

/**
* @author Na Yang
* @see Employees
* @see MillersTest
* @see Supervisors
* @see Consultants
* @since javac 17.0.1
* @version 2.0
*/

/**
 * THIS IS SUPERCLASS NAMED Millers.
 * 
 * Each miller has a name and a method for computing the bi-weekly pay. YOU DO
 * NOT NEED TO DO MODIFIY THIS CODE.
 */

public class Millers {
	private String name;

	/**
	 * Constructs a miller with an empty name.
	 */
	public Millers() {
		name = "";
	}

	/**
	 * Sets the name of this miller.
	 * 
	 * @param millerName the new name
	 */
	public void setName(String millerName) {
		name = millerName;
	}

	/**
	 * Gets the name of this miller.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This portion of code computes the bi-weekly pay of work done by the miller.
	 * 
	 * @param hoursWorked the number of hours worked bi-weekly
	 * @return the pay for the given number of hours
	 */
	public double biWeeklyPay(int hoursWorked) {
		return 0;
	}
}
