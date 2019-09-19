package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actiondemo3 {
  @Test
  public void test() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.linkText("SignIn")).click();
	  WebElement uname=driver.findElement(By.name("userName"));
	  
	  Actions act=new Actions(driver);
	  
	  act.moveToElement(uname).keyDown(uname, Keys.SHIFT).sendKeys(uname, "sumana")
	  .keyUp(uname, Keys.SHIFT).doubleClick().contextClick().build().perform();
	  }
}
