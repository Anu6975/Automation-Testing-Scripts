package Grouping_TestNG;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups="smoketest")
	void first()
	{
		System.out.println("run first test case");
	}
	
	@Test(groups="smoketest")
	void second()
	{
		System.out.println(" run second  test case");
	}
	
	@Test(groups="smoketest")
	void thired()
	{
		System.out.println(" run thired test case");
	}

}