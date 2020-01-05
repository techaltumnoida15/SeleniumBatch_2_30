package newTests;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{

	@Test
	public void testCase02() {
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
	}
}
