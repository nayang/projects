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
 * This class represents the birth date for a patient.  A birth date, once created
 * cannot be changed.
 * 
 */
public class BirthDate	 {
	/*	Attributes			************************************/
	/**
	 * declare the variable birth day
	 */
	private	int	day;
	/**
	 * declare the variable birth month
	 */
	private	int	month;
	/**
	 * declare the variable birth year
	 */
	private	int	year;	
	
	/*	Constructors		************************************/
	/**
	 * Create the birth date for this patient.
	 * @param year Year of birth (4 numeric characters)
	 * @param month	Month of birth (01 thru 12) (2 digit month)
	 * @param day Day of birth. (2 digit day, 01 thru 30... depending upon the month and year)
	 */
	public	BirthDate(int year, int month, int day)	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/*	Accessors			************************************/
	/**
	 * To get birth day of user.
	 * @return user's day.
	 */
	public int	getDay()		{	return day;			}
	/**
	 * To get birth month of user.
	 * @return user's month.
	 */
	public int	getMonth()	{	return month;		}
	/**
	 * To get birth year of user.
	 * @return user's year.
	 */
	public int	getYear()	{	return year;		}
	
	
	/* Modifiers			************************************/
	/**
	 * To set birth day of user.
	 * @param day user's day.
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * To set birth month of user.
	 * @param month user's month.
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * To set birth year of user.
	 * @param year user's year.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	
	/*	Normal Behavior	************************************/
	/**
	 * To formatted string for the birth date in the format yyyy/mm/dd.
	 * @return formattedBirthDate format the user's birthday.
	 */
	public String formattedBirthDate()	{
		
		return this.year+"/"+this.month+"/"+this.day;
	}

	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	public String toString()	{
		return  "[year=" + year + ", month=" + month + ", day=" + day + "]"; 
	}
	
	/*	Helper Methods		************************************/

}