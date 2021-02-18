package web_element_assertions_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Spicejet website
		driver.get("https://www.spicejet.com/");
		
		// Check if Senior Citizen checkbox is ticked before and after selecting it
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		// Count total number of checkboxes in webpage
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		List<WebElement> checkbox = driver.findElements(By.cssSelector("[type='checkbox']"));
		for (WebElement cb : checkbox)
		{
			System.out.println(cb.isDisplayed());
		}
				
	}

}
