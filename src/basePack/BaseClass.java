package basePack;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void openBrowser(String browserName) {
		//String browserName = "firefox";
		
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
		
		//refresh
		//driver.navigate().refresh();
		
		//driver.navigate().forward();
		
		//driver.navigate().back();
		
		//driver.manage().deleteAllCookies();
		
		//imp wait
		//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.MINUTES);
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}	
	
	
	@AfterMethod
	public void quitBrowser(ITestResult result) throws Exception{
		/*
		String s1 = result.getMethod().getMethodName();
		System.out.println("Test Method Name is = " + s1);
		
		long timeToExecute = result.getEndMillis();
		System.out.println("Total time to execute test " + s1 + " is = " + timeToExecute);
		
		String s2 = result.getTestClass().getName();
		System.out.println("S2 is = " + s2);
		
		*/
		if(!result.isSuccess()) {
			//Take screenshot
			
			  File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  
			  String screenshotName = result.getTestClass().getName() + "_" + result.getMethod().getMethodName();
			  
			  String pattern = "dd-MM-yyyy_hh-mm-ss";
			  SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			  String dateTime = simpleDateFormat.format(new Date());
			  
			
			  String destinationPath = System.getProperty("user.dir") + "\\screenshot\\" + screenshotName + "_" + dateTime + ".jpeg";
			  
			  File destScrrenshot = new File(destinationPath);
			  
			  //FileUtils.copyFile(srcScreenshot, destScrrenshot);
			  FileUtils.moveFile(srcScreenshot, destScrrenshot);
			 
			//testCase01_2020-02-02_03-53-39.jpeg
			  //feb_02.TC01_testCase01_02-02-2020_03-55-39.jpeg
		}
				
		driver.quit();
		
	}
}
