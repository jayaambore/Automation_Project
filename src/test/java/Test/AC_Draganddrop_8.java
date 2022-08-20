package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AC_Draganddrop_8 {

	public static void main(String[] args) {
		
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.guru99.com/test/drag_drop.html");
     driver.manage().window().maximize();
     
       //Create object on actions class
       Actions act=new Actions(driver);
     
      //1st dropdown handle
      WebElement btn_src1= driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
      WebElement destn1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
     
         act.dragAndDrop(btn_src1,destn1 ).build().perform();
     
      //2nd dropdown handle
      WebElement src2= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]")); 
      WebElement destn2= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    
         act.dragAndDrop(src2, destn2).build().perform();
    
     //3rd dropdown handle
     WebElement src3= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
     WebElement destn3= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
   
         act.dragAndDrop(src3, destn3).build().perform();
      
      //4th dragndrop handle
      WebElement src4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
      WebElement destn4= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
     
         act.dragAndDrop(src4, destn4).build().perform();
       
       driver.close();
       
	}
	
}
     
     
     
     
     
     
     
	


