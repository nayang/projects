package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*Assessment: Assignment 1
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
*/
class assignment1Test {
	/**
	 * This JUnit test verifies the functionality of the Address class.
	 */
	@Test
	void addressTest() {
		// Create an Address object with initial values
		Address address = new Address("Street", "100", "New York", "USA","1000992");
		// Verify the getters return the expected values
		assertEquals("New York", address.getCity());
		assertEquals("1000992", address.getPostalCode());
		assertEquals("Street", address.getStreet());
		assertEquals("USA", address.getCountry());
		
		// Verify the formatted address string
		assertEquals("100 Street, New York, USA, 1000992", address.formattedAddress());
		
		// Update the Address object with new values
		address.setCity("Ottawa");
		address.setCountry("Canada");
		address.setNumber("200");
		address.setStreet("Gabriola");
		address.setPostalCode("K2T 0M1");
		// Verify that the getters return the updated values
		assertEquals("Ottawa", address.getCity());
		assertEquals("Canada", address.getCountry());
		assertEquals("Gabriola", address.getStreet());
		// Verify the updated formatted address string
		assertEquals("200 Gabriola, Ottawa, Canada, K2T 0M1", address.formattedAddress());
		
		// Verify the toString() method returns the expected string representation
		assertEquals("Address [street=Gabriola, number=200, city=Ottawa, country=Canada, postalCode=K2T 0M1]",
				address.toString());
	
		
	}
	
	
	/**
	 * This JUnit test verifies the functionality of the Name class.
	 */
	@Test
	void nameTest() {
		 // Create a Name object with initial values
		Name name = new Name("Ms","Na","","Yang");
		
		// Verify that the formattedName() method correctly formats the name string
		assertEquals("Ms Na  Yang", name.formattedName());
		
		// Verify that the toString() method returns the expected string representation
		assertEquals("Name [first=Na, last=Yang, middle=, saluation=Ms]",
				name.toString());
		
		Name name1 = new Name("Na","Yang");
		assertEquals("Na", name1.getFirst() );
        assertEquals("Yang", name1.getLast());
        
        Name name2 = new Name("Yang , Na");
        assertEquals("Na", name2.getFirst().trim());
        assertEquals("Yang", name2.getLast().trim());
        
        Name name3 = new Name("Na Yang");
        assertEquals("Na", name3.getFirst());
        assertEquals("Yang", name3.getLast());
        
        Name name4 = new Name();
        assertNull(name4.getFirst());
        assertNull(name4.getLast());
        
        name.setFirst("Na");
        name.setLast("Yang");
        name.setMiddle("li");
        assertEquals("Yang", name.getLast());
        assertEquals("Na", name.getFirst());
        assertEquals("li", name.getMiddle());
        
	}
	
	
	/**
	 * This JUnit test verifies the functionality of the BirthDate class.
	 */
	@Test
	void BirthDateTest() {
		// Create a BirthDate object with initial values
		BirthDate birthDate = new BirthDate(1983,10,25);
		// Verify that the getters return the expected values
		assertEquals(1983, birthDate.getYear());
		assertEquals(10, birthDate.getMonth());
		assertEquals(25, birthDate.getDay());	
		// Verify that the formattedBirthDate() method correctly formats the birth date string
		assertEquals("1983/10/25",birthDate.formattedBirthDate());
		
		// Update the BirthDate object with new values
		birthDate.setYear(1984);
		birthDate.setMonth(10);
		birthDate.setDay(26);
		// Verify that the getters return the updated values
		assertEquals(1984, birthDate.getYear());
		assertEquals(10, birthDate.getMonth());
		assertEquals(26, birthDate.getDay());
		// Verify the updated formatted birth date string
		assertEquals("1984/10/26",birthDate.formattedBirthDate());
		
		// Verify the toString() method returns the expected string representation
		assertEquals("[year=1984, month=10, day=26]",
				birthDate.toString());}
		
		
	
	/**
	 * This JUnit test verifies the functionality of the EMHRecord class
	 */
	@Test void EMHRecordTest() {
		// Create an EMHRecord object with initial values
		EMHRecord emhRecord = new EMHRecord("ON", "1111", "125856", "552");
		// Verify that the getters return the expected values
		assertEquals("ON", emhRecord.getReportingFacilityProvince());
		assertEquals("1111", emhRecord.getInstitutionNumber());
		assertEquals("125856", emhRecord.getHealthCareNumber());	
		assertEquals("552", emhRecord.getChartNumber());
		// update values for some attributes using setter methods
		emhRecord.setAdminViaAmbulance("AdminViaAmbulanc");
		emhRecord.setEncounterSequence(111111111);
		emhRecord.setFuncitonalCentreAccount("F5555");
		emhRecord.setGender("F");
		emhRecord.setIssuingProvince("Ontario");
		emhRecord.setPostalCode("K2T 0M1");
		emhRecord.setRegistrationDate(20221212);
		emhRecord.setRegistrationTime(1423);
		emhRecord.setResidenceCode("ABC");
		emhRecord.setSubmissionYear(2023);
		// Verify that the getters return the updated values
		assertEquals("AdminViaAmbulanc", emhRecord.getAdminViaAmbulance());
		assertEquals(111111111, emhRecord.getEncounterSequence());
		assertEquals("F5555", emhRecord.getFuncitonalCentreAccount());	
		assertEquals("F", emhRecord.getGender());
		assertEquals("Ontario", emhRecord.getIssuingProvince());
		assertEquals("K2T 0M1", emhRecord.getPostalCode());
		assertEquals(20221212, emhRecord.getRegistrationDate());	
		assertEquals(1423, emhRecord.getRegistrationTime());
		assertEquals("ABC", emhRecord.getResidenceCode());
		assertEquals(2023, emhRecord.getSubmissionYear());
		
		
		// Verify that the string representation of the EMHRecord object matches the expected string
		assertEquals("EMHRecord [reportingFacilityProvince=ON, "
				+ "institutionNumber=1111, funcitonalCentreAccount=F5555, "
				+ "encounterSequence=111111111, healthCareNumber=125856, "
				+ "chartNumber=552, issuingProvince=Ontario, postalCode=K2T 0M1, "
				+ "residenceCode=ABC, gender=F, submissionYear=2023, adminViaAmbulance=AdminViaAmbulanc, "
				+ "registrationDate=20221212, registrationTime=1423]", emhRecord.toString());
		
		emhRecord.setReportingFacilityProvince("on");
		String expectedProvince = "on";
		String actualProvince = emhRecord.getReportingFacilityProvince();
		assertEquals(expectedProvince, actualProvince);
		
		emhRecord.setInstitutionNumber("1111");
		String expectedInstitutionNumber = "1111";
		String actualInstitutionNumber = emhRecord.getInstitutionNumber();
		assertEquals(expectedInstitutionNumber, actualInstitutionNumber);
		
		emhRecord.setHealthCareNumber("125856");
		String expectedHealthCareNumber = "125856";
		String actualHealthCareNumber = emhRecord.getHealthCareNumber();
		assertEquals(expectedHealthCareNumber, actualHealthCareNumber);
		
		emhRecord.setChartNumber("552");
		String expectedChartNumber = "552";
		String actualChartNumber = emhRecord.getChartNumber();
		assertEquals(expectedChartNumber, actualChartNumber);
		
	}
	
	/**
	 * This JUnit test verifies the functionality of the EMRecord class.
	 */
		@Test
		void EMRecordTest() {
			// Create an EMRecord object with initial values
			EMRecord emRecord = new EMRecord("on","12345", "12345678911C", "1234567891");
			// Create an Address object and set it as the address of the EMRecord
			Address address = new Address("Queen's street", "100", "New York", "USA", "100229");
			emRecord.setAddress(address);
			// Verify that the formatted address string matches the expected address string
			String actualAddress = emRecord.formattedAddress(address);
			String expectedAddress = "100 Queen's street, New York, USA, 100229";
			assertEquals(expectedAddress, actualAddress);
			// Ensure that the toString() method of the EMRecord object is not null
			assertNotNull(emRecord.toString());
			
			// Create a Name object and set it as the name of the EMRecord
			Name name = new Name("Ms","Na","Yang","");
			emRecord.setName(name);
			
			// Verify that the formatted name string matches the expected name string
			String expectedName = "Ms Na Yang ";
			String actualName = emRecord.formattedName(name);
			assertEquals(expectedName, actualName);
			
			// Set the weight and height of the EMRecord and calculate the BMI
			emRecord.setWeight(200);
			emRecord.setHeight(175);
			int expectBMI = 4;
			assertEquals(expectBMI, emRecord.bmi());
			
			emRecord.setHeight(15);
			int actualHeight = emRecord.getHeight();
			int expectedHeight = 15;
			assertEquals(expectedHeight,actualHeight,0.001);
			
			emRecord.setWeight(15);
			int actualWeight = emRecord.getWeight();
			int expectedWeight = 15;
			assertEquals(expectedHeight,actualHeight,0.001);
		}
		
		
	
}
