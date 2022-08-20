 package TestNG_2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_10_assert {
	//HardAssert
	
     @Test
     public void verify_test1() {
       System.out.println("test1");
       System.out.println("email enter");
       System.out.println("password");
       System.out.println("click on login");
       
       String Expected="Jayshree";
       String Actual="jayshree";
       
      Assert.assertEquals(Actual, Expected); //fail
      System.out.println("test done");
      
}
     @Test
     public void verify_test2() {
    	 System.out.println("test2");
    	 System.out.println("email enter");
    	 System.out.println("password");
    	 System.out.println("click on login button");
    	 
    	 String Expected="Jayshree";
    	 String Actual="Jayshree";
    	 
    	 Assert.assertEquals(Actual, Expected);  //pass
    	 System.out.println("test done");
    	 
    	 
    	 
    	 
    	 
    	 
     }
}