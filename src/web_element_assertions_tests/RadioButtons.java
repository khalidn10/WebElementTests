package web_element_assertions_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Spicejet website
		driver.get("https://www.spicejet.com/");
		
		// Check if Round Trip radio button is selected before and after selecting it
		System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		
		// Count total number of radio buttons in webpage
		System.out.println(driver.findElements(By.cssSelector("[type='radio']")).size());
		List<WebElement> radio = driver.findElements(By.cssSelector("[type='radio']"));
		for (WebElement r : radio)
		{
			System.out.println();
			System.out.println(r.getTagName());
			System.out.println(r.getAttribute("value"));
			System.out.println(r.isDisplayed());
			System.out.println(r.isEnabled());
			System.out.println(r.isSelected());
			System.out.println(r.getLocation());
		}
	}

}
