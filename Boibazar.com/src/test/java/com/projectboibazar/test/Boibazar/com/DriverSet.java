package com.projectboibazar.test.Boibazar.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSet {
	public static WebDriver driver;
	
	@BeforeSuite
	public static void openDriver() {
		System.setProperty("webdriver.chrome.driver", ".//driver_chrome//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public static void closeDriver() {
		driver.close();
	}
	

}
