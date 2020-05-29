package tests;

import java.util.concurrent.TimeUnit;

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
 * Part 2 : Tasks 2.1
 * 
 * 
 * */
public class Footer_Link_Test extends BaseTest {

	ReadPropertyConfig readPro = new ReadPropertyConfig();
	String baseURL = readPro.getBaseURL();

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Start Test: Footer_Link_Test");
		ReportsClass.startUp();
	}

	@Test
	public void footerLinkTest() throws Exception {
		ReportsClass.initialisation("Footer_Link_Test");

		// Open the URL
		goToURL(baseURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ReportsClass.logStat(Status.PASS, "URL is opened successfully as expected !!!");

		// Verify Footer link is broken or not.
		WebElement footer = driver.findElement(By.xpath("//div[@class='col-md-9 bottom-menu']"));
		int i = footer.findElements(By.tagName("a")).size();

		for (int j = 0; j < i; j++) {
			footer = driver.findElement(By.xpath("//div[@class='col-md-9 bottom-menu']"));
			footer.findElements(By.tagName("a")).get(j).getText();
			footer.findElements(By.tagName("a")).get(j).click();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			if (driver.getTitle().contains("404")) {
				System.out.println("404 Found");
				ReportsClass.logStat(Status.FAIL, driver.getTitle() + " : " + "404 Found !!!");
			} else {
				System.out.println("Status = 200 Ok");
				ReportsClass.logStat(Status.PASS, driver.getTitle() + " : " + "Status 200 Ok !!!");
			}
			driver.navigate().back();
			Thread.sleep(4000);
		}
	}

	@AfterMethod
	public void afterMethod() {
		ReportsClass.endTest();
		System.out.println("End Test: Footer_Link_Test");
	}
}