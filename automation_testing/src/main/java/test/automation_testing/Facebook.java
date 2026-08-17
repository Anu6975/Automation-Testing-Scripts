//Verify the URL of FB Login Page
//verify fb login with invalid username and password

package test.automation_testing;

import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/") ;
			
		if(driver.getCurrentUrl().equals("www.facebook.com/"))
			System.out.println("Test Case PAssed");
		else
			System.out.println("Test Case Failed: URL Mis-Match");
	

		driver.quit();
	}

}
