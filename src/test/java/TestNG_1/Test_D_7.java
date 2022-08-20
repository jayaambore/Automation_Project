package TestNG_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_7 {

	@Test
	public void testA() {
		System.out.println("testA");
		Assert.assertTrue(false);  //TRUE=FALSE
	}
	@Test(dependsOnMethods="testA")
	public void testC() {
		System.out.println("testC");
	}
	
}
