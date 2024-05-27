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
 * This class represents the address for a patient. 
 * 
 * 
 */
public class Address {

	
	/*	Attributes			************************************/
	/**
	 * declare the variable street
	 */
	private String street;
	/**
	 * declare the variable number
	 */
	private String number;
	/**
	 * declare the variable city
	 */
	private String city;
	/**
	 * declare the variable country
	 */
	private String country;
	/**
	 * declare the variable postalCode
	 */
	private String postalCode;

	

	
	
	/**
	 * This is a constructor.
	 * @param street street name of user
	 * @param number street number of user
	 * @param city user's city
	 * @param postalCode user's postalCode(6 characters(: Valid postal code (ANANAN), 2-digit mini–postal code, 99))
	 * @param country user's country
	 */

	public Address(String street, String number, String city, String country,String postalCode) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}


	/**
	 * To format the user's address.
	 * @return formattedAddress format the user's address.
	 */
	public String formattedAddress() {
		
		return this.number + " " + this.street +", " + this.city + ", " + this.country + ", " + this.postalCode ;
	}

	
	/**
	 * To get street of user.
	 * @return user's street.
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * To get city of user.
	 * @return user's city.
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * To get post code of user.
	 * @return user's PostalCode.
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	/**
	 * To get country of user.
	 * @return user's country.
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * To set street of user.
	 * @param street user's street.
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * To set city of user.
	 * @param city user's city.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * To set post code of user.
	 * @param postalCode user's PostalCode.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 * To set street number of user.
	 * @param number user's number.
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * To set country of user.
	 * @param country user's country.
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * Convert this object into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", city=" + city + ", country=" + country
				+ ", postalCode=" + postalCode + "]";
	}









}