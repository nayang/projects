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
public class ButtonCounterTester	{

	public static void main(String[] args)	{
		ButtonCounter tally = new ButtonCounter();
		tally.add();
		tally.add();
		tally.add();
		System.out.println(tally.getCount());
		System.out.println("Expected: 3");
		tally.minus();
		System.out.println(tally.getCount());
		System.out.println("Expected: 2");
		tally.minus();
		tally.minus();
		tally.minus();
		System.out.println(tally.getCount());
		System.out.println("Expected: 0");
	}
}
