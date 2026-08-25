package DemoQA_PracticeForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BrowserSetup {
	static WebDriver driver;
	@BeforeSuite
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		}
	
	 @AfterSuite
	    public void close() {
	        driver.quit();
	    }

}
