package Popup_Handle_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_cancle {

	public static void main(String[] args) throws Exception {
		
		//to browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Identify xpath element on webpage
		WebElement cus=driver.findElement(By.xpath("//input[@name='cusid']"));
		cus.sendKeys("12345");
		WebElement btn_sub=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_sub.click();
		
		//driver nevigate to alert window
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText()); //do you really want to delete this custmor?
		Thread.sleep(3000);
		alt.dismiss();  // click on cancel
		
		driver.close();
		
		
		
		
		
		
	}

}
