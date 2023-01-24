package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfGoogleSearch {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.name("q"));
		
		// using keys.enter
		// searchbox.sendKeys("Namakkal" + Keys.ENTER);
       
		// using submit
		// searchbox.sendKeys("Namakkal");
		// searchbox.submit();
		
		// using \n
		// searchbox.sendKeys("Namakkal \n");
		
		// using robot class
		searchbox.sendKeys("Namakkal");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
