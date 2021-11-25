package com.projectboibazar.test.Boibazar.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenPage extends DriverSet{
	public static String baseurl = "https://www.boibazar.com/";
	
	@Test	
	public static void boibazarOpen() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(),'বিষয়')]")).click();
		Thread.sleep(3000);
				
		//to select the list		
		driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle custom-dd-btn'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='categoryIDs']//span[contains(text(),'বিষয়')]")).click();
		Thread.sleep(3000);
		
		//write in textbox
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("ঐতিহাসিক উপন্যাস");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[contains(text(),'ঐতিহাসিক উপন্যাস')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='addbtn37']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='cartCost']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout-btn")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='mobile-no-input']")).sendKeys("01711991990");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(1000);
		//create an account
		driver.findElement(By.id("ca-name-input")).sendKeys("James Allen");
		Thread.sleep(1000);
		driver.findElement(By.id("ca-email-input")).sendKeys("james1345@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password-input-signup")).sendKeys("22334455");
		Thread.sleep(1000);
		
		Select dist = new Select(driver.findElement(By.id("make")));
		dist.selectByValue("60");
		Thread.sleep(2000);
		
		Select thana = new Select(driver.findElement(By.id("thana")));
		thana.selectByVisibleText("Thakurgaon Sadar");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='receiver-address-input']")).sendKeys("826, Mondirpara");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pin-check']")).sendKeys("929709");
		Thread.sleep(3000);
		driver.findElement(By.id("next-btn-shipping")).click();
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//span[normalize-space()='NAGAD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='init_nagad_button']")).click();
		Thread.sleep(1000);
		
		//To login exciting account
		//driver.findElement(By.xpath("//input[@id='mobile-no-input']")).sendKeys("01515614795");
		//Thread.sleep(1000);
		//driver.findElement(By.id("password-input")).sendKeys("11223344");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@id='next-btn-shipping'][contains(text(),'NEXT')]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[normalize-space()='Proceed To Order']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[normalize-space()='NAGAD']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@id='init_nagad_button']")).click();
		//Thread.sleep(2000);
		
		
			
		
		
	}
	

}
