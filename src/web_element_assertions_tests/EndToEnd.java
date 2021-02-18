package web_element_assertions_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load Spicejet website and maximise window
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		// Select Round Trip radio button
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
		
		// Select From and To Airports
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		// Select Depart Date calendar and then current date
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		// Select Return Date calendar and then current date
		//Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		// Select number of adult passengers from static drop-down list
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//Thread.sleep(2000L);
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		
		// Select Senior Citizen checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		// Click on Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
