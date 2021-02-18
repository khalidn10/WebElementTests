package web_element_assertions_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) /*throws InterruptedException*/ {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load AutomationPractice website in rahulshettyacademy.com
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// Enter Name and click Alert button
		String name = "Alludin";
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		// Why does using Thread.sleep make code with alert box unstable?
		// It works sometimes but also gives error at other times
		//Thread.sleep(2000);
		
		// Retrieve message in alert box and click OK button
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		// Enter Name and click Confirm button
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		
		// Retrieve message in confirm box and click Cancel button
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
