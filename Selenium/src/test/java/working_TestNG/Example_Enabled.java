package working_TestNG;

import org.testng.annotations.Test;

public class Example_Enabled {

	
	@Test(enabled=false)
	public void test1() {
		
		System.out.println("Test1 is passed");
	}
	@Test
    public void test2() {
    	System.out.println("Test2 is passed");
	}
}
