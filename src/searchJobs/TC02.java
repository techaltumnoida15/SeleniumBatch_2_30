package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	
	@Test
	public void testCase02() {
		driver.findElement(By.id("qsbClick")).click();
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
}
