package test.automation_testing;
import java.io.*;
import java.util.Properties;
import org.testng.annotations.*;
import org.openqa.selenium.edge.EdgeDriver;

public class TestNG_fileHandling {
	
	@Test
	void fileTest() throws IOException {
		FileReader fReader = new FileReader("C:\\Users\\Asus\\git\\Automation-Testing-Scripts\\automation_testing\\src\\test\\java\\test\\automation_testing\\base_property");
		Properties pr = new Properties();
		pr.load(fReader);
		
		EdgeDriver driver = new EdgeDriver();
		driver.get(pr.getProperty("orangeHRM"));
		driver.quit();
		fReader.close();
	}
	
}
