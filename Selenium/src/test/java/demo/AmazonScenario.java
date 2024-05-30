package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScenario {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		/*driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
	   //driver.findElement(By.linkText("Amazon miniTV")).click();
	   //Thread.sleep(1000);
	   //driver.findElement(By.linkText("Best Sellers")).click();
	   //Thread.sleep(1000);
	   driver.findElement(By.partialLinkText("Amazon m")).click();
	   driver.findElement(By.cssSelector("Amazon m")).click();*/
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bluetooth");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	   String name=driver.findElement(By.xpath("//span[text()='pTron Bassbuds NX TWS Earbuds with HD Mic, TruTalk AI-ENC Calls, 32H Playtime, 13mm Drivers, Bluetooth 5.3 Wireless Headphones, Voice Assistant, Type-C Fast Charging & IPX5 Water Resistant (Brown)']")).getText();
	   Thread.sleep(1000);
	  System.out.println(name);
	//driver.findElement(By.xpath("//a[contains(@class,'nav-lo')]").click();-------Amazon logo
	//driver.findElement(By.xpath("//a[contains(text(),'El')]").click();----------Electronics link
	}

}
