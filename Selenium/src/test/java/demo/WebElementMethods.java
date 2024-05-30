package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		WebElement txt = driver.findElement(By.name("user-name"));
		Method-1: sendKeys();
		txt.sendKeys("standard_user");
        Thread.sleep(2000);	
        //Method-2: clear();
        txt.clear();
        Thread.sleep(2000);	
        txt.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		//Method-3: click();
		driver.findElement(By.id("login-button")).click();*/
		//Amazon 
		/*driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);*/
		/*WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("puma");
		Thread.sleep(1000);
		//Method-4: submit();
		search.submit();
		//driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement link = driver.findElement(By.linkText("Mobiles"));
		Point loc = link.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		System.out.println(link.getSize().getHeight());
		System.out.println(link.getSize().getWidth());
		System.out.println(link.getRect().getX());
		System.out.println(link.getRect().getY());
		System.out.println(link.getRect().getHeight());
		System.out.println(link.getRect().getWidth());*/
		/*WebElement logo = driver.findElement(By.xpath(" //a[@id='nav-logo-sprites']"));
		if(logo.isDisplayed())
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
	}
		Thread.sleep(2000);
		WebElement searchfield = driver.findElement(By.name("field-keywords"));
		if(searchfield.isEnabled())
		{
			searchfield.sendKeys("bags");
		}
		else
		{
			System.out.println("element is not enabled");
	}	*/
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("//a[@id=\"birthday-help\"]"));
		if(radio.isSelected())
		{
			System.out.println("Radiobutton is Selected");
	}
		else
		{
			System.out.println("Radiobutton is not Selected");
        }
		
	}
}
