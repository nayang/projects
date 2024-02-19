package domain;
/*Assessment: Lab 4
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/ 
/**
 * You were at Walmart near your home to make some purchases last weekend. You
 * had so much coins including nickels, dimes, etc and wanted to just use them
 * all for your purchases. A cash register sums up the sales and then computes
 * the change due to you.
 */
/**
* Uses JUnit version 5
* @author Na Yang
* @version 1.0.7
*/
public class YourPurchases {
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;
	
	public double getPurchase() {
		return this.purchase;
		}
	public double getPayment() {
		return this.payment;
	}
	/**
	 * Constructs a cash register - your purchases- with no money in it.
	 */
	public YourPurchases() {
		purchase = 0;
		payment = 0;
	}

	/**
	 * Records the purchase price of an item.
	 * @param amount the price of the purchased item
	 */
	public void recordPurchase(double amount) {
	    if (amount >= 0) {
	    	purchase = purchase + amount;
	    }
		}
	

	/**
	 * Enters the payment received from the customer.
	 * @param dollars  the number of dollars in the payment
	 * @param quarters the number of quarters in the payment
	 * @param dimes    the number of dimes in the payment
	 * @param nickels  the number of nickels in the payment
	 * @param pennies  the number of pennies in the payment
	 */
	public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
		
		if(dollars >= 0 && quarters >= 0 && dimes >= 0 && nickels >= 0 && pennies >= 0) {
			payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE
					+ pennies * PENNY_VALUE;
		} 

	}

	/**
	 * Computes the change due and resets the machine for the next customer.
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
	
	
}
