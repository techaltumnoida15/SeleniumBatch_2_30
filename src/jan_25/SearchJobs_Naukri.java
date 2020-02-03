package jan_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class SearchJobs_Naukri extends BaseClass{

	@Test
	public void testCase01() {
		//Click on search job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on search job text box.");
		
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		System.out.println("Skill is entered.");
		
		//Enter Location
		driver.findElement(By.name("ql")).sendKeys("Noida");
		System.out.println("Location is entered.");
		
		//Click on search button
		driver.findElement(By.id("qsbFormBtn")).click();
		System.out.println("Click on search Button");
		
		
	}
	
}
