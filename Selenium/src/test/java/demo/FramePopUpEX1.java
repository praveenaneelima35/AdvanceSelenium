package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePopUpEX1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://demo.automationtesting.in/Frames.html");
		/*driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();*/
		
	  //switchTo frames using index
		//driver.switchTo().frame(1);
	    //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
	    
	  //switchTo frames using id attribute
	    //driver.switchTo().frame("singleframe");
	    //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("To Selenium class");
	  	
	  //switchTo frames using name attribute
	  //driver.switchTo().frame("SingleFrame");
	  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thank you");
	  	
	  //switchTo frames using webElement
	  	WebElement framele = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	  	driver.switchTo().frame(framele);
	  	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thank you");
		
	}

}
