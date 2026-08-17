package test.automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		//configuration of web driver
//		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\automation_testing\\driver_resources\\msedgedriver.exe");
		
		//browser launch / initialize the edge driver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://chatgpt.com/");		// to navigate another Web site
		
		  driver.get("https://www.fortunecloudindia.com/"); //launch web application
		    System.out.println("Title of fct is:" +driver.getTitle());
		    Thread.sleep(1000);
		    
		    driver.navigate().to("https://chatgpt.com/"); //to navigate another web page
		    System.out.println("Url of fct is:" +driver.getCurrentUrl());
		    Thread.sleep(1000); 
		    driver.navigate().back(); //used to navigate back
		    Thread.sleep(1000); 
		    driver.navigate().forward(); //used to navigate forward
		    Thread.sleep(1000);
//		    driver.close();
		
		
		//used to close the current browser window
//		driver.close();
		
		driver.quit();
		
		

	}

}
