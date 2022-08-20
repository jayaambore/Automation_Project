package Screenshot_10;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_capture_a {

	public static void main(String[] args) throws Exception {
		//Bowser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Find the element path& send value on facebook
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		
		txt_email.sendKeys("Test@gmail.com");
		txt_pass.sendKeys("12345678");
		btn_login.click();
		
		//Select a path for screenshot
String path="C:\\Users\\Hp\\eclipse-workspace\\Batch_12_Morning Project\\javaprogram\\Automation_Project\\Screenshot";
       
        // Now a take screenshot	
		TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\test.png");
		FileUtils.copyFile(src, destn);
		
		//driver.close();
	}

}
