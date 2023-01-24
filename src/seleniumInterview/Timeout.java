package seleniumInterview;

import org.testng.annotations.Test;

public class Timeout {
	@Test(timeOut = 2000)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Namakkal");
	}

}
