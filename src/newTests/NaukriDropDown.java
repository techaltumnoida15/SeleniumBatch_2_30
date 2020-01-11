package newTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class NaukriDropDown extends BaseClass{

	@Test
	public void naukriDropDown() {
		
		driver.get("http://www.naukri.com");
		
		//Click on Search job text box
		WebElement searchJobTextBox = driver.findElement(By.id("qsbClick"));
		searchJobTextBox.click();
		
		//Enter skills
		WebElement skills = driver.findElement(By.name("qp"));
		skills.sendKeys("Java");
		
		//Enter location
		WebElement location = driver.findElement(By.name("ql"));
		location.sendKeys("Noida");
		
		//Press Tab Key
		location.sendKeys(Keys.TAB);
		
		//Now you are on exp 
		WebElement expDropdown = driver.findElement(By.xpath("//input[@class='sdTxt w85']"));
		/*
		 * expDropdown.sendKeys(Keys.ARROW_DOWN); expDropdown.sendKeys(Keys.ARROW_DOWN);
		 * expDropdown.sendKeys(Keys.ARROW_DOWN); expDropdown.sendKeys(Keys.ARROW_DOWN);
		 */
		
		for(int i = 0; i<5; i++) {
			expDropdown.sendKeys(Keys.ARROW_DOWN);
		}
		
		//Select Exp
		/*
		 * WebElement expDropdown =
		 * driver.findElement(By.xpath("//input[@class='sdTxt w85']")); Select selectExp
		 * = new Select(expDropdown); selectExp.selectByIndex(5); //should select 4
		 */	
	
		
	
	}
}
