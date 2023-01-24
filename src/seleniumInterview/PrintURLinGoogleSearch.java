package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintURLinGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("12 Angry men \n");
		Thread.sleep(5000);
		
		// To print all url's
		/*
		 * List<WebElement> totalLinks = driver.findElements(By.xpath("//a")); for
		 * (WebElement webElement : totalLinks) {
		 * System.out.println(webElement.getAttribute("href")); }
		 */

		// To print only main urls's
		List<WebElement> mainLinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		
		// xpath can also be written as //a/did/cite
		for (WebElement links : mainLinks) {
			System.out.println(links.getText());
			
		}
	}

}
