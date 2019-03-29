package com.test;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Run {
	@Test
	public void test(){
		
		WebDriver driver= new GetDriver().driver("chrome");
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Assert.assertEquals("Google",  driver.getTitle());   
		driver.close();
		
		driver= new GetDriver().driver("ie");
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Assert.assertEquals("Google",  driver.getTitle());   
		driver.close();
	}
}