package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseClass.Lambda_BaseClass;
import utility.ReadPropertyConfig;
import utility.ReportsClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

/*
 * Author : Bhargav Sathwara
 * Email  : bhargavsathwara94@gmail.com
 *
 * 
 * Tasks 1.3 : Test 1
 * 
 * 
 * */

public class Lambda_Test_01 extends Lambda_BaseClass {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String url = readPro.getURL();

	@BeforeMethod
	public void beforeMethod() throws Exception {
		System.out.println("Start Test: Lambda_Test_01");
		ReportsClass.startUp();
		setUp("iOS");
	}

	@Test
	public void lambda_Test_01() {
		ReportsClass.initialisation("Lambda_Test_01");
		
		// Open the URL
		goToURL(url);
		ReportsClass.logStat(Status.PASS, "URL is opened successfully as expected !!!");
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
		System.out.println("End Test: Lambda_Test_01");
		driver.close();
	}
}