package DemoQA_PracticeForm;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class practiceForm_02 extends BrowserSetup {

    @Test
    public void fillAdditionalDetails() throws InterruptedException {

//        driver.findElement(By.xpath("//input[@id='subjectsInput' and @class='subjects-auto-complete__input']")).sendKeys("Science");
//        Thread.sleep(1000);
        driver.findElement(By.id("hobbies-checkbox-2")).click();
//        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2' and @value='2']")).click();
        Thread.sleep(1000);
        
//        driver.findElement(By.id("uploadPicture")).sendKeys("‪C:\\Users\\Asus\\Downloads\\GithubProfilePic.png");
        
        driver.findElement(By.id("currentAddress")).sendKeys("Pune, Maharashtra");
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
        Thread.sleep(1000);
//        driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
//        Thread.sleep(1000);
        driver.findElement(By.id("submit")).click();
        
        Thread.sleep(1000);
    }
}