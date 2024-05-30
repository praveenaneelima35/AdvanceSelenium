package working_TestNG;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example_CrossBrowser {

	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launchBrowser(String browser) throws InterruptedException {
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
		driver=new EdgeDriver();
		}
	    else 
	    	System.out.println("Please enter a valid browser name");     
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    System.out.println(browser +" : "+ driver.getTitle());
	    driver.close();
}
}
