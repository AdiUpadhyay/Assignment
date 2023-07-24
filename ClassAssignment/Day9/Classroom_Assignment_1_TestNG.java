package com.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classroom_Assignment_1_TestNG {
		public WebDriver driver;
	@BeforeMethod
	public void BeforeLogin()
	
	{
			driver = new ChromeDriver();
			driver.get("https://www.rediff.com/");
	}
	@Test(priority=1)
	public void login1()
	{
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
	}
	@Test(priority=2)
	public void login2()
	{
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Donkey@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
	}
	@Test(priority=3)
	public void login3()
	{
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("chowdhurygs@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shajlee1");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
	}
	@AfterMethod
	public void AfterLogin()
	{
		driver.quit();
	}

}
