package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandlingUsingTitles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		//Switching to second window/win2 based on title
		Set<String> allwind = driver.getWindowHandles();//win1, win2
		for(String win: allwind)
		{
			driver.switchTo().window(win);
			String title=driver.getTitle();
			Thread.sleep(1000);
			//System.out.println(title);
		if(title.contains("Selenium"))
		{
			break;
		}
	}
     
		driver.findElement(By.xpath("//a[text()='Learn more & submit']")).click();
		//-----------------------------------------------------------------------------
		//Switching to third window/win3 based on title
		Set<String> allwind1= driver.getWindowHandles();//win1, win2, win3
		for(String win1: allwind1)
		{
			driver.switchTo().window(win1);
			String title1=driver.getTitle();
			Thread.sleep(1000);
			System.out.println(title1);
		if(title1.contains("Submit a Proposal"))
		{
			break;
		}
	}
		Actions act=new Actions(driver);
		act.moveByOffset(30,20).click().perform();
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();	
		//driver.close();---------closes currently focused window
		//driver.quit();---------closes all the opened windows
		//--------------------------------------------------------------------
		//Switching to main window(Frames & windows)/win1 based on title
		Set<String> allwind2= driver.getWindowHandles();//win1, win2, win3
		for(String winmain: allwind2)
		{
			driver.switchTo().window(winmain);
			String titlemain=driver.getTitle();
			Thread.sleep(1000);
			System.out.println(titlemain);
		if(titlemain.contains("Frames & windows"))
		{
			break;
		}
	}
		driver.close();
	}
}
