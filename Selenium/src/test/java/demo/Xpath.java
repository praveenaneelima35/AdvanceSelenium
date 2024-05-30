package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		/*driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/div/div/div[3]/div/button")).click();*/
		//Relative Xpath:
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
	}

}
