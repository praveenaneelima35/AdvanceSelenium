package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {

  
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com");
   Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(1000);
	
	WebElement dateList = driver.findElement(By.name("birthday_day"));
	Thread.sleep(1000);
	dateList.click();
	dateList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_UP);
	Thread.sleep(1000);
	dateList.sendKeys(Keys.ARROW_UP);
	}

}
