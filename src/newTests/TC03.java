package newTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC03 extends BaseClass{

	@Test
	public void testCase03() throws Exception {
		driver.get("http://www.cheapoair.com");
		
		//Enter Origin
		WebElement origin = driver.findElement(By.xpath("(//input[@class='form-control pr-4'])[1]"));
		origin.sendKeys("LAS");
		//Thread.sleep(4000);
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.pollingEvery(Duration.ofMillis(500));
		 * 
		 * wait.until(ExpectedConditions.attributeContains(By.cssSelector(
		 * "div[class^='suggestion-box__content']"), "class", "visible"));
		 */
		
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver);
		fWait.withTimeout(Duration.ofSeconds(10));
		fWait.pollingEvery(Duration.ofMillis(500));
		
		//fWait.until(ExpectedConditions.)
		
		//How many suggestion..?
		List<WebElement> allSuggestion = driver.findElement(By.xpath("//ul[@class='suggestion-box__list']")).findElements(By.tagName("li"));
		System.out.println("Total suggestion are = " + allSuggestion.size());
		
		
		//Handle suggestion box
		String startXP = "//ul[@class='suggestion-box__list']/li[";
		int i = 1;
		String endXP = "]";

		String xp = startXP + i + endXP;
		
		for(i = 1; i<allSuggestion.size(); i++) {  //Las Palmas, Spain
			
			String cityNameInSuggestion = allSuggestion.get(i).getText();
			System.out.println(cityNameInSuggestion);
			
			if(cityNameInSuggestion.contains("Las Palmas, Spain")) {
				allSuggestion.get(i).click();
				break;
			}
		}
		
		//wait.until(ExpectedConditions.elementtobecl)
	}
}











