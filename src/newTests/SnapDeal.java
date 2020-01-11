package newTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class SnapDeal extends BaseClass{

	@Test
	public void loginTest() throws Exception{
		driver.get("http://www.snapdeal.com");
		
		//Mouse Over
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		
		act.build().perform();
		
		Thread.sleep(2000);
		
		
		//Click on LogIn
		WebElement logIn = driver.findElement(By.xpath("//a[@href='https://www.snapdeal.com/login']"));
		logIn.click();
		
		Thread.sleep(5000);
		
		//Switch to iframe
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='loginIframe']")));
		
		//Popup
		WebElement mobileNumber = driver.findElement(By.name("username"));
		mobileNumber.sendKeys("9711235995");
		
	}
}
