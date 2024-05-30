package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUp {

	public static void main(String[] args) {
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");*/
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.irctc.co.in/nget/train-search"); */
	   
	     ChromeOptions opt = new ChromeOptions();
	      opt.addArguments("--incognito-notifications");
	     WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.amazon.in"); 

	}

}
