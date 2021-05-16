package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.utill.TestUtil;
import com.crm.webDriverListener.WebDriverListener;

public class TestBase {
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static Properties prop, propertyPageTitles;
	
	public TestBase()
	{
		prop = new Properties();
		propertyPageTitles = new Properties();
		FileInputStream inputStream, inputStream1;
		try {
			inputStream = new FileInputStream(
					"/Users/mohitrajupardeshi/eclipse-workspace/B/A/src/main/java/com/crm/config/config.properties");
			inputStream1 = new FileInputStream(
					"/Users/mohitrajupardeshi/eclipse-workspace/B/A/src/main/java/com/crm/config/pageTitle.properties");
			prop.load(inputStream);
			propertyPageTitles.load(inputStream1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	public static void initialization() {

		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/mohitrajupardeshi/Desktop/Mohit/Selenium/chromedriver");
			ChromeOptions option = new ChromeOptions();
			// option.addArguments("headless");
			/*try {
			//= new RemoteWebDriver(new URL("http://192.168.0.102:4444/wd/hub"),dc);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			driver = new ChromeDriver(option);
			e_driver=new EventFiringWebDriver(driver);
			WebDriverListener wbd= new WebDriverListener();
			e_driver.register(wbd);
			driver=e_driver;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}