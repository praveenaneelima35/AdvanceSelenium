package working_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example_SoftAssert {
	public WebDriver driver;

	 @Test
     public void testcase02() throws InterruptedException {
    	 
    	driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 		driver.get("https://www.google.com");
 		SoftAssert sa=new SoftAssert();
 		sa.assertEquals(driver.getTitle(),"Google");
 		Reporter.log("Navigated to Google page", true);
 		driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
 		Thread.sleep(1000);
 		sa.assertTrue(driver.getTitle().equals("Selenium - Google Search"));
 		Reporter.log("Searching Selenium : Result found", true);
 		driver.close();
 		sa.assertAll();
	 }	
}
