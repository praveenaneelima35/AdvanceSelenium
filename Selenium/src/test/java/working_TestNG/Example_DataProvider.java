package working_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_DataProvider {

	@Test(dataProvider="dataSupply")
	public void testCase(String email, String password) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(3000);
			driver.close();
		}
		
	@DataProvider	
	public Object[][] dataSupply() {
		Object[][] arr=new Object[3][2];
		arr[0][0]="Admin1@gmail.com";
		arr[0][1]="Admin@1";
				
	    arr[1][0]="Admin2@gmail.com";
	    arr[1][1]="Admin@2";
	    		
	    arr[2][0]="Admin3@gmail.com";
	    arr[2][1]="Admin@3";
	    return arr;
				
	}
}
