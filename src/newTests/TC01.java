package newTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	@Test
	public void testCase01() {
		//Enter URL
		driver.get("http://www.naukri.com");
		
		//user is on correct page or not
		String expectedPageTitle = "Naukri.com1";
		
		String actualPageTitle = driver.getTitle();
		System.out.println("Page title is = " + actualPageTitle);
		
		
		/*
		 * if(actualPageTitle.contains(expectedPageTitle)) {
		 * System.out.println("Test is passed."); }
		 * 
		 * else { System.out.println("Test is Fail"); }
		 */
		 
		
		//Assertions - TestNG / JUnit
		Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
		System.out.println("Test is passed.");
	}
}
