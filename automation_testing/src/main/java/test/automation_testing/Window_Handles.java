package test.automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		Window_Handles w = new Window_Handles();
		w.launch();
		Thread.sleep(2000);
		w.tab();
		Thread.sleep(2000);
		w.window();
		Thread.sleep(2000);
		
	}
	
	void launch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://newme.asia");
		
	}
	
	void tab() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.savana.com");
	}
	
	void window() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.urbanic.com/");
	}
	
	void tearDown() {
		driver.close();
		driver.quit();
	}

}
