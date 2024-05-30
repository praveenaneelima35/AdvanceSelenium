package working_TestNG;

import org.testng.annotations.Test;

public class TestAnnotation {
	
    @Test(priority=-1)
	public void Launch() {
		System.out.println("Browser is Launched");
    }
    @Test(priority=2,dependsOnMethods="Launch")
    public void Home() {
		System.out.println("Navigated to Home page");
    }
    @Test(priority=0)
	public void Login() {
		System.out.println("Login into the Application");
	}
    @Test(priority=1)
	public void Validate() {
		System.out.println("Test case is passed");	
	}
   // public static void main(String[] args) {
    	//System.out.println("Thank you");
	}

