package pizza.foodItems;
import pizza.services.*;

/*Assessment: Assignment 2
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 3.0
@see Deliverable
@since javac 17.0.1
*/
/**
 * This class represents a beverage order, referred to as "Suds," in the context of food service. 
 * It calculates delivery costs through the Deliverable interface, considering the quantity of items ordered.
 * */

public class SudsOrder implements Deliverable{
	private String name;
	private int number;
	private int sizeInML;
	
	/**
     * Constructs a SudsOrder with specified name, units number, and per unit size.
     * 
     * @param name The name of the beverage.
     * @param number The number of units ordered.
     * @param sizeInML The size of each unit in milliliters.
     */
	public SudsOrder(String name, int number, int sizeInML) {
        this.name = name;
        this.number = number;
        this.sizeInML = sizeInML;
    }
	
	/**
     * Gets the name of the beverage.
     * @return name The name of the beverage.
     */
	public String getName() {
        return name;
    }

	 /**
     * Gets the number of units ordered.
     * @return number The number of units.
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * Gets the size of each unit in milliliters.
     * @return sizeInML The size of each unit in milliliters.
     */
    public int sizeInML() {
        return sizeInML;
    }
    
    /**
     * Provides a string shows of the SudsOrder.
     * @return string A string detailing the SudsOrder's attributes.
     */
    @Override
	public String toString() {
    	String string;
		string = "SudsOrder [name=" + name + ", number=" + number + ", sizeInML=" + sizeInML + "]";
		return string;
	}
    
    /**
     * Calculates the delivery cost for the order. The cost = 0.75* number.
     * @return deliveryCost The delivery cost.
     */
    @Override
	public double deliveryCost() {
    	double deliveryCost;
        deliveryCost = 0.75* this.number; //according the uml diaragm
        return deliveryCost;
    }
    
}
