package test.automation_testing.Practice;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

public class First_Script {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.savana.com");
//		driver.navigate().to("https://in.urbanic.com/");
//		driver.manage().window().maximize();

		System.out.println(driver.getTitle());		//displays current web name
		System.out.println(driver.getCurrentUrl());	//displays current url
		System.out.println(driver.getPageSource());
		
//		driver.navigate().back();
//		driver.navigate().forward();
		
//		driver.navigate().refresh();
		
	
		
		driver.quit();
		
	}

}
