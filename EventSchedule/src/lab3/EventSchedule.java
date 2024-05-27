package lab3;

import java.util.Calendar;

/*Assessment: Lab 3
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/ 

/*
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Na Yang. 
 */

/**
 * Complete the documentation for this class.  Correct in the code any method names that do not
 * 		follow or adhere to acceptable naming standards.
 * 
 *  
 * This class is named EventSchedule Class. It shows constructor chaining using
 * keyword "this". In this code, the simpler constructors all call the more
 * complex one, thereby chaining the calls 'UPWARDS' (from the default
 * constructor to the one with the most arguments. Ensure that you implement it
 * in this order).
 * 
 * EventSchedule() calls EventSchedule(int, int, int), program flow returns to
 * EventSchedule() and exits the constructor.
 * 
 * EventSchedule(int) calls EventSchedule(int, int, int), program flow returns
 * to EventSchedule(int) and exits the constructor.
 * 
 * EventSchedule(int, int) calls EventSchedule(int, int, int), program flow
 * returns to EventSchedule(int, int) and exits the constructor.
 * 
 * EventSchedule(int, int, int) just assigns the values.
 * 
 * NOTE: The constructors in this code have System.out.println(a-message) in
 * them, for demonstration purposes only. DO NOT PUT input / output into
 * constructors in real production code!!!
 * 
 *@author Na Yang
 *@version 2.0
 *@see TestDemo
 *@since javac 21.0.1
 */
public class EventSchedule {

	/** Year component of the date of EventSchedule.											*/
	private int year;

	/** Month component of the date of																*/
	private int month;

	/** Day component of the date of EventSchedule.												*/
	private int day;


	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	public EventSchedule() {
		/*	Write the code to implement the initialization activities of this constructor as described above.
		 *			Hint: check out the documentation for the Calendar class (getInstance()) to get the current date values etc... 
		 */
		this(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH)+1, Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule() was called");
		
	}

	/**
	 * This constructor sets the year as passed, month to current month, and day to current day.
	 * @param year The year of this EventSchedule.
	 */
	public EventSchedule(int year) {
		/*	Write the code to implement the initialization activities of this constructor as described above.					*/
		this(year,Calendar.getInstance().get(Calendar.MONTH)+1, Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int) was called");
	}
	

	/**
	 * This constructor sets the year as passed, month as passed, and day to current
	 * day.
	 * @param year  The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 */

	/*		Write the constructor code to implement the initialization activities of this constructor as described above.					*/
	public EventSchedule(int year, int month) {
		/*	Write the code to implement the initialization activities of this constructor.					*/
		this(year,month,Calendar.getInstance().get(Calendar.DATE));
		System.out.println("EventSchedule(int,int) was called");
	}

	/**
	 * This constructor sets the year as passed, month as passed, and day as passed.
	 * @param year  The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day   of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		/*	Write the code to implement the initialization activities of this constructor.					*/
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("EventSchedule(int,int,int) was called");
	}


	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}

	/**
	 * Returns true if this EventSchedule is hybrid, false if it is not.
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Returns the day for this EventSchedule.
	 * 
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}

	
	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}


	/**
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */
	/*	Write the code to implement the method to set the month attributes.			*/
	public void setMonth(int month) {
		this.month = month;
	}


	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}

	/**
	 * Convert this class into a meaningul string.
	 * @return	This object as a string showing the class, each instance variable name and value pair
	 */
	public String toString()	{
		/*	Write the code to implement the toString() method so a string is returned in the following format:
		 *		<class name>:[attribute_Name=attribute_value,attribute_name=attibute_value....] 
		 *		Hint: check out the getClass() method and its getName() method
		 */
		 return String.format("EventSchedule:year=%d, month=%d, day=%d", year, month, day);
	}
	
	/**
	 * @return A formatted String representation of this EventSchedule, each field is
	 *         separated by a forward slash in the order of 2 digit year, month and day
	 */
	public String createReport() {
		 return String.format("EventSchedule, %02d/%02d/%02d", year, month, day);
	}

}
