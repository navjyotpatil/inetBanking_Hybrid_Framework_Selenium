package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseUrl = "https://demo.guru99.com/v4/";
	public String username = "mngr479401";
	public String password = "emAnymu";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// below 2 line code for Log4j logger class 
		logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");
		
		 
		
	}
	
	@AfterClass
	public void tearDown() {
		 
		driver.quit();
	}

}
