package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String browserName = "chrome";
		
		//Open Browser
		String currentProjectPath = System.getProperty("user.dir");
		System.out.println("Current project path is = " + currentProjectPath);
		
		String currentOSname = System.getProperty("os.name");
		System.out.println("Current OS name is = " + currentOSname);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", currentProjectPath + "\\browserDriverEXE\\chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			//Open FF
			System.setProperty("webdriver.gecko.driver", currentProjectPath + "\\browserDriverEXE\\geckodriver.exe"); 
			driver = new FirefoxDriver();
		}
		
		else {
			//Open IE
			System.setProperty("webdriver.ie.driver", currentProjectPath + "\\browserDriverEXE\\IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
	}	
	
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
		
	}
}
