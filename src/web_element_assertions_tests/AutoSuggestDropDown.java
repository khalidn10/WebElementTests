package web_element_assertions_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Chrome driver 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load website
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		// Search Country auto-suggest drop down list and select Pakistan
		driver.findElement(By.id("autosuggest")).sendKeys("pa");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options)
		{
			if (option.getText().equalsIgnoreCase("pakistan"))
			{
				option.click();
				break;
			}
		}
		
	}

}
