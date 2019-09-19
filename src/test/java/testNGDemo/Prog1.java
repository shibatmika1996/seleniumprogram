package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Prog1 {
	WebDriver driver;
	String expectedResult="";
	
  @Test
  public void f() {
	  
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("q")).sendKeys("Salesforce");
	  driver.findElement(By.name("q")).submit();
	  expectedResult=driver.getTitle();
	  System.out.println(expectedResult);
//	  Assert.assertEquals(expectedResult, driver.getTitle());
  }
 
  
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	  driver=new ChromeDriver();
  }
  
  @AfterClass
  public void afterclass()
  {
	 // driver.close();
  }

}
