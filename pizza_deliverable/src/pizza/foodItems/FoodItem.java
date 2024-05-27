package pizza.foodItems;

/*Assessment: Assignment 2
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 3.0
@see Tomatoe
@see Cheese
@see GreenPepper
@see Ham
@see Olive
@see Onion
@see Pepperoni
@since javac 17.0.1
*/

/**
 * Represents a generic food item with basic attributes 
 * such as name, units of measure, quantity, and price per unit.
 */
public class FoodItem {
	private String name;
	/**
	 *Defines the unit of measure (e.g., cup, half cup, quarter cup, oz, milliliters)
	 */
	private String unitsOfMeasure;//cup, half cup, quarter cup, oz, milliliters
	private float quantity;
	private double pricePerUnit;
	
	/**
     * Constructs a new FoodItem with the new name.
     * @param name The name of the food item.
     */
	public FoodItem(String name) {
		this.name = name;
	}
	
	/**
     * Sets the units of measure for this food item.
     * @param unitType The units of measure.
     */
	public void setUnitsOfMeasure(String unitType) {
		this.unitsOfMeasure = unitType;
	}
	
	/**
     * Sets the quantity of this food item.
     * @param quantity The set of quantity .
     */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	/**
     * Sets the price per unit for this food item.
     * @param price Set the price per unit.
     */
	public void setPricePerUnit(double price) {
		this.pricePerUnit = price;
	}
	
	/**
	    * Gets the name of this food item.
	    * @return The name of the food item.
	    */
	public String getName() {
		return name;
	}
	
	/**
     * Calculates the total price use the quantity * pricePerUnit.
     * @return The total price of the food item.
     */
	public double price() {
		
		return quantity * pricePerUnit;
	}
	
	
	

	
	}


