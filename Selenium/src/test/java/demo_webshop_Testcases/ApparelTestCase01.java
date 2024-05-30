package demo_webshop_Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import working_DataDrivenTesting.DataUtility;
import working_TestNG.BaseTest;

public class ApparelTestCase01 extends BaseTest{
    @Test(groups= {"Integration","Smoke"})
	public void apparelTestCase01() throws IOException {
    	//TestNG Script using Assert
	     String actualProdName=data.getDataFromExcel("Sheet2", 3, 3);
	     driver.findElement(By.name("q")).sendKeys(actualProdName);
	     String expProdName=driver.findElement(By.xpath("//a[text()='Blue Jeans']")).getText();
	     Assert.assertEquals(actualProdName, expProdName);
	     Reporter.log("ApparelTestCase01 is passed", true);
	     
	    //TestNG Script using If else 
		/*driver.findElement(By.linkText("Apparel & Shoes")).click();
		//boolean jeans = driver.findElement(By.xpath("//a[text()='Blue Jeans']")).isDisplayed();
		if(driver.findElement(By.xpath("//a[text()='Blue Jeans']")).isDisplayed()) 
		{
			System.out.println("Blue jeans product is displayed");	
		}
		else
		{
			System.out.println("Blue jeans product is not displayed");	
		}	*/
		
	}

}
