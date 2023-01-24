package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingGoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Game of Thrones");
		Thread.sleep(5000);
		
		// click using position
		/*
		 * List<WebElement> searchsuggestions =
		 * driver.findElements(By.xpath("//ul[@role='listbox']//following::li")); int
		 * position = 0; for (WebElement webElement : searchsuggestions) {
		 * System.out.println(webElement.getText()); position++; if (position==3) {
		 * webElement.click(); break;
		 * 
		 * } }
		 */

		
		// clicking using text
		List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : searchsuggestions) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contains("cast")) {
				webElement.click();
				break;
				
			}
		}
		
	}

}
