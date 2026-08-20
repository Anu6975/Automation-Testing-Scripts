package DemoQA_PracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class practiceForm_02 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void fillAdditionalDetails() throws InterruptedException {

        driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
//        driver.findElement(By.id("hobbies-checkbox-2")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("‪C:\\Users\\Asus\\Downloads\\GithubProfilePic.png");
//        driver.findElement(By.id("currentAddress")).sendKeys("Pune, Maharashtra");
//        driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
//        driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
        driver.findElement(By.id("submit")).click();
        
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}