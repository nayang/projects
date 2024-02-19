package assignment1;

/*Assessment: Assignment 1
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
/**
@author Na Yang
@version 1.0
@since javac 21.0.1
*/
/**
 * This class represents the name for a patient. 
 * 
 */
public class Name {

	/*	Attributes			************************************/
	/**
	 * declare the variable first name
	 */
	private String first;
	/**
	 * declare the variable last name
	 */
	private String last;
	/**
	 * declare the variable middle name
	 */
	private String middle;
	/**
	 * declare the variable salutation
	 */
	private String salutation;
	
	/*	Constructors		************************************/
	/**
	 * create an empty Name object.
	 */
	public Name() {} 
	/**
	 * Constructs a Name object using the given full name. If the provided name contains a comma, it is parsed into first and last names.
	 * Otherwise, the part before the first space is considered as the first name, and the part after the first space is considered as the last name.
	 * 
	 * @param name The string containing the name
	 */
	public Name(String name) {
		if (name.contains(",")) {
			this.first = name.split(",")[1];
			this.last = name.split(",")[0];
		} else {
			this.first = name.split(" ")[0];
			this.last = name.split(" ")[1];
		}
	}
	/**
	 * create a Name object using the given first and last names.
	 * 
	 * @param first The first name
	 * @param last The last name
	 */
	public Name(String first, String last) {
		
		this.first = first;
		this.last = last;
	}
	/**
	 * create a Name object using the given salutation, first name, middle name, and last name.
	 * 
	 * @param salutation The salutation
	 * @param first The first name
	 * @param middle The middle name
	 * @param last The last name
	 */
	public Name(String salutation,String first,String middle,String last) {
		
		this.first = first;
		this.last = last;
		this.middle = middle;
		this.salutation =salutation;
	}

	
	
	/*	Accessors			************************************/
	/**
	 * Returns the formatted name including salutation, first name, middle name, and last name.
	 * 
	 * @return The formatted name string
	 */
	public String formattedName() {

		return this.salutation+" "+this.first +" "+ this.middle +" "+ this.last;
	}
	/**
	 * To get first name of user.
	 * @return user's first.
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * To get last name of user.
	 * @return user's last.
	 */
	public String getLast() {
		return last;
	}
	/**
	 * To get middle name of user.
	 * @return user's middle.
	 */
	public String getMiddle() {
		return middle;
	}
	
	
	
	/* Modifiers			************************************/
	/**
	 * To set first name of user.
	 * @param first user's first.
	 */
	public void setFirst(String first) {
		this.first = first;
	}
	/**
	 * To set last name of user.
	 * @param last user's last.
	 */
	public void setLast(String last) {
		this.last = last;
	}
	/**
	 * To set middle name of user.
	 * @param middle user's middle.
	 */
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	
	

	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + ", middle=" + middle + ", saluation=" + salutation + "]";
	}
	

}
