package pizza.foodItems;

import pizza.services.*;
import java.util.Arrays;

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
 * This class defines a Pizza, outlining its dimensions, sauce choice, crust preference, toppings, and cost details. 
 * By implementing the Deliverable interface, it facilitates the computation of delivery charges. 
 * It offers methods for appending toppings and determining the pizza's foundational price, cumulative cost, and the expense associated with delivery.
 */
public class Pizza implements Deliverable {
	/**
	 * A boolean constant indicating whether the pizza has a thin crust.
	 * 
	 */
	public static final boolean THIN_CRUST = true;
	private int sizeInInches;
	private String typeOfSauce;
	private boolean thinCrust;
	private FoodItem[] toppings;
	private int toppingCount;
	private double basePrice;

	/**
     * Constructor to create a pizza with a new size and sauce.
     * @param size The diameter of the pizza in inches.
     * @param sauce The type of sauce used on the pizza.
     */
	public Pizza(int size, String sauce) {
		this.sizeInInches = size;
		this.typeOfSauce = sauce;
		this.toppings = new FoodItem[10];
		this.toppingCount = 0;
	}

	 /**
     * Constructor to create a pizza with a specified size and base price.
     * @param size The diameter of the pizza in inches.
     * @param basePrice The base price of the pizza.
     */
	public Pizza(int size, double basePrice) {
		this.sizeInInches = size;
		this.basePrice = basePrice;
		this.toppings = new FoodItem[10];
		this.toppingCount = 0;
	}

	/**
     * Sets the base price of the pizza.
     * @param price Set the base price.
     */
	public void setBasePrice(double price) {
		this.basePrice = price;
	}

	/**
     * Sets the crust type of the pizza.
     * @param yes If the pizza should have thin crust, it show true, false otherwise.
     */
	public void setThinCrust(Boolean yes) {
		this.thinCrust = yes;
	}

	/**
     * Gets the type of sauce used on the pizza.
     * @return typeOfSauce The type of sauce.
     */
	public String getTypeOfSauce() {
		return typeOfSauce;
	}

	/**
     * Gets the array of toppings added to the pizza.
     * @return toppings An array of FoodItem objects show the toppings.
     */
	public FoodItem[] getToppings() {
		return toppings;
	}

	/**
     * Gets the base price of the pizza.
     * @return basePrice The base price.
     */
	public double getBasePrice() {
		return basePrice;
	}

	/**
     * Adds a topping to the pizza.
     * @param item The FoodItem to add as a topping.
     */
	public void addTopping(FoodItem item) {// confirm
		if (toppingCount < toppings.length) {
			toppings[toppingCount++] = item;
		}
	}

	/**
     * Gets the size of the pizza in inches.
     * @return sizeInInches The size of the pizza.
     */
	public int sizeInInches() {
		return sizeInInches;
	}

	/**
     * Provides a string representation of the pizza object.
     * @return string A string detailing the pizza's attributes.
     */
	@Override
	public String toString() {
		String string = "Pizza [sizeInInches=" + sizeInInches + ", typeOfSauce=" + typeOfSauce + ", thinCrust=" + thinCrust
				+ ", toppings=" + Arrays.toString(toppings) + ", toppingCount=" + toppingCount + ", basePrice="
				+ basePrice + "]";
		return string;
	}
	
	//Calculates the delivery cost.
	/**
     * Calculates the delivery cost based on the size of the pizza.
     * @return deliveryCost The delivery cost.
     */
	@Override
	public double deliveryCost() {
		double deliveryCost = 0;
		switch (this.sizeInInches) {

		case 12:
			deliveryCost = 3.5;
			break;
		case 14:
			deliveryCost = 4.75;
			break;
		}
		return deliveryCost;
		
	}
	
	//Calculates the price of the pizza.
	/**
     * Calculates the price of the pizza.
     * @return price The total price.
     */
	public double price() {
		double price;
		double toppingsPrice = 0;
		for (FoodItem topping : toppings) {
			if (topping != null) {
				toppingsPrice += topping.price();
			}
		}
		price = basePrice + toppingsPrice;
		return price;
	}
	
	//Calculates the total price of the pizza.
	/**
     * Calculates the total price of the pizza, including toppings and base price.
     * @return totalPrice The total price.
     */
	public double totalPrice() {
		double totalPrice;
		totalPrice = price() + deliveryCost();
		return totalPrice;
	}

}
