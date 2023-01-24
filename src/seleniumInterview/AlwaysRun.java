package seleniumInterview;

import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test(timeOut = 2000)
	public void test1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test Case 1 Passed");		
	}
	
	@Test(dependsOnMethods = "test1", alwaysRun = true)
	public void test2()  {		
		System.out.println("Test Case 2 Passed");
	}

}
