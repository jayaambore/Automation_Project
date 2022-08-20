package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excle_sheet_11 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
String path="C:\\Users\\Hp\\eclipse-workspace\\Batch_12_Morning Project\\javaprogram\\Automation_Project\\Testdata\\Exceel sheet.xlsx";	
		FileInputStream Fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(Fis);
		
	   String data_1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();//0,0-->Test
	     System.out.println(data_1);
	     
	   String data_2=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();//0,1
	     System.out.println(data_2);
	     
	   String data_3= wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
         System.out.println(data_3);
	   //Sending testdata from excel to webelement
	   
	   txt_email.sendKeys(data_1);
	   txt_pass.sendKeys(data_2);
		 
	}

}
