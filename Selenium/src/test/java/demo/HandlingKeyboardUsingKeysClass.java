package demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
	   /*driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	*/
		/*Case1:
		WebElement txt = driver.findElement(By.name("user-name"));
		txt.sendKeys("standard_user");
		Thread.sleep(1000);	
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);*/
		//case2:
		/*WebElement txt = driver.findElement(By.name("user-name"));
		Thread.sleep(1000);	
		txt.sendKeys("standard_user",Keys.TAB, "secret_sauce",Keys.ENTER);*/
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}

}
