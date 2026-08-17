package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FB_invalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FB_invalid o  = new FB_invalid();
		o.invalidtest();
		
	}
	
	void invalidtest() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https.//secure.facebook.com/");
		
		//id
		driver.findElement(By.id("email")).sendKeys("anuja@gmail.com");
		
		//name
		driver.findElement(By.name("pass")).sendKeys("anuja0292");
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		
		//linkText
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//navigate to back
		driver.navigate().back();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//navigate to back
		driver.navigate().back();
		
		//classname
		//driver.findElement(By.className("_42ft_4jv0...........")).click();
		
		
		
		
	}

}
