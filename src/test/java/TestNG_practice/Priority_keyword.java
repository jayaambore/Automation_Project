package TestNG_practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Priority_keyword extends Parent_class {

	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass'] ")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
		@Test
		public void Instagram() { 
		driver.get("//input[@name='username']");
		driver.findElement(By.xpath("//input[@name='password']"));
		
				
				}
}
