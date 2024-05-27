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
 * This is a simple test demo class for the health care system.
 */
public class TestDemo {

	/**
	 * Main entry point for testing the health care assignment.
	 * @param args	Array of command line arguments input thru the VM
	 */
	public static void main(String[] args) {

		/*
		 * TODO: You must use the System.out.printf, formatted prints to show all health
		 * data as found in the EMRecord class (includes the parent class EMHRecord). Do not miss any item (includes any
		 * attributes which are complex objects, name, address etc.
		 * 
		 *		Use the following standards guide to discover valid field entries for demo purposes.
		 * 
		 * 	Field values and constraints can be found in the Standards guide
		 *		Acute and Ambulatory Care Data Content Standard, https://secure.cihi.ca/estore/productSeries.htm?pc=PCC1428
		 * 
		 */
		/**
		 * This code snippet demonstrates the usage of the EMRecord class to store health-related data of a user.
		 * It creates an EMRecord object with specific attributes such as province, institution number, health care number, and chart number.
		 * Additionally, it creates an Address object, a Name object, and a BirthDate object with relevant details.
		 * 
		 * Various setter methods are used to set additional attributes of the EMRecord object, such as functional centre account, encounter sequence, issuing province, etc.
		 * The code then prints out the user's health-related data using printf statements, including functional centre account, encounter sequence, issuing province, etc.
		 * 
		 * Finally, the code calculates the Body Mass Index (BMI) using the height and weight attributes of the EMRecord object and displays it.
		 */

		/**
		 * To pass the user's health-related data.
		 */
			EMRecord emRecord =  new EMRecord("ON", "12345", "12345678911C", "1234567891");
			Address address = new Address("Gabriola", "111", "Ottawa","Canada", "K2T 0H1");
			Name name = new Name( "Mrs", "Na", "Yang", "li");
			BirthDate birthdate = new BirthDate(1984,10,22);
			
			emRecord.setFuncitonalCentreAccount("7*3100000");
			emRecord.setEncounterSequence(001);
			emRecord.setIssuingProvince("ON");
			emRecord.setPostalCode("K2T0H1");
			emRecord.setResidenceCode("1234567");
			emRecord.setGender("M");
			emRecord.setSubmissionYear(2024);
			emRecord.setAdminViaAmbulance("A");
			emRecord.setRegistrationDate(20240122);
			emRecord.setRegistrationTime(1403);
			emRecord.setHeight(170);
			emRecord.setWeight(48);
			emRecord.setName(name);
			
			
			/**
			 * To display user's health-related data.
			 */
	        System.out.printf("Functional Centre Account: %s%n", emRecord.getFuncitonalCentreAccount());
	        System.out.printf("Encounter Sequence: %d%n", emRecord.getEncounterSequence());
	        System.out.printf("Issuing Province: %s%n", emRecord.getIssuingProvince());
	        System.out.printf("Postal Code: %s%n", emRecord.getPostalCode());
	        System.out.printf("Residence Code: %s%n", emRecord.getResidenceCode());
	        System.out.printf("Gender: %s%n", emRecord.getGender());
	        System.out.printf("Submission Year: %d%n", emRecord.getSubmissionYear());
	        System.out.printf("Admin Via Ambulance: %s%n", emRecord.getAdminViaAmbulance());
	        System.out.printf("Registration Date: %s%n", emRecord.getRegistrationDate());
	        System.out.printf("Registration Time: %s%n", emRecord.getRegistrationTime());
	        System.out.printf("Name: %s%n",  emRecord.formattedName(name)); 
	        System.out.printf("Address: %s%n", emRecord.formattedAddress(address));
	        System.out.printf("BirthDate: %s%n", birthdate.formattedBirthDate());
	        System.out.printf("BMI VALUES: %d%n", emRecord.bmi());
	        

		/*	You do not need to modify this piece of code, it is fine as it is.			*/
		System.out.println("\nBMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
