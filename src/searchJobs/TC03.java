package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03 {

	WebDriver driver; 
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		
		//Open browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.onetravel.com");
	}
	
	@Test
	public void testCase03() {
		//Enter FROM city
		//driver.findElement(By.xpath("//input[@class='form-control pr-4']")).clear();   //Clear already written text - if any
	
		driver.findElement(By.xpath("//input[@class='form-control pr-4']")).click();
		driver.findElement(By.xpath("//input[@class='form-control pr-4']")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@class='form-control pr-4']")).sendKeys("NYC");
		
		
		//Enter TO city - 
		WebElement toCityTextBox = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[2]"));
		toCityTextBox.click();
		toCityTextBox.sendKeys(Keys.BACK_SPACE);
		toCityTextBox.sendKeys("DEL");
		
		System.out.println("Java");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
}
