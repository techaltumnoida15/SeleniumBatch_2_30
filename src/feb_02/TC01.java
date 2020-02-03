package feb_02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	//@Test(retryAnalyzer = ReTryLogic.class)
	@Test
	public void testCase01() {
		driver.get("http://www.naukri.com");
		
		//driver.findElement(By.id("abc")).click();
		
		//Assert.assertTrue(false);
		
		Assert.assertTrue(4 > 8 );
	}
	
}


