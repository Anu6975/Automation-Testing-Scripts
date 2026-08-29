package Listener;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(Listener_ITestListener.class)
public class LoginTestListener {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void Validlogin() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		String actualResult = driver.getCurrentUrl();
		String expectedResul = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualResult, expectedResul);
	}
	
	@Test
	public void Invalidlogin() {
		driver.findElement(By.id("user-name")).sendKeys("tandkkard_user");
		driver.findElement(By.id("password")).sendKeys("ecretkkk_sauce");
		
		driver.findElement(By.name("login-button")).click();
		String actualResult = driver.getCurrentUrl();
		String expectedResul = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualResult, expectedResul);
	}
	
	@Test(dependsOnMethods = "Invalidlogin")
	public void skipped() {
		driver.findElement(By.id("user-name")).sendKeys("tandkkard_user");
		driver.findElement(By.id("password")).sendKeys("ecretkkk_sauce");
		
		driver.findElement(By.name("login-button")).click();
		String actualResult = driver.getCurrentUrl();
		String expectedResul = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualResult, expectedResul);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
