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
@see FoodItem
@since javac 21.0.1
*/

//Constructs a new Cheese object

public class Cheese extends FoodItem {
	/**
	 * This constructor initializes a new cheese item
	 * @param name The name of the cheese, which is passed to the superclass constructor to initialize the FoodItem.
	 */
	public Cheese(String name) {
		super(name);// Call FoodItem class constructor to initialize the name field.
	}
}
