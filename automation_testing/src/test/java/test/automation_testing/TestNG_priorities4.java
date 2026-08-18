package test.automation_testing;

import org.testng.annotations.*;

public class TestNG_priorities4 { 				//without priorities methods are executed according to the alphabet orders

	@Test						// When annotations have same priorities alphabets are checked of the methos name
	void show0() {
		System.out.println("Priorirty");
	}
	
	@Test(priority=3)
	void show2() {
		System.out.println("Priorirty -3");
	}
	
	@Test(priority = -3)
	void ashowNegative() {
		System.out.println(" No Priorirty 3");
	}
}
