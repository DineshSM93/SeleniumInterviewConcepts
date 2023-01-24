package seleniumInterview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HitURLwithoutGET {

	public static void main(String[] args) {
		
		String url = "https://www.google.com";
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location = \' " + url + " \' ");
		                 //    "window.location =  '     url      ' " 
		
	}

}
