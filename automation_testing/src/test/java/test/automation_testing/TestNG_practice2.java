//Testing DemoQA Site's practice Form with TestNG

package test.automation_testing;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.*;

public class TestNG_practice2 {
	EdgeDriver driver;
	
	@Test
	void launch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	void registration() {
		driver.findElement(By.id("firstName")).sendKeys("Anuja");
	}

}
