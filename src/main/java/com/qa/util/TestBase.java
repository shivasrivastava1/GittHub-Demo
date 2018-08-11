package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\"
					+ "FreecrmBDDFramework1\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void lauchBrowser() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\"
					+ "FreecrmBDDFramework1\\src\\main\\resources\\chromedriver.exe");
			driver= new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\eclipse-workspace\\"
					+ "FreecrmBDDFramework1\\src\\main\\resources\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
	}
	public void url() {
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
