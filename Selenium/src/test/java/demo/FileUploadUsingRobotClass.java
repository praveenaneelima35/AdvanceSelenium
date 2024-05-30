package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement aboutUs=driver.findElement(By.xpath("//a[text()='About Us'] "));
		Actions act=new Actions(driver);
		act.scrollToElement(aboutUs).perform();
		
		driver.findElement(By.xpath("//p[text()='  I have work experience (excluding internships)']")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
			Thread.sleep(3000);	
			//select
			StringSelection path=new StringSelection("‪C:\\Users\\satis\\Desktop\\form60");
			Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
			cb.setContents(path, null);
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);	
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
	
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	}

}
