package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyConfig {
	Properties configProperty;
	Properties dataProperty;

	public ReadPropertyConfig() {
		File src = new File("./Configuration/config.properties");
		File src1 = new File("./Configuration/testdata.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			configProperty = new Properties();
			configProperty.load(fis);

			FileInputStream fis1 = new FileInputStream(src1);
			dataProperty = new Properties();
			dataProperty.load(fis1);
		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	// Get Chrome Driver Property
	public String getChromeDriver() {
		String chromeDriver = configProperty.getProperty("CHROME_DRIVER");
		return chromeDriver;
	}

	// Get LambdaTest URL
	public String getURL() {
		String url = dataProperty.getProperty("URL");
		return url;
	}

	public String getBaseURL() {
		String baseUrl = dataProperty.getProperty("BASE_URL");
		return baseUrl;
	}

	// Bookie Selector Page get Property
	public String getSboNetURL() {
		String sboNet = dataProperty.getProperty("SBO_NET_URL");
		return sboNet;
	}

	// Extent Report get Property
	public String getExtentReportPath() {
		String extentReport = configProperty.getProperty("EXTENT_REPORT_PATH");
		return extentReport;
	}
}