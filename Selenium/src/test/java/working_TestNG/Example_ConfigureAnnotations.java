package working_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_ConfigureAnnotations {
 //chronological order of execution
@BeforeSuite	
 public void beforesuite() {	
	Reporter.log("Conncetion to Server",true);
 }
@BeforeTest
 public void beforeTest() {	 
	Reporter.log("Conncetion to DataBase",true);
 }
@BeforeClass
 public void beforeClass() {
	Reporter.log("Launch the browser",true);
 }
@BeforeMethod
 public void beforeMethod() {	
	Reporter.log("Login into Application",true);
 }
@Test
 public void testcase() {	
	Reporter.log("Execution of Test Case",true);
 }
@AfterMethod
 public void afterMethod() {	
	Reporter.log("Logout from Application",true);
 }
@AfterClass
 public void afterClass() {	 
	Reporter.log("Close the Browser",true);
 }
@AfterTest
 public void afterTest() {
	Reporter.log("Disconnect from DataBase",true);
 }
@AfterSuite
 public void aftersuite() {	
	Reporter.log("Disconnect from Server",true);
 }
}


