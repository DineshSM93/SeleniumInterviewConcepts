package seleniumInterview;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// using refresh command

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		driver.navigate().refresh();

		// using driver.getcurrenturl

		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		driver.get(driver.getCurrentUrl());

		// using javascript executor
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		JavascriptExecutor executor = (JavascriptExecutor) driver; //
		// executor.executeScript("location.reload()");
		executor.executeScript("history.go(0)");

		// using robot class
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		// using F5 via send keys
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		driver.findElement(By.name("q")).sendKeys(Keys.F5);

		// using actions calss
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("search");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
	}

}
