package jan_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is = " + projectPath);
		
		String userName = System.getProperty("user.name");
		System.out.println("User name is = " + userName);
		
		String osName = System.getProperty("os.name");
		System.out.println("OS name = " + osName);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDriverEXE\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_15_Selenium\\browserDriverEXE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window();
		
		driver.get("http://www.google.com");
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
