package seleniumInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		boolean selected;
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		/*
		 * for (WebElement box : allCheckBoxes) { Thread.sleep(1000); box.click(); }
		 */
		
		for (int i=0; i<allCheckBoxes.size();i++) {
			selected = allCheckBoxes.get(i).isSelected();
			if(!selected) {
				allCheckBoxes.get(i).click();	
				Thread.sleep(1000);
			}
			
		}
	}

}
