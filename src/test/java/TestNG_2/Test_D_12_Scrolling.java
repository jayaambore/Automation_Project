 package TestNG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_D_12_Scrolling {

	@Test
	public void verifytest_001() throws Exception {
		//Browser open
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 
	 JavascriptExecutor js=(JavascriptExecutor ) driver;
	 
	 //Scroll by pixel
	 js.executeScript("window.scrollBy(0,500)", "");
	 Thread.sleep(5000);
	 js.executeScript("window.scrollBy(0,-500)", "");
	 
	  Thread.sleep(5000);
	 //Scroll by element
	 WebElement english=driver.findElement(By.xpath("(//li[text()='English (UK)'])"));
	 js.executeScript("argument[0].scrollIntoView()", english);
	 
	
	 
	 
		
		
		
	}
}
