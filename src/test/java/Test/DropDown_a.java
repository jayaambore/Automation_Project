package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_a {

	public static void main(String[] args) throws Exception {
		
		// Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement drp_Country=driver.findElement(By.xpath("//select[@name='country']"));
		  // create object of select class
		Select Sel=new Select(drp_Country);
		System.out.println(Sel.getFirstSelectedOption().getText());
		
		//Select by index
		Sel.selectByIndex(8);
		Thread.sleep(5000);
		
		//Select by Value
		Sel.selectByValue("RUSSIA");
		Thread.sleep(4000);
		
		//Select by Text
		Sel.selectByVisibleText("CHINA");
		Thread.sleep(3000);
		
		//Find list size
		List<WebElement> list=Sel.getOptions();
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
		
		String text=list.get(i).getText();
		System.out.println(text);
		if(text.equals("INDIA"))
		{
			Sel.selectByVisibleText("INDIA");
			break;
		}
		
		}
        driver.close();
	}
}