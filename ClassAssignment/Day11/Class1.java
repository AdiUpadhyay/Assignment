package com.ClassAssignmentDay10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void Before()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");		
		
		
	}
	
	@Test(priority=1, dataProvider="TutorialsNinjaLogin", dataProviderClass = DataProvider_TN.class)
	public void login1(String email, String password)
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("[class=\"dropdown-menu dropdown-menu-right\"] > li:nth-of-type(2) > a")).click();
		driver.findElement(By.cssSelector("[class=\"form-control\"]")).sendKeys(email);
		driver.findElement(By.cssSelector("div>[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[class=\"form-group\"]:nth-of-type(2)  + input ")).click();
		driver.quit();
		
	}
	
	@Test(priority=2,dataProvider="TutorialsNinjaLogin", dataProviderClass = DataProvider_TN.class)
	public void login2(String email, String password)
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("[class=\"dropdown-menu dropdown-menu-right\"] > li:nth-of-type(2) > a")).click();
		driver.findElement(By.cssSelector("div>[class=\"form-control\"]")).sendKeys(email);
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys(password);
		driver.findElement(By.cssSelector("[class=\"form-group\"]:nth-of-type(1)  + div + input")).click();
		driver.quit();
	}
	
	

}
