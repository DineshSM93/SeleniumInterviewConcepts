package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendkeys {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		
		  WebElement searchbox = driver.findElement(By.name("q"));
		 // searchbox.sendKeys("Namakkal");
		 
		
			/*
			 * JavascriptExecutor executor = (JavascriptExecutor) driver; //
			 * executor.executeScript("document.getElementsByName('q')[0].value='Namakkal'",
			 * ""); executor.executeScript("arguments[0].value='Namakkal'", searchbox);
			 */
		
		  driver.switchTo().activeElement();
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_N);
		  robot.keyRelease(KeyEvent.VK_N);

	}

}
