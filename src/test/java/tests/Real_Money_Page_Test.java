package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseClass.BaseTest;
import utility.ReadPropertyConfig;
import utility.ReportsClass;

/*
 * Author : Bhargav Sathwara
 * Email  : bhargavsathwara94@gmail.com
 *
 * 
 * Part 2 : Tasks 2.2
 * 
 * 
 * */
public class Real_Money_Page_Test extends BaseTest {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String url = readPro.getURL();

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test: Real_Money_Page_Test");
		ReportsClass.startUp();
	}

	@Test
	public void realMoneyPageTest() {
		ReportsClass.initialisation("Real_Money_Page_Test");

		// Open the URL
		goToURL(url);

		WebElement liveDear = driver.findElement(By.linkText("live casino"));
		WebElement depositeMethod = driver.findElement(By.linkText("payment methods"));
		WebElement selectionOfTableGames = driver.findElement(By.linkText("selection of table games"));
		WebElement topQualityOnlineCasinoSites = driver.findElement(By.linkText("top-quality online casino sites"));
		WebElement noDepositeBonuses = driver.findElement(By.linkText("no deposit bonuses"));

		// Verify the Links
		verifyLink(liveDear, "live casino link");
		verifyLink(depositeMethod, "payment methods link");
		verifyLink(selectionOfTableGames, "selection of table games link");
		verifyLink(topQualityOnlineCasinoSites, "top-quality online casino sites link");
		verifyLink(noDepositeBonuses, "no deposit bonuses link");
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
		System.out.println("End Test: Real_Money_Page_Test");
	}

	// Verify Link Method
	public void verifyLink(WebElement linkName, String msg) {
		if (linkName.isDisplayed()) {
			System.out.println(msg + " : " + "is verified");
			ReportsClass.logStat(Status.PASS, msg + " : " + "is verified");
		} else {
			System.out.println(msg + " : " + "not verified");
			ReportsClass.logStat(Status.FAIL, msg + " : " + "not verified");
		}
	}
}
