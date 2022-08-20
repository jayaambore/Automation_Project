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
import net.bytebuddy.utility.RandomString;

public class Screenshot_b {

	public static void main(String[] args) throws Exception {
		//Bowser open
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				
		//Find the element path& send value on facebook
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Jay@gmail.com");
		
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_pass.sendKeys("123456789");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		btn_login.click();	
		
		//Select a path for screenshot
String path="C:\\Users\\Hp\\eclipse-workspace\\Batch_12_Morning Project\\javaprogram\\Automation_Project\\Screenshot";

        //Use Random string method
        String jay=RandomString.make(3);
        
        //Now take a Screenshot
        TakesScreenshot ts=(TakesScreenshot)driver;
        File scr=ts.getScreenshotAs(OutputType.FILE);
        File destn=new File(path+"\\"+jay+".png");
        FileUtils.copyFile(scr, destn);
       
        //driver.close();
		
	}	
		
}	
		
	


