package TestNG_Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TutorialsPoint_PracticeForm {
	WebDriver driver;
	
	@BeforeClass
	public void Launch(){
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
		
	@BeforeMethod
	public void setup() throws InterruptedException {
		Thread.sleep(3000);
		//div[@class='accordion-item'])[1]
		driver.findElement(By.xpath("(//div[@class='accordion-item'])[1]")).click();
		
	}
		
	@Test(priority = 1)
	public void textBoxDemo() throws InterruptedException
	{
		
		//java wait 
		driver.findElement(By.xpath("(//ul[@id='navMenus']/li)[1]")).click();
			
		driver.findElement(By.id("fullname")).sendKeys("xyz");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		//address
		driver.findElement(By.id("address")).sendKeys("pune maharashtra");
		//password
		driver.findElement(By.id("password")).sendKeys("abc@123");
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
			
	@Test(priority = 2)
	public void checkBoxDemo() throws InterruptedException{
		driver.findElement(By.xpath("(//ul[@id='navMenus']/li)[2]")).click();
		driver.findElement(By.id("c_bs_1")).click();
		driver.findElement(By.id("c_bs_2")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void redioDemo() throws InterruptedException{
		driver.findElement(By.xpath("(//ul[@id='navMenus']/li)[3]")).click();	
		driver.findElement(By.name("tab")).click();
		Thread.sleep(2000);
	}
		
	@AfterClass
	public void close() {
		driver.quit();
	}
		

}
