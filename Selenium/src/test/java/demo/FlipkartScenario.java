package demo;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScenario {

	public static void main(String[] args) throws Throwable {
		//Launch Browser, enter Flipkart URL, type bluetooth in Search, click on Search button, Click on Mivi DuoPods link
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("mobiles");
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("[aria-label='Search for Products, Brands and More']")).click();
		Thread.sleep(1000);	
		//driver.findElement(By.linkText("Mivi DuoPods i4 TWS,Quad-mic ENC,13mm Bass,50+ Hrs Play...")).click();
		//driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		//Relative XPath Syntax-2:
		//driver.findElement(By.xpath("//span[text()='Grocery']")).click();
		
		/*driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("mobiles");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);*/
		//ListIterator<WebElement> WebElement;
		List<WebElement> names=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
        System.out.println(names);
	   int count=0;
	for (WebElement name:names)
	   {
		   System.out.println(name.getText());
		   count++;
}
	System.out.println("Total names are:"+count);
	}
}
