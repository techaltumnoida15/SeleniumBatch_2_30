package newTests;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	@Test
	public void testCase01() {
		//Enter URL
		driver.get("http://www.naukri.com");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page title is = " + pageTitle);
		
	}
}
