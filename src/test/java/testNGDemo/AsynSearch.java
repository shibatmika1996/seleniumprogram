package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AsynSearch {
  @Test
  public void test() {
	  
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  
	  WebElement search=driver.findElement(By.id("myInput"));
	  
	  search.sendKeys("b");
		search.sendKeys("a");
		search.sendKeys("g");
	  Actions act=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  
	  String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
	  Assert.assertTrue(text.contains("Hand Bag"));
	  System.out.println(text);
	  
  }
}
