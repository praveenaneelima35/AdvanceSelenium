package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		//WebDriverManager.chromedriver().setup();//Setup Empty Browser
		WebDriver driver=new ChromeDriver();//Launch Empty Browser
		driver.get("https://the-internet.herokuapp.com/upload");//Launch Application
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\satis\\Desktop\\New Text Document.txt");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='button']")).click();

	}

}