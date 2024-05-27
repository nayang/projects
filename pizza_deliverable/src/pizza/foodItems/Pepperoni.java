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
@since javac 17.0.1
*/

//Constructs a new Pepperoni object


public class Pepperoni extends FoodItem{
	/**
	* This constructor initializes a new Pepperoni item
	* @param name The name of the Pepperoni, which is passed to the superclass constructor to initialize the FoodItem.
	*/
	public Pepperoni(String name) {
		super(name);// Call FoodItem class constructor to initialize the name field.
	}
}
