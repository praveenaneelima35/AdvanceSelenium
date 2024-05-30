package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebElements1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(1000);
       driver.get("https://www.google.com/");
       Thread.sleep(1000);
       driver.findElement(By.className("gLFyf")).sendKeys("selenium");
       Thread.sleep(1000);
       List<WebElement> allSugg = driver.findElements(By.xpath(" //li[@class='sbct PZPZlf']"));
       Thread.sleep(1000);
       int count=0;
       for(WebElement ele:allSugg)
       {
    	   System.out.println(ele.getText());
    	   String data = ele.getText();
    	   count++;
    	   if(data.contains("selenium tutorial"))
    	   {
    		   ele.click();
	}
    	   System.out.println("The total suggestions are :"+count);   
}
	}
}
