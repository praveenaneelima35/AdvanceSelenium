package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		/*List<WebElement> links = driver.findElements(By.xpath("//a"));
		Thread.sleep(1000);
		int count=0;
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("The total links are: "+count);*/
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		Thread.sleep(1000);
		for(WebElement suggestions:sugg)
		{
			System.out.println(suggestions.getText());
			Thread.sleep(1000);
			 String Actdata=suggestions.getText();
			 Thread.sleep(1000);
		if(Actdata.contains("puma shoes"))
		{
			suggestions.click();
		}
	}

	}
}
