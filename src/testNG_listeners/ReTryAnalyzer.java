package testNG_listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer{

	int reTryCount = 0;
	int maxReTry = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(reTryCount < maxReTry) {
			reTryCount++;
			return true;
		}
		else {
			return false;
		}
	}

}
