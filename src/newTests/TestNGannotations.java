package newTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGannotations {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test(alwaysRun = true, priority = 2)
	public void testCase01() {
		System.out.println("Test 01");
	}
	
	
	  @Test (enabled = false, priority = 1)
	  public void testCase02() { 
		  System.out.println("Test 02"); 
	  }
	 
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
}
