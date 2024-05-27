package deliverabletest;

import pizza.foodItems.*;
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
@since javac 17.0.1
*/

/**
 * Test our deliverable interface and inheritance heirarchy for the pizza shop
 * app.
 */
public class DeliverableTest {
	final static boolean THIN_CRUST = true;

	/**
	 * Main entry point for testing aspects of our pizza shop app.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * 	Setup some toppings for pizza's
		 * 		onion, cheese, double cheese, pepperoni, ham, olive and green pepper
		 */
		// Initialize pizza toppings, assigning each its specific attributes like name, cost, amount, and measurement unit.
		Onion onion = new Onion("Onion");
		onion.setPricePerUnit(2.0);
		onion.setQuantity(1);
		onion.setUnitsOfMeasure("1/2 CUP");;

		Cheese cheese = new Cheese("Cheese");
		cheese.setPricePerUnit(2.75);
		cheese.setQuantity(1);
		cheese.setUnitsOfMeasure("1/2 CUP");;

		Cheese dblCheese = new Cheese("Double Cheese");
		dblCheese.setPricePerUnit(2.75);
		dblCheese.setQuantity(2);
		dblCheese.setUnitsOfMeasure("CUP");;

		Pepperoni pepperoni = new Pepperoni("Pepperoni");
		pepperoni.setPricePerUnit(3.75);
		pepperoni.setQuantity(1);
		pepperoni.setUnitsOfMeasure("CUP");;

		Ham ham = new Ham("Ham");
		ham.setPricePerUnit(2.75);
		ham.setQuantity(2);
		ham.setUnitsOfMeasure("CUP");;

		Olive olive = new Olive("Olive");
		olive.setPricePerUnit(1.75);
		olive.setQuantity(1);
		olive.setUnitsOfMeasure("CUP");;

		GreenPepper greenPepper = new GreenPepper("GreenPepper");
		greenPepper.setPricePerUnit(2.80);
		greenPepper.setQuantity(1);
		greenPepper.setUnitsOfMeasure("CUP");;

		/* Create our pizza orders				*/
		Pizza pizzaPesto = new Pizza(12, "pesto");
		pizzaPesto.setBasePrice(25.00);
		pizzaPesto.setThinCrust(Pizza.THIN_CRUST);
		pizzaPesto.addTopping(dblCheese);
		pizzaPesto.addTopping(pepperoni);
		pizzaPesto.addTopping(ham);
		pizzaPesto.addTopping(greenPepper);

		Pizza pizzaMarinara = new Pizza(14, "marinara");
		pizzaMarinara.setBasePrice(35.25);
		pizzaMarinara.setThinCrust(Pizza.THIN_CRUST);
		pizzaMarinara.addTopping(onion);
		pizzaMarinara.addTopping(ham);
		pizzaMarinara.addTopping(cheese);
		pizzaMarinara.addTopping(olive);

		// Create an array of deliverable items including pizzas and suds orders.
		Deliverable[] deliverableItems = { pizzaPesto, pizzaMarinara,
				new SudsOrder("Rollicking Root Beer", 6, 473),
				new SudsOrder("Super Citrus Fizz", 4, 473) };

		int pizzaCount = 0;

		/*	TODO:	print the table of delivery costs that copies the provided sample output			*/
		

		// Print the table of delivery costs for each item.
	    System.out.printf("%-35s %-11s %s%n", "Item-Sauce", "#/Size", "Cost");
	    System.out.println();
	    for(Deliverable item: deliverableItems) {
	    	if(item instanceof Pizza) {
	    		Pizza pizza = (Pizza) item;
	    		pizzaCount++;
	    		// Dynamically adjust the spacing based on the sauce's length to maintain column alignment.
	    		int sauceColumnLength = 0;
	    		if(pizza.getTypeOfSauce().equals("pesto")) {
	    			sauceColumnLength = 28;
	    		}else {
	    			sauceColumnLength = 25;
	    		}
	            System.out.printf("Pizza %d-%s %"+ sauceColumnLength +"d %9.2f - Delivery (%10.2f) Total->>$%10.2f%n",
	                    pizzaCount, pizza.getTypeOfSauce(), pizza.sizeInInches(), pizza.getBasePrice(),
	                    pizza.deliveryCost(), pizza.totalPrice());
	            // Print each topping for the current pizza.
	            for (FoodItem topping : pizza.getToppings()) {
	            	if(topping!=null) {
	            		
	            		System.out.printf("      - %-38s %5.2f%n", topping.getName(), topping.price());
	            	}
	            }
	            System.out.println();
	    	}else {
	    		 SudsOrder sudsOrder = (SudsOrder) item;
	             System.out.printf("%-39s %2d %9.2f%n", sudsOrder.getName(), sudsOrder.getNumber(), sudsOrder.deliveryCost());
	             System.out.println();
	    	}
	    }
	}
	

}
