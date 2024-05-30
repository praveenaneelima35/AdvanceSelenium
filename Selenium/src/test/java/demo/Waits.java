package demo;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Waits {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//syntax for javaWait
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		//syntax for implicitWait in version 3
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS));
		
		//syntax for implicitWait in version 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.cssSelector("input.btn_action"));
		
		//syntax for explicitWait of 10s
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		wait.until(ExpectedConditions.titleContains("Swag Labs"));
		driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();*/
		
		//syntax for fluentWait of 10s
		FluentWait fwait=new FluentWait(driver);
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();

	}

}
