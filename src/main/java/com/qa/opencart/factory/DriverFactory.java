package com.qa.opencart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author FridayMediaGrp
 */
public class DriverFactory {
    
	public WebDriver driver;
	public Properties prop;
	public static String highlight;
	/**
	 * This method is used to initialize the webdriver on the basis of the given browser
	 * @param browser
	 * @return this method will return driver
	 */
	public WebDriver initDriver(Properties prop) {
		highlight = prop.getProperty("highlight");
		String browser = prop.getProperty("browser").trim();
		System.out.println("browser name is: " + browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver  = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver  = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			
			driver  = new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser..." + browser);
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		return driver;
		
	  }
	
	/**
	 * this method is used to initialize the properties on the basis of given environment
	 * @return this method returns prop
	 */
	  public Properties initProp() {
		
		  prop = new Properties();
		  try {
			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return prop;
	}
}
