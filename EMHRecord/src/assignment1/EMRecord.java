package assignment1;

/*
 * 	W24	CST8284
 * 	Assignment 1: My Health System
 * 
 *		This is the start of a system which would maintain Electronic Medical Records for patients.
 *		This class assumes all values passed to the set methods are correct and valid.
 *		REVIEW THIS FILE, ASSIGNMENT INSTRUCTIONS, UML Class Diagram CAREFULLY BEFORE YOU START CODING!
 *
 * 	Remove unneeded comments/code when you are done. (Clean code is better code).
 * 
 * 	Field values and constraints can be found in the Standards guide
 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428 (last searched January 27, 2024)
 * 
 */

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
 * This class represents the EMHRecord for a patient. 
 * 
 */
public class EMRecord extends EMHRecord		{
	
	/*	Attributes			************************************/
	/**
	 * declare the variable chartNumber(10 characters（0–9, A–Z or blank）)
	 */
	private String chartNumber;
	/**
	 * declare the variable height(6 characters)
	 */
	private int height;
	/**
	 * declare the variable weight(7 characters)
	 */
	private int weight;
	/**
	 * declare the variable name(Saluation first middle last)
	 */
	private Name name;
	/**
	 * declare the variable address (formattedAddress -number street,city, country, postalcode)
	 */
	private Address address;
	
	/*	Constructors		************************************/
	/**
	 * Constructor for EMRecord
	 * @param reportingFacilityProvince reportingFacilityProvince of user
	 * @param institutionNumber institutionNumber of user
	 * @param healthCareNumber healthCareNumber of user
	 * @param chartNumber chartNumber of user
	 */

	public EMRecord(String reportingFacilityProvince, String institutionNumber, String healthCareNumber,
			String chartNumber) {
		super(reportingFacilityProvince, institutionNumber, healthCareNumber, chartNumber);
	
	}
	
	/*	Accessors			************************************/

	/**
	 * this method formats name
	 * @param name the name of user
	 * @return formattedName format the user's name
	 */
	public String formattedName(Name name) {
		
		return name.formattedName();
		
	}
	/**
	 * this method formats address
	 * @param address the address of user
	 * @return formattedAddress format the user's address
	 */
	public String formattedAddress(Address address) {
		return address.formattedAddress();
	}
	
	/**
	 * this method calculate BMI
	 * @return int type MedicalCalculator.calculateBMI(weight, height)
	 */
	public int bmi() {
		return (int)MedicalCalculator.calculateBMI(weight, height);
	}
	
	/**
	 * To get height of user.
	 * @return user's Height.
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * To get weight of user.
	 * @return user's Weight.
	 */
	public int getWeight() {
		return weight;
	}

	/* Modifiers			************************************/
	/**
	 * To set name of user.
	 * @param name user's name.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	/**
	 * To set address of user.
	 * @param address user's address.
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * To set height of user.
	 * @param height user's Height.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * To set weight of user.
	 * @param weight user's Weight.
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	/**
	 * Convert this objectd into a meaningful string.
	 * @return	This object as a string.
	 */
	@Override
	public String toString() {
		return "EMRecord [chartNumber=" + chartNumber + ", height=" + height + ", weight=" + weight + ", name=" + name
				+ ", address=" + address + "]";
	}


}
