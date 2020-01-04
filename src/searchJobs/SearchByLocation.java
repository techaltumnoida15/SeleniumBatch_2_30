package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchByLocation {

	//Declare WebDriver
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.navigate().to("http://www.naukri.com");
	}
	
	@Test
	public void searchByLocation() {
		//Click in Search job text box
		driver.findElement(By.id("qsbClick")).click();
		
		//Fill search details
		driver.findElement(By.name("qp")).sendKeys("C#");
		System.out.println("Skills is entered.");
		
		//Enter Location
		driver.findElement(By.name("ql")).sendKeys("Delhi");
		System.out.println("Enter location");
		
		//Select Exp
		//driver.findElement(By.xpath("//input[@class='sdTxt w85']")).click();
		driver.findElement(By.cssSelector("input[class='sdTxt w85']")).click();
		
		//CLick on Search button
		if(driver.findElement(By.id("qsbFormBtn")).isEnabled()) {

			System.out.println("Search button is enable");
			driver.findElement(By.id("qsbFormBtn")).click();
			System.out.println("Click on Search button.");
		}
		else {
			System.out.println("Test is fail");
		}
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
