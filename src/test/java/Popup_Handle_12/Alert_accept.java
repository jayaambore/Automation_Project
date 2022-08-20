package Popup_Handle_12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class Alert_accept {

	public static void main(String[] args) throws Exception {
		
		//TO browser open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//Identify element on webpage
		WebElement cus=driver.findElement(By.xpath("//input[@name='cusid']"));
		cus.sendKeys("12345");
		WebElement btn_sub=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_sub.click();
		
		//Driver navigate alert window
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText()); //do u want to delete this really customer
		alt.accept();        // click on ok
		
		Thread.sleep(4000);
		
		String txt=alt.getText();
		System.out.println(txt); //Customer successfully delete
		alt.accept();        //2nd alert window click on ok
		
		driver.close();
		
		
	}

}
