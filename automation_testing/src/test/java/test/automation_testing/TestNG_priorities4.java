package test.automation_testing;

import org.testng.annotations.*;

public class TestNG_priorities4 { 				//without priorities methods are executed according to the alphabet orders

	@Test(priority=-1)							// When annotations have same priorities alphabets are checked of the methos name
	void show0() {
		System.out.println("Priorirty 1");
	}
	
	@Test(priority=0)
	void show2() {
		System.out.println("Priorirty 0");
	}
	
	@Test
	void ashowNegative() {
		System.out.println(" No Priorirty 1");
	}
}
