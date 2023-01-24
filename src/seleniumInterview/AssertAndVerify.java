package seleniumInterview;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAndVerify {
	
	
	/*
	 * @Test public void assertTest() { System.out.println("Before Assertion");
	 * Assert.fail(); System.out.println("After Assertion"); }
	 */	 

	
	  @Test public void verifyTest() { 
		  SoftAssert assert1 = new SoftAssert();
	  System.out.println("Before Assertion"); 
	  assert1.fail();
	  System.out.println("After Assertion"); }
	 
	
}
