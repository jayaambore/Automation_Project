package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_b {
	
	
	public static void HandleDropDown(WebElement element,String text) {
		Select Select=new Select(element);
		Select.selectByVisibleText(text);
	}

	public static void main(String[] args) throws InterruptedException {
		
		//OPEN BROWSER CODE
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//select[@name=\"country\"]"));
		HandleDropDown(drp,"INDIA");
		Thread.sleep(3000);
		
		HandleDropDown(drp,"BRAZIL");
		Thread.sleep(5000);
		
		driver.close();

	}
}

