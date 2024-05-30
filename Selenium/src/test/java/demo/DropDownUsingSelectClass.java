package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingSelectClass {
	public static void main(String[] args) throws Throwable {
		//Approaches
			//*using index ----->0
			//*using value
			//*using visible text
			 WebDriverManager.chromedriver().setup();
			   WebDriver driver=new ChromeDriver();
			   driver.get("https://www.facebook.com");
			  
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(2000);
				
			WebElement dateList = driver.findElement(By.name("birthday_day"));
			Thread.sleep(2000);
	        Select sel = new Select(dateList);
		//	sel.selectByIndex(19);
	    //  sel.selectByValue("30");
		    sel.selectByVisibleText("10");
	        
		    WebElement monthList = driver.findElement(By.name("birthday_month"));
		    Select sele = new Select(monthList);
		 //   sele.selectByIndex(9);
		 //   sele.selectByValue("12");
		      sele.selectByVisibleText("Jun");
		    
		    WebElement yearList = driver.findElement(By.name("birthday_year"));
		     Select select = new Select(yearList);
		     select.selectByIndex(1);
		 //   select.selectByValue("1994");
		 //   select.selectByVisibleText("2014");
		    
		}

	}
	
