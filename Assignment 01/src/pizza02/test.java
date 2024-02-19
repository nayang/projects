package pizza02;

public class test {
	public static void main(String[] args) {
		//create a pizza using default constructor
		Pizza pizza1 = new Pizza();
		// using copy constructor
		Pizza pizza2 = new Pizza (pizza1);
		// using parameterized constructor
		Pizza pizza3 = new Pizza("cheese",10,true);
		// set
		pizza1 .setTopping("mushroom");
		pizza1.setSize(20);
		pizza1.setExtraCheese(true);
		// call toString method
		System.out.println(pizza1.toString());
		//get
		System.out.println(pizza1.getExtraCheese());//true
		System.out.println(pizza2.getSize());//5
		System.out.println(pizza2.getTopping());//pineapple
		//call method
		pizza1.price();
	}

}





