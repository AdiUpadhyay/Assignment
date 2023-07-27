package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CSS_Selector_Assignment {
		
	public static WebDriver driver;
	
	@BeforeMethod
	public void Before()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");		
		
		
	}
	
	@Test(priority=1)
	public void testRegister()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open >ul > li >a")).click();
		driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Upadhyay");
		driver.findElement(By.cssSelector("[name=email]")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("[name=telephone]")).sendKeys("123456789");
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[name=\"confirm\"]")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[name=\"agree\"]")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		driver.quit();
		
	}
	
	@Test(priority=2)
	public void testRegister2()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open >ul > li >a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Upadhyay");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("123456789");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[name=\"agree\"]")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		driver.quit();
		
	}

	@Test(priority=3)
	public void testRegister3()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open >ul > li >a")).click();
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Upadhyay");
		driver.findElement(By.cssSelector("[placeholder='E-Mail']")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Telephone']")).sendKeys("123456789");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[placeholder='Password Confirm']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[name=\"agree\"]")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		driver.quit();
		
	}
	
	@Test(priority=4)
	public void login1()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("[class=\"dropdown-menu dropdown-menu-right\"] > li:nth-of-type(2) > a")).click();
		driver.findElement(By.cssSelector("[class=\"form-control\"]")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("div>[placeholder='Password']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[class=\"form-group\"]:nth-of-type(2)  + input ")).click();
		driver.quit();
		
	}
	
	@Test(priority=5)
	public void login2()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("[class=\"dropdown-menu dropdown-menu-right\"] > li:nth-of-type(2) > a")).click();
		driver.findElement(By.cssSelector("div>[class=\"form-control\"]")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[class=\"form-group\"]:nth-of-type(1)  + div + input")).click();
		driver.quit();
	}
	
	@Test(priority=6)
	public void login3()
	{
		driver.findElement(By.cssSelector("[class=\"dropdown-toggle\"]")).click();
		driver.findElement(By.cssSelector("[class=\"dropdown-menu dropdown-menu-right\"] > li:nth-of-type(2) > a")).click();
		driver.findElement(By.cssSelector("[class=\"form-control\"]")).sendKeys("adityaupadhyay@gmail.com");
		driver.findElement(By.cssSelector("div>[placeholder='Password']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("[class=\"form-group\"]:nth-of-type(2)  + input ")).click();
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
