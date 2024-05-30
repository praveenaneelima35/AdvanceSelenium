package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNestedFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
	    //switching driver to top frame using WebElement
		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topframe);
		
		//switching driver to left frame using WebElement
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftframe);
		String left=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(left);
		
		//switching driver to parent frame
		driver.switchTo().parentFrame();
		
		//switching driver to middle frame using name attribute
		driver.switchTo().frame("frame-middle");
		String middle = driver.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(middle);
		
		//switching driver to main webpage 
		driver.switchTo().defaultContent();
		//switching driver to bottom frame using name attribute
		driver.switchTo().frame("frame-bottom");
		/*WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomframe);*/
		String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottom);
		driver.quit();
	}

}
