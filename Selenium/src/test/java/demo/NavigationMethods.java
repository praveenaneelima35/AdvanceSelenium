package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws Throwable {
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.navigate().to("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().forward();
	  Thread.sleep(1000);
	  driver.navigate().refresh();
	 
	}

}
