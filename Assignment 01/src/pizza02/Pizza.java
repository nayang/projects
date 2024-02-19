package pizza02;

import java.text.DecimalFormat;

public class Pizza {
	//private member data
	private String topping;
	private int size;
	private boolean extraCheese;
	
	//default constructor
	public Pizza() {
		this.topping = "pineapple";
		this.size = 5;
		this.extraCheese=false;
	}
	//copy constructor
	public Pizza(Pizza pizza) {
		this.topping= pizza.topping;
		this.size = pizza.size;
		this.extraCheese = pizza.extraCheese;
	}
	//parameterized constructor
	public Pizza (String topping, int size, boolean extraCheese) {
		this.topping  = topping;
		this.size = size;
		this.extraCheese = extraCheese;		
		
	}
	// getter
	public String getTopping() {
		return topping;
	}
	public int getSize() {
		return size;
	}
	public boolean getExtraCheese() {
		return extraCheese;
	}

	//setter 
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}
	//display method
	@Override
	public String toString() {
return "Pizza [topping=" + topping + ", size=" + size + ", extraCheese=" + extraCheese +"]";
	}

	//method
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	
	public void price() {
System.out.println("your final price is:"+decimalFormat.format(10.0/size));
	}

}

