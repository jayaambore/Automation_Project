package TestNG_1;

import org.testng.annotations.Test;

public class Test_D_6 {

	@Test(invocationCount=3)
	public void testA() {
		System.out.println("testA");
	}
	@Test(enabled=false)
	public void testC() {
		System.out.println("testC");
   }
	@Test
	public void testB() {
		System.out.println("testB");
   }
	
}