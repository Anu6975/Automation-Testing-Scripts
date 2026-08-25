package Grouping_TestNG;

import org.testng.annotations.Test;

public class PriorityTesting {
	
	@Test  (groups="regressitontest")                   //without using priority it is run as a alphabet 
	void show()
	{
		System.out.println("show method runs");
	}
	@Test(groups="smoketest")
	void display()
	{
		System.out.println("display method runs");
	}
	
	@Test(groups="smoketest")
	void add()
	{
		System.out.println("add method runs");
	}

}