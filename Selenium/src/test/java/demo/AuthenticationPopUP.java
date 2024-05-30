package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUP {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//syntax for Authentication pop-ups----> https://username:password@URL
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		 
		 //syntax for AlertPopUp
		Alert ale = driver.switchTo().alert();
		//ale.accept();
		//driver.switchTo().alert().accept();
		String txt=ale.getText();
		System.out.println(txt);*/
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();*/
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(1000);
		Alert ale1 = driver.switchTo().alert();
		ale1.sendKeys("Hello");
		ale1.accept();
	}

}
