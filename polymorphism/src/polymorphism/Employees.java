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
* @see Consultants
* @see MillersTest
* @see Millers
* @see Supervisors
* @since javac 17.0.1
* @version 2.0
*/
/**
This class represents the employee. An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/
/*	DECLARE THE CONSULTANT CLASS AND ITS VARIABLES.
 */
    public class Employees extends Millers{
    	private double annualPay;

/**
 * constructs an employee with a given name and an annual pay.
 * @param name the name of employee
 * @param pay the annual pay of the employee
*/
    	// CODE FOR Employees constructs   	
    public Employees(String name, double pay) {
    	setName(name);
    	this.annualPay = pay;
    }

    /*	this code to calculate the bi-weekly pay for the Employees
     * 
     */
	/**
	 * calculate the employee's bi-weekly pay
	 * @param hoursWorked the number of hours worked bi-weekly 
	 * @return pay the bi-weekly pay for the employee
	 */
    @Override
	public double biWeeklyPay(int hoursWorked)	{
		double pay = annualPay / 26;
   
      return pay;
	}
}