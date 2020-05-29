package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseTest;
import pageObject.Bookie_Selector_Page;
import utility.ReadPropertyConfig;
import utility.ReportsClass;

/*
 * Author : Bhargav Sathwara
 * Email  : bhargavsathwara94@gmail.com
 *
 * 
 * Part 2 : Tasks 2.3 - Bonus Task
 * 
 * 
 * */
public class Bookie_Selector_Test extends BaseTest {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String URL = readPro.getSboNetURL();

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test: Bookie_Selector_Test");
		ReportsClass.startUp();
	}

	@Test
	public void bookieSelectorTest() throws Exception {
		Bookie_Selector_Page bookieSelector = new Bookie_Selector_Page();
		ReportsClass.initialisation("Bookie_Selector_Test");

		// Open the URL
		goToURL(URL);
		bookieSelector.bookieSelectorOperation();
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
		System.out.println("End Test: Bookie_Selector_Test");
	}
}
