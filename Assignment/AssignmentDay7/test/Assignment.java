package com.Assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static WebDriver driver;

	public static void main(String[] args) {
		
			    RegisterValidation();
				LoginValidation();

			}

			public static void LoginValidation() {
				
				driver = new ChromeDriver(); 
				driver.get("https://tutorialsninja.com/demo/");
				driver.findElement(By.linkText("My Account")).click();
				driver.findElement(By.linkText("Login")).click();
				 
				WebElement btn= driver.findElement(By.className("btn"));
				WebElement btnlogin=driver.findElement(By.className("well"));
				WebElement btnLogin1=driver.findElement(By.className("btn"));
				
				if(btn.isEnabled())
				{
					driver.findElement(By.id("input-email")).sendKeys("legendaryoggy@legendaryoggy.com");
					driver.findElement(By.id("input-password")).sendKeys("Oggy");
					btnlogin.findElement(By.className(" btn-primary")).click();
					
					
				}
				else
				{
					driver.close();
				}
				
			}

			public static void RegisterValidation() {
				 
				driver = new ChromeDriver(); 
				driver.get("https://tutorialsninja.com/demo/");
				driver.findElement(By.linkText("My Account")).click();
				 driver.findElement(By.linkText("Register")).click();
					
					  String getTitle=driver.getTitle(); 
					  String Title="Register Account";
					  
					  String getCurrentUrl=driver.getCurrentUrl();
					  String Url="https://tutorialsninja.com/demo/index.php?route=account/register";
					  
					 
					 WebElement FirstNameTextBox= driver.findElement(By.id("input-firstname"));
					 WebElement btnClick=driver.findElement(By.className("buttons"));
					 
				 if (getTitle.equals(Title) && getCurrentUrl.equals(Url)&& FirstNameTextBox.isDisplayed())
				 {
					 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
					 driver.manage().window().maximize();
					 driver.findElement(By.name("firstname")).sendKeys("Legenday");
					 driver.findElement(By.id("input-lastname")).sendKeys("Oggy");
					 driver.findElement(By.id("input-email")).sendKeys("legendaryoggy@legendaryoggy.com");
					 driver.findElement(By.id("input-telephone")).sendKeys("987654321");
					 driver.findElement(By.id("input-password")).sendKeys("Oggy");
					 driver.findElement(By.id("input-confirm")).sendKeys("Oggy");
					 btnClick.findElement(By.className("btn-primary")).click();
					 driver.quit();
					 
						
						  } 
				 else 
				 {
					 driver.quit(); 
				 }
						 
			}

	}





