package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMethods {

	public static void main(String[] args) {
	//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//Method-1
		driver.get("https://www.flipkart.com/");
    //Method-2
		//driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
	//Method-3
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	//Method-4
		String source = driver.getPageSource();
		System.out.println(source);
	//Method-5	
		/*Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();*/
		driver.manage().window().maximize();
	//Method-6	
		driver.manage().window().minimize();
	//Method-7	
		driver.manage().window().fullscreen();
	}

}
