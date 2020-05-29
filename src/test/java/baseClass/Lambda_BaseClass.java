package baseClass;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Lambda_BaseClass {
	public static String username = "kinjalsathavara2296";
	public static String authkey = "Qry1DPV77QEqTMzmgsfBAOrczrh9iIHrOAUSCrBekiN7x7QqCC";
	public static RemoteWebDriver driver;
	public static String gridURL = "@hub.lambdatest.com/wd/hub";

	public static void setUp(String platform) throws Exception {
		// Lambdatest Capabilities configuration
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Capabilities configuration for iOS Platform
		if (platform.equalsIgnoreCase("iOS")) {
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("deviceName", "iPhone 8 Plus");
			capabilities.setCapability("platformVersion", "13.2");
			capabilities.setCapability("browserName", "Safari");
			capabilities.setCapability("version", "10.0");
			capabilities.setCapability("build", "LambdaTest 01");
			capabilities.setCapability("name", "LambdaTest 01");
		}
		// Capabilities configuration Android Platform
		else if (platform.equalsIgnoreCase("Android")) {
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "Google Pixel");
			capabilities.setCapability("platformVersion", "8");
			capabilities.setCapability("build", "LambdaTest 02");
			capabilities.setCapability("name", "LambdaTest 02");
		}
		capabilities.setCapability("network", true);
		capabilities.setCapability("visual", true);
		capabilities.setCapability("video", true);
		capabilities.setCapability("console", true);
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + gridURL), capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Go to URL Method
	public void goToURL(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}