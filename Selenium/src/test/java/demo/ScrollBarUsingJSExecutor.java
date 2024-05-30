package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarUsingJSExecutor {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.automationtesting.in/Windows.html"); 
		   //driver.get("https://www.facebook.com");
		   Thread.sleep(1000);
		  //WebElement ele = driver.findElement(By.xpath("//a[text()='Games']"));
		  /* System.out.println(ele.getLocation().getX());
		  System.out.println(ele.getLocation().getY());
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(538,786)");
		 ele.click();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
                  js.executeScript("arguments[0].scrollIntoView()",ele);
                  ele.click();*/
                  JavascriptExecutor js=(JavascriptExecutor)driver;
                  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
                  Thread.sleep(2000);
                  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
                  Thread.sleep(2000);
                  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
                  Thread.sleep(2000);
                  js.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
                  
	}

}
