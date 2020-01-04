package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL - Comment
		driver.get("http://www.cheapoair.com");
	}
	
	@Test
	public void testCase04() {
		//Select value from drop down
		
		//Adults
		WebElement adultDropDown = driver.findElement(By.name("Adults"));
		Select selectAdults = new Select(adultDropDown);
		selectAdults.selectByIndex(3);   //should select 3
		
		
		//Seniors
		WebElement seniorsDropDown = driver.findElement(By.name("Seniors"));
		Select selectSeniors = new Select(seniorsDropDown);
		selectSeniors.selectByValue("4");   //should select 4
		
		
		//Youth
		WebElement youthDropDown = driver.findElement(By.name("Youths"));
		Select selectYouth = new Select(youthDropDown);
		selectYouth.selectByVisibleText("5");   //should select 5
		
		
		//Select CLASS
		WebElement flightClassDropdown = driver.findElement(By.name("Class"));
		Select flightClass = new Select(flightClassDropdown);
		//flightClass.selectByIndex(2);
		//flightClass.selectByValue("5");   //Premium Economy
		flightClass.selectByVisibleText("First");
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
	
}
