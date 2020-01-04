package searchJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//OpenBrowser
		String browserName = "firefox";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Open FF
			System.setProperty("webdriver.gecko.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			//Open IE
			System.setProperty("webdriver.ie.driver  ", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			//Open Edge
			System.setProperty("webdriver.edge.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		//Enter URL - Comment
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase05() throws Exception{
		//Mouse Over = MORE
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		//Select select = new Select(element)
		Actions act = new Actions(driver);
		act.moveToElement(more);
		act.build().perform();    //Mouse over - Performed
		
		Thread.sleep(1000);     //miliseconds  (1000 ms = 1 sec )
		
		//Click on Naukri Blog   //camleCase
		WebElement naukriBlog = driver.findElement(By.xpath("//a[text()='Naukri Blog']"));
		naukriBlog.click();
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
