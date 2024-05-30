package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		act.contextClick(ele).perform();*/
		
		/*driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);	
		WebElement UserName = driver.findElement(By.name("user-name"));
		Thread.sleep(1000);
		WebElement PassWord = driver.findElement(By.id("password"));
		Thread.sleep(1000);
		WebElement Login = driver.findElement(By.id("login-button"));
		Actions act1=new Actions(driver);
		/*act1.sendKeys(UserName,"standard_user").perform();
		act1.sendKeys(PassWord,"secret_sauce").perform();
		act1.click(Login).perform();*/
		
		//Or
		//act1.sendKeys(UserName,"standard_user").sendKeys(PassWord,"secret_sauce").click(Login).build().perform();
		
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.xpath("//p[text()=\"Drop here\"]"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		/*act.clickAndHold(drag).perform();
		act.release(drop).perform();*/
		//or
		//act.dragAndDrop(drag, drop).perform();
		
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();*/
		
		driver.get("https://www.makemytrip.com");
		Thread.sleep(1000);
		Actions act1=new Actions(driver);
		act1.moveByOffset(20, 20).click().perform();
	}

}
