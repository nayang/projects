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
* @see Millers
* @see Supervisors
* @since javac 17.0.1
* @version 2.0
*/
/**
 * This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/

/*	DECLARE THE CONSULTANT CLASS AND ITS VARIABLES.
 */
		public class Consultants extends Millers{
			private double consultantWage;
			
/**
 * This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
 * @param name the name of this consultant
 * @param wage the consultant wage per hour 
 */

// CODE FOR CONSULTANT constructs
		public Consultants(String name, double wage) {
			setName(name);
			this.consultantWage = wage;
		}


/*	this code to calculate the bi-weekly pay for the consultant
 * 
 */

	/**
	 * calculate the bi-weekly pay for the consultant.
	 * @param hoursWorked the number of hours worked bi-weekly
	 * @return pay the consultant bi-weekly pay
	 */
	@Override
	public double biWeeklyPay(int hoursWorked)	{
		double pay = hoursWorked * consultantWage;
	
		// In this part of code, an overtime amount is added if the Consultant works for more than 76 hours bi-weekly.
		// Review this portion of code carefully to include the code to fully satisfy this condition.
	
		if(hoursWorked > 76) {
      pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
		}
      return pay;
	
}
}