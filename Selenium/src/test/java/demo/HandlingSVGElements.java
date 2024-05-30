package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.kayak.co.in/");
		Thread.sleep(1000);
		//SVG elements can't be handled by using normal xpath where we need to follow different syntax.
		//syntax for xpath:(By.xpath("//*[name()='svg' and @AttributeName='AttributeValue']")
        driver.findElement(By.xpath("//*[name()='svg' and @class='c8LPF-icon']")).click();
	}

}
