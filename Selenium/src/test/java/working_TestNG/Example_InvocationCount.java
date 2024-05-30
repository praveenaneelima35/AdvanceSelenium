package working_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import working_DataDrivenTesting.DataUtility;

public class Example_InvocationCount {
    @Test(invocationCount=3)
	public void testcase() throws IOException {
		
		DataUtility data=new DataUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFromProperties("url"));
		if(driver.getTitle().equals("Demo Web Shop")) {
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		driver.close();	
	}
}
