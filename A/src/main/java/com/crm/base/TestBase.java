package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.crm.utill.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop, propertyPageTitles;

	public static void initialization() {

		prop = new Properties();
		propertyPageTitles = new Properties();
		FileInputStream inputStream, inputStream1;
		try {
			inputStream = new FileInputStream(
					"/Users/mohitrajupardeshi/eclipse-workspace/A/src/main/java/com/crm/config/config.properties");
			inputStream1 = new FileInputStream(
					"/Users/mohitrajupardeshi/eclipse-workspace/A/src/main/java/com/crm/config/pageTitle.properties");
			prop.load(inputStream);
			propertyPageTitles.load(inputStream1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/mohitrajupardeshi/Desktop/Mohit/Selenium/chromedriver");
			ChromeOptions option = new ChromeOptions();
			 option.addArguments("headless");
	
			driver = new ChromeDriver(option);
			
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}