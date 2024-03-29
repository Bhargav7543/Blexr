package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsClass {

	public static ExtentTest test;
	public static ExtentReports extent;
	static ReadPropertyConfig readPro = new ReadPropertyConfig();

	public static void startUp() {
		reportStartUp();
	}

	public static void initialisation(String testName) {
		test = extent.createTest(testName);
	}

	public static void logStat(Status status, String message) {
		test.log(status, message);
	}

	public static void endTest() {
		extent.flush();
	}

	public static void reportStartUp() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(readPro.getExtentReportPath());
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
}
