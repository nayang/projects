package pizza.services;

/*Assessment: Assignment 2
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 3.0
@see Pizza
@see SudsOrder
@since javac 17.0.1
*/

/**
 * This class is the  Deliverable interface defines a contract for all delivered items .
 * */
public interface Deliverable {
	/**
     * Calculates the delivery cost.
     * @return deliveryCost The cost of delivering the item.
     */
    public double deliveryCost();
}