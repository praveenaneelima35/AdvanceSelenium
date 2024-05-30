package demo_webshop_Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import working_DataDrivenTesting.DataUtility;
import working_TestNG.BaseTest;

public class BooksTestCase01 extends BaseTest{

	@Test(groups="System")
  public void booksTestCase01() throws IOException {
		//TestNG Script using Assert
		driver.findElement(By.partialLinkText("Books")).click();
		String expTitle=data.getDataFromExcel("Sheet2", 1, 2);
		
		Assert.assertEquals(driver.getTitle(), expTitle);
		
		Reporter.log("BooksTestCase01 is passed", true);
		
		
		//TestNG Script using If else 
		/*driver.findElement(By.partialLinkText("Books")).click();
        //validation
		String title = driver.getTitle();
		if(title.contains(data.getDataFromExcel("Sheet2", 1, 2)))
		{
			System.out.println("Books page is displayed");
		}
		else {
			System.out.println("Books page is not displayed");
		}*/
	}

}
