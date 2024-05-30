package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step1: Path connection
		//FileInputStream fis=new FileInputStream("C:\\Users\\satis\\Desktop\\data.properties.txt");
		FileInputStream fis=new FileInputStream("./data.properties.txt");
		
		//Step2: Reading data from Properties file
		Properties p=new Properties();
    	p.load(fis);
    	String URL=p.getProperty("url");
    	String USERNAME=p.getProperty("username");
    	String PASSWORD=p.getProperty("password");
    	
    	//Step3: Writing data to Webpage
    	driver.get(URL);
		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
	}

}
