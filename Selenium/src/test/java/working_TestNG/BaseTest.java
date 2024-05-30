package working_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import working_DataDrivenTesting.DataUtility;

public class BaseTest {
	public DataUtility data=new DataUtility();//Global variable
	public WebDriver driver;//Global variable
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data.getDataFromProperties("url"));	
	}
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys(data.getDataFromProperties("email"));
		driver.findElement(By.id("Password")).sendKeys(data.getDataFromProperties("password"));
		driver.findElement(By.xpath("//input[contains(@class,'button-1 login-button')]")).click();
	}
	@AfterMethod(alwaysRun=true)
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		driver.close();
	}
}
