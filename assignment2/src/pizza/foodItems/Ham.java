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

//Constructs a new Ham object

public class Ham extends FoodItem {
	/**
	* This constructor initializes a new Ham item
	* @param name The name of the Ham, which is passed to the superclass constructor to initialize the FoodItem.
	*/
	public Ham(String name) {
		super(name);// Call FoodItem class constructor to initialize the name field.
	}

}
