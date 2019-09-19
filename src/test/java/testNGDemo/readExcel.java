package testNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class readExcel {
	 WebDriver driver;
	
  @Test
  public void dataRead() throws IOException, InterruptedException {
	  
	  File src=new File("C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\SelExcel\\excelprog1.xlsx");
	  
	  FileInputStream fis=new FileInputStream(src);
  
	  
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	 int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
	 

	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  
	
	
	 for (int i = 0; i < rowCount+1; i++) {
		 
	  driver.findElement(By.linkText("SignIn")).click(); 
	  
	 String username=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println(username);
	driver.findElement(By.name("userName")).clear();
	driver.findElement(By.name("userName")).sendKeys(username);
	
	 String pass=sheet1.getRow(i).getCell(1).getStringCellValue();
	System.out.println(pass);
	driver.findElement(By.name("password")).sendKeys(pass);
	
	Thread.sleep(2000);
	driver.findElement(By.name("Login")).click();
	
	Thread.sleep(2000);
	  FileOutputStream fo=new FileOutputStream(src);
	
	String title="Home";
	if(driver.getTitle().equalsIgnoreCase(title))
	{	
		sheet1.getRow(i).createCell(2).setCellValue("pass");
//		
		}
	else
	{
		sheet1.getRow(i).createCell(2).setCellValue("fail");
	}
	
	//System.out.println(title);
	//driver.navigate().back();
	wb.write(fo);
	 driver.findElement(By.linkText("SignOut")).click();
	 Thread.sleep(3000);
	 } 
	 
	 wb.close();
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
  }
//  
// @Test(priority=1)
// public void signIN()
// {
//	 
// }
}
