package web_element_assertions_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Spicejet website
		driver.get("https://www.spicejet.com/");
		
		// Check if Round Trip radio button is selected initially - assertFalse() expects a false boolean value
		//System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		
		// Check that Round Trip radio button has been selected - assertTrue() expects a true boolean value
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		
		// Check that total number of radio buttons in webpage is equal to 6
		//System.out.println(driver.findElements(By.cssSelector("[type='radio']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("[type='radio']")).size(), 6);
		
	}

}
