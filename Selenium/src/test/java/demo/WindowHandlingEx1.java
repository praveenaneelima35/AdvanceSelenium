package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*driver.get("https://www.naukri.com/");
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		//Switch to window using window Id
		String mainId=driver.getWindowHandle();
		System.out.println(mainId);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for(String win: allIds)
		{
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
			}
		}*/
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		String mainId1=driver.getWindowHandle();
		System.out.println(mainId1);
		Set<String> allIds1 = driver.getWindowHandles();
		System.out.println(allIds1);
		
		for(String win: allIds1)
		{
			if(!mainId1.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='Downloads']")).click();
			}
		}
		
	}

}
