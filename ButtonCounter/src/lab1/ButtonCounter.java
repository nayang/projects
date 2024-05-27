package lab1;
/*Assessment: Lab 1
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/

/**
@author Na Yang
@version 1.0
@see ButtonCounterTester
@since javac 21.0.1
*/
public class ButtonCounter		{
	/** TODO: Document me				*/
	private int count;

	/**
	 *Gets the current count of this counter
	 *@return the current count
	 */
	public int getCount()		{
		/*	TODO:	Complete the implementation of  this method		*/
		return count;
	}


	/**
	 *	increment the current value of this counter by 1.
	 */
	public void add()	{
		/*	TODO: Implement the statement(s) to increment the current value of this counter by 1.		*/
		count = count + 1;
	}

	/**
	 *	Resets the value of this counter to 0.
	*/
	public void reset()	{
		/*	TODO:	Implement the statement(s) that Resets the value of this counter to 0.					*/
		count = 0;

	}


	/**
	 *	Undoes a click, but prevents the tally from dropping below 0.
	 */
	public void minus()	{
		/*	TODO:	Implement the statements that Undoes a click, but prevents the tally from dropping below 0.		*/
		count = Math.max(count -1, 0);
	}
}