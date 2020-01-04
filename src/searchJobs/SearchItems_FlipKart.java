package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchItems_FlipKart {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.flipkart.com");
	}
	
	@Test
	public void searchItems() {
		//Type some item in search text box
		driver.findElement(By.name("q")).sendKeys("Mobile");
		System.out.println("Search item is entered.");
		
		//Click on search
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		System.out.println("Click on Search button");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
