package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Actiondemo2 {
  @Test
  public void test() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().window().maximize();
//	  WebElement allcategories=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
//	  WebElement electronics=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"));
//	  WebElement travelkit=driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
//
//	  
//	  Actions act=new Actions(driver);
//	  
//	  act.moveToElement(allcategories).build().perform();
//	  
//	  WebDriverWait wait=new WebDriverWait(driver, 50);
//	  wait.until(ExpectedConditions.elementToBeClickable(electronics));
//	  act.moveToElement(electronics).click().build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
//	  
//	  wait.until(ExpectedConditions.elementToBeClickable(travelkit));
//	 act.moveToElement(travelkit).click().build().perform();
	  

		WebElement aboutus=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
		WebElement ouroffice=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
		WebElement chennai=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"));
	
		Actions act=new Actions(driver);
		act.moveToElement(aboutus).click().build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		
		wait.until(ExpectedConditions.elementToBeClickable(ouroffice));
		act.moveToElement(ouroffice).click().build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(chennai));
		act.moveToElement(chennai).click().build().perform();
	  
  }
}
