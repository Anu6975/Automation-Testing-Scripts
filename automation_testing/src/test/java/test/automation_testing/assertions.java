package test.automation_testing;

import org.testng.annotations.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assertions {
	
	@Test(priority=1)
	void hardassertions() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expected_title="orangeHRM";
		String actual_title=driver.getTitle();
		
		Assert.assertEquals(expected_title, actual_title);
		System.out.println("Automation Script Continues");
		driver.quit();
	}
	
	@Test(priority=2)
	void softAssertion() {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expected_title="orangeHRM";
		String actual_title=driver.getTitle();
		
		SoftAssert sAssert = new SoftAssert();
		
		sAssert.assertEquals(expected_title, actual_title);
		
		System.out.println("Soft Assertion Automation Script Continues");
		sAssert.assertAll();
		driver.quit();
	}

}
