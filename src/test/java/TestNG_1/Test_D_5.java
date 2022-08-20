package TestNG_1;

import org.testng.annotations.Test;

public class Test_D_5 {

	@Test(priority=-1)
	public void testA() {
		System.out.println("testA");
	}
	@Test(priority=1)
	public void testC() {
		System.out.println("testC");
	}
	@Test(priority=0)
	public void testB() {
		System.out.println("testB");
	}
}
