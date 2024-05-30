package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingAncestorDescendant {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("phones",Keys.ENTER);
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
		//String price = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")
		System.out.println(price);

	}

}
