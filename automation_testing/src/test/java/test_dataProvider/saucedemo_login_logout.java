package test_dataProvider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class saucedemo_login_logout {
	
	WebDriver driver;
  
  @BeforeClass
	void launch() {
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
  @AfterMethod
	void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(1000);
	}
	
	@Test(dataProvider = "dp")
	void login(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	@AfterClass
	void close() {
		driver.close();
	}

  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
//      new Object[] { "locked_out_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "visual_user", "secret_sauce" }
    };   
  }
}
