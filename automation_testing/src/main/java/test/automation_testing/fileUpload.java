package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
//		String pathString= "‪C:\\Users\\Asus\\Downloads\\GuviCertification.png";
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://practice.expandtesting.com/upload");
		
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\Asus\\Downloads\\GuviCertification.png");
		
		driver.findElement(By.id("fileSubmit")).click();

	}

}
