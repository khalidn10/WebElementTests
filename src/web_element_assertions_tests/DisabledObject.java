package web_element_assertions_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Spicejet website
		driver.get("https://www.spicejet.com/");
		
		// Check if Return Date is enabled before and after selecting Round Trip radio button
		//System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isEnabled());
		//driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isEnabled());
		
		// Check if opacity attribute of <div> tag containing Return Date is set to 0.5 (disabled) or 1 (enabled)
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			System.out.println("Return date is disabled");
		else
			System.out.println("Return date is enabled");
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			System.out.println("Return date is disabled");
		else
			System.out.println("Return date is enabled");
		
		driver.close();
		
	}

}
