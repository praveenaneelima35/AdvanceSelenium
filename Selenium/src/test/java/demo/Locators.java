package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//Thread.sleep(1000);
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Thread.sleep(1000);
		//driver.findElement(By.id("login-button")).click();
		//Syntax-2:
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
		//Thread.sleep(1000);	
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		//Thread.sleep(1000);	
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		//Syntax-3:
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		//Syntax-4:
	   //driver.findElement(By.cssSelector("input#login-button")).click();
		//Syntax-5:
	   //driver.findElement(By.cssSelector(".btn_action")).click();
		//Syntax-6:
		driver.findElement(By.cssSelector("input.btn_action")).click();
		}
	
}
