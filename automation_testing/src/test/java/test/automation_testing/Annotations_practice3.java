//All Annotations
package test.automation_testing;

import org.testng.annotations.*;

public class Annotations_practice3 {
	
	@Test																//5
	void test() {
		System.out.println("Test");
	}
	
	@BeforeTest															//2
	void before() {
		System.out.println("Before Test");
	}
	
	@AfterTest															//8
	void after() {
		System.out.println("After Test");
	}
	
	@AfterSuite															//9
	void suite() {
		System.out.println("After Suite");
	}

	@BeforeSuite														//1
	void before_suite() {
		System.out.println("Before Suite");
	}
	
	@BeforeMethod														//4
	void before_method() {
		System.out.println("Before Method");
	}
	
	@AfterMethod														//6
	void after_method() {
		System.out.println("After Method");
	}
	
	@BeforeClass														//3
	void before_class() {
		System.out.println("Before Class");
	}
	
	@AfterClass															//7
	void after_class() {
		System.out.println("After class");
	}
}
