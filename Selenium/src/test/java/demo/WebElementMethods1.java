package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		/*driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		WebElement link = driver.findElement(By.linkText("Today's Deals"));
		System.out.println(link.getTagName());
		System.out.println(link.getAriaRole());
		System.out.println(link.getAccessibleName());
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));*/
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]"));
		System.out.println(logo.getCssValue("size"));
		System.out.println(logo.getCssValue("color"));
	}

}
