//Test Scenario : Verify Title of Instagram is "Instagram User"  : Op : Title MAtches/ Title Mis-match

package test.automation_testing;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		if(driver.getTitle().equals("Instagram"))
			System.out.println("Title Matches");
		else			
			System.out.println("Title Mis-match");
		
		driver.close();
	}

}
