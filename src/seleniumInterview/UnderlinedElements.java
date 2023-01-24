package seleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderlinedElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		String beforehovering = tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering : " + beforehovering);
		
		Actions action = new Actions(driver);
		action.moveToElement(tamil).build().perform();
		// action.perform();
		
		String afterhovering = tamil.getCssValue("text-decoration");
		System.out.println("After hovering : " + afterhovering );

	}

}
