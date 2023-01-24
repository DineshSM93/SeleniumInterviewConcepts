package seleniumInterview;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://www.google.co.in/");
		// driver.manage().window().maximize();
		
		// Dimension dimension  = new Dimension(1366, 768);
		// driver.manage().window().setSize(dimension);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.co.in/");
	}

}
