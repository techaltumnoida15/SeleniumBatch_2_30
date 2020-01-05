package newTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC04 extends BaseClass{
	
	@Test
	public void testCase04() {
		driver.get("http://www.cheapoair.com");
		
		//Open calendar
		WebElement departCal = driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		Boolean IsEnabledDepartCal = departCal.isEnabled();
		if(IsEnabledDepartCal) {
			departCal.click();
		}
		else {
			System.out.println("Depart Cal is not enable");
		}
		
		
		//Select Date
		String a = "//div[@class='calendar__single-month active']/div[3]/div[";
		int j = 1;
		String b = "]/a";

		String xpDate = a + j + b;
		String dateNeedToSelect = "26"; 
		
		for(j = 1; j<42; j++) {
			xpDate = a + j + b;
			
			try {
				String dateInCal = driver.findElement(By.xpath(xpDate)).getText();
				System.out.println(dateInCal);
				if(dateInCal.equals(dateNeedToSelect)) {
					driver.findElement(By.xpath(xpDate)).click();
					break;
				}
				
			}
			catch(Exception ex) {
				System.out.println("No date found for xpath = " + xpDate);
			}
		}
	}
}
