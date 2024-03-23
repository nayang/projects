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
* @see Consultants
* @since javac 17.0.1
* @version 2.0
*/
/**
This code should contain your Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
You must implement the bi-weekly pay for the employee according to instructions provided.
*/
/*	DECLARE THE Supervisors CLASS AND ITS VARIABLES.
 */
	public class Supervisors extends Employees{
		private double biWeeklyBonus;
		
	

/**
 * Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
 * @param name the name of this employee
 * @param pay the annual pay
 * @param biWeeklyBonus the bi-weekly bonus
 */
		// CODE FOR Supervisors constructs 
	public Supervisors(String name, double pay, double biWeeklyBonus) {
		super(name,pay);
		this.biWeeklyBonus = biWeeklyBonus;
	}
	
	/**
     * caculate the bi-weekly pay for the supervisor
     * @param hoursWorked the number of hours worked bi-weekly
     * @return pay the bi-weekly pay for the supervisor
     */
	/*	CODE FOR COMPUTING THE BI-WEEKLY PAY FOR THIS CATEGORY OF MILLER 
	 * 
	 */
	@Override
	public double biWeeklyPay(int hoursWorked) 
    {
        double pay = super.biWeeklyPay(hoursWorked) + biWeeklyBonus;
        return pay;
    }
// Hint: Note the relationship between this class and any other class. How will you apply that to your code?
	
	
	}