package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownUsingWebElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//option[text()='10']"));
		date.click();
		driver.findElement(By.xpath("//option[text()='Dec']")).click();
		driver.findElement(By.xpath("//option[text()='2010']")).click();
		//driver.findElement(By.xpath("//option[text()='2010']")).click();)
	}

}

