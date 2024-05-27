package domain;
/*Assessment: Lab 4
Student Name: Na Yang
Student Number: 040744984
Lab Professor Name: Natalie Gluzman
Lab Section: 312
CST 8284
*/ 
import static org.junit.Assert.assertEquals;

/*		@(#)YourPurchases_Test.java	Jan. 31, 2024
*
*/


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import domain.*;
/**
* Test class for testing the YourPurchases class
* Uses JUnit version 5
* @author Na Yang
* @version 1.0.7
*/
@DisplayName("Test Customer Application Domain")
@TestMethodOrder(OrderAnnotation.class)
public class YourPurchases_Test {
	
	YourPurchases purchases;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		purchases =  new YourPurchases();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		purchases = null;
	}

	
	@Nested @DisplayName("create Test") @TestMethodOrder(OrderAnnotation.class)
	class ConstructorTest {
		@Test @Order(1) @DisplayName("create Test")
		final void testCustomerCreate() {
			try	{	/* Block used to catch exceptions and display a stack trace					*/
				YourPurchases purchases = new YourPurchases();
				assertNotNull(purchases);
				System.out.println(purchases);

			} catch (Exception ex)	{
				ex.printStackTrace();
			}
		}
	}
	
	
	
	@Nested	@DisplayName("recordPurchase() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class recordPurchaseTest {

		@Test @Order(1) @DisplayName("recordPurchase() test with invaild arguments")
		final void testRecordPurchaseWithInvaildArguments() {
			double expectedValue = 0;
			purchases.recordPurchase(-5.0);
			double actualValue = purchases.getPurchase();
			assertEquals(expectedValue,actualValue,0.001,"recordPurchases() return value does not match expectations. ");
			
				 
			
		}
		
		@Test @Order(2) @DisplayName("recordPurchase() test with valid arguments")
		final void testRecordPurchaseWithValidArguments() {
			double expectedValue = 5;
			purchases.recordPurchase(5);
			double actualValue = purchases.getPurchase();
			assertEquals(expectedValue,actualValue, 0.0001, "recordPurchases() return value match expectations. ");
			
		}

	}

	
	
	@Nested	@DisplayName("receivePayment() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class ReceivePaymentTest {
		@Test @Order(1) @DisplayName("receivePayment() test with invaild arguments")
		final void testReceivePaymentWithInvaildArguments() {
			double expectedValue = 0;
			purchases.receivePayment(-5, 0, 0, 0, 0);
			double actualValue = purchases.getPayment();
			assertEquals(expectedValue, actualValue,0.001,"receivePayment() cannot be negative value");
			
		}
		
	}

	
	@Nested	@DisplayName("giveChange() Test")
	@TestMethodOrder(OrderAnnotation.class)
	class GiveChangeTest {
		@Test @Order(1) @DisplayName("giveChange() test with invaild arguments")
		final void testGiveChangeWithInvaildArguments() {			
			double expectedValue = 0;
			purchases.recordPurchase(-3.7);
			purchases.receivePayment(-5, -1, -2, 2, 0);
			double actualValue = purchases.giveChange();
			assertEquals(expectedValue, actualValue,0.001,"giveChange() return value does not match expectations.");
	}

	
	
}}	/*	End of test classes					*/
