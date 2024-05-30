package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenCalendarPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveByOffset(30, 20).click().perform();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//driver.findElement(By.xpath("//div[text()='May 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']")).click();
//Dynamic xpath
		String month = "June 2024";
		String date = "5";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	}

}
