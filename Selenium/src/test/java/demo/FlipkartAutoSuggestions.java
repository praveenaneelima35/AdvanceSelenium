package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggestions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(1000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		Thread.sleep(1000);
        for(WebElement allsugg:sugg)
        {
        	System.out.println(allsugg.getText());
        	String ele=allsugg.getText();
        	Thread.sleep(1000);
        if(ele.contains("nike sneakers"))
 	   {
        	allsugg.click();
	}
 	   
        }
	}
}
	

