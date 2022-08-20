package TestNG_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	 WebDriver  driver;
	 @BeforeMethod
	 public void Setup() {
		 
		  //Browser open
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	 }
	 @AfterMethod
	 public void tearDown() {
		 //Browser close
		 driver.close();
	
}
}
