package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utility.ReadPropertyConfig;

public class BaseTest {
	public static WebDriver driver;
	static ReadPropertyConfig readPro = new ReadPropertyConfig();

	@BeforeSuite
	public static void setUp() {
		// Chrome Driver Initialisation
		System.setProperty("webdriver.chrome.driver", readPro.getChromeDriver());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@AfterSuite
	public static void tearDown() {
		driver.quit();
	}

	// Go to URL Method
	public void goToURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
}