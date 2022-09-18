package com.toolsQAcom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver; // create a object of WebDriver changed

	public static Properties prop; // create a object of Properties.

	static String projectPath = System.getProperty("user.dir");

	public void intializationDriver() {
		// Type mismatch: cannot convert from Object to String
		String browser = (String) prop.get("browser");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", projectPath + "//drivers//msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(prop.getProperty("baseurl"));
	}
	
	@BeforeTest
	public void readProperties() throws IOException {
		// when we read the file we using file input stream & give a file location
		FileInputStream fis = new FileInputStream(projectPath + "//config//confi.properties");

		// create a class of properties
		prop = new Properties();

		prop.load(fis);

	}

}
