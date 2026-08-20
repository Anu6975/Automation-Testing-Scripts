package DemoQA_PracticeForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PracticeForm_01 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void fillBasicDetails() throws InterruptedException {

        driver.findElement(By.id("firstName")).sendKeys("Srushti");
        driver.findElement(By.id("lastName")).sendKeys("Joshi");
        driver.findElement(By.id("userEmail")).sendKeys("ann@test.com");
        driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
        driver.findElement(By.id("dateOfBirthInput")).click();
        
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}