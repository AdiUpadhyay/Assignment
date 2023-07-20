package com.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Day8 {
		public static WebDriver driver;
		
	public static void main(String[] args) {
		
		
		        //Rediffmail
				Rediff();
				//-----------------------------------------------------------------------------------------------------------------------/
				//Money
				Money();
				//-----------------------------------------------------------------------------------------------------------------------/
				//Business Email
				Bussiness();
				//-----------------------------------------------------------------------------------------------------------------------/
				//Videos
				Videos();
				//-----------------------------------------------------------------------------------------------------------------------/
				//Shopping
				Shopping();
				//-----------------------------------------------------------------------------------------------------------------------/
				
				//Create Account
				CreateAccount();
				
				//I want 10 advanced Customized xpaths of all the above Web Elements

	}
	public static void Rediff() {
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::div[@class='fnt0']/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchcontainer\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[1]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchcontainer\"]/ancestor::*/descendant::div[@class=\"fnt0\"]/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchcontainer\"]/parent::*/preceding::div[@class=\"fnt0\"]/following::a[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchcontainer\"]/parent::*/preceding::div[@class=\"cell alignR toprlinks\"]/parent::*/parent::*/preceding-sibling::div[@class=\"fnt0\"]/following::a[1]")).click();
		
	}
	public static void Money()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/descendant::div[@class='fnt0']/following::a[2]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/child::div[@class='fnt0']/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='fnt0']/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='cell alignR toprlinks']/parent::*/parent::*/preceding-sibling::div[@class='fnt0']/following::a[2]")).click();
		driver.quit();
	}

	public static void Bussiness()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/child::div[@class='fnt0']/following::a[3]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/descendant::div[@class='fnt0']/following::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='fnt0']/following::a[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='cell alignR toprlinks']/parent::*/parent::*/preceding-sibling::div[@class='fnt0']/following::a[3]")).click();
		driver.quit();
	}
	public static void Videos()

	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/child::div[@class='fnt0']/following::a[4]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/descendant::div[@class='fnt0']/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='fnt0']/following::a[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='cell alignR toprlinks']/parent::*/parent::*/preceding-sibling::div[@class='fnt0']/following::a[4]")).click();
		driver.quit();
		
	}

	public static void Shopping()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/child::div[@class='fnt0']/following::a[5]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/descendant::div[@class='fnt0']/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='fnt0']/following::a[5]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='cell alignR toprlinks']/parent::*/parent::*/preceding-sibling::div[@class='fnt0']/following::a[5]")).click();
		driver.quit();
		
	}
	public static void CreateAccount()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='fnt0']/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"fnt0\"]/following::div[1]/child::div[1]/child::div[2]/child::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchbar clear-fix relative']/parent::*/child::div[@class='fnt0']/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"srchbar clear-fix relative\"]/parent::*/child::div[@class=\"logobar\"]/descendant::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class=\"div_moneyframe relative\"]/ancestor::*/child::div[@class=\"fnt0\"]/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/child::div[@class='fnt0']/following::a[7]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/ancestor::*/descendant::div[@class='fnt0']/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='fnt0']/following::a[7]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[@class='srchcontainer']/parent::*/preceding::div[@class='cell alignR toprlinks']/parent::*/parent::*/preceding-sibling::div[@class='fnt0']/following::a[7]")).click();
		driver.quit();
		
	}
}
