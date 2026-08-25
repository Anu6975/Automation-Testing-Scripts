package DemoQA_PracticeForm;

import org.openqa.selenium.*;
import org.testng.annotations.*;
public class PracticeForm_01 extends BrowserSetup {
//    WebDriver driver;

    @Test
    public void fillBasicDetails() throws InterruptedException {

        driver.findElement(By.id("firstName")).sendKeys("Srushti");
        Thread.sleep(1000);
        driver.findElement(By.id("lastName")).sendKeys("Joshi");
        Thread.sleep(1000);
        driver.findElement(By.id("userEmail")).sendKeys("ann@test.com");
        Thread.sleep(1000);
        
        //Radio button using cssSelector
        driver.findElement(By.cssSelector("#gender-radio-2")).click();
        
        /* Radio Button using XPath
        driver.findElement(By.xpath("//input[@id='gender-radio-2' and @value = 'Female']")).click();*/
        
        Thread.sleep(1000);
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
        Thread.sleep(1000);
        driver.findElement(By.id("dateOfBirthInput")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='2003']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='10']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("div[aria-label='Choose Tuesday, November 4th, 2003']")).click();
        Thread.sleep(1000);  
    }
}