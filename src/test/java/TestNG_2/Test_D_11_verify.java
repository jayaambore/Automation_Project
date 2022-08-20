package TestNG_2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_11_verify {

	@Test
	public void test_1() {
		System.out.println("test_1");
		System.out.println("Welcome");
		
		String Expected="Welcome";
		String Actual="welcome";
		
	    SoftAssert Soft=new SoftAssert();
		Soft.assertEquals(Actual,Expected);
		System.out.println("test done");
		
		Soft.assertAll();
		}
	@Test
	public void test_2() {
		System.out.println("test_2");
		System.out.println("Welcome");
		
		String Expected="Welcome";
		String Actual="Welcome";
		
		SoftAssert Soft=new SoftAssert();
		Soft.assertEquals(Actual,Expected);
		System.out.println("test done");
		
		Soft.assertAll();
			
	}
	
}

