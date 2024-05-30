package demo_webshop_Testcases;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import working_DataDrivenTesting.DataUtility;
import working_TestNG.BaseTest;

public class BooksTestCase02 extends BaseTest{
 @Test(groups="Integration")
	public void booksTestCase02() throws IOException {
	//TestNG Script using Assert
	 driver.findElement(By.partialLinkText("Books")).click();
	 String expTitle=data.getDataFromExcel("Sheet2", 1, 2);
		
		Assert.assertEquals(driver.getTitle(), expTitle);
		
		Reporter.log("Books page is displayed", true);
		driver.findElement(By.xpath("//a[text()='Fiction EX']")).click();
	 String FictionTitle=data.getDataFromExcel("Sheet2", 2, 2);
	 Assert.assertEquals(driver.getTitle(),FictionTitle);
	 Reporter.log("BooksTestCase02 is passed", true);
	 
	    //TestNG Script using If else
		/*driver.findElement(By.partialLinkText("Books")).click();
        driver.findElement(By.xpath("//a[text()='Fiction EX']")).click();
        //validation
      		String title = driver.getTitle();
      		if(title.contains(data.getDataFromExcel("Sheet2", 2, 2))) 
      		{
      			System.out.println("Fiction EX product is displayed");
      		}
      		else {
      			System.out.println("Fiction EX product is not displayed");
      		}*/
	

	}

}
