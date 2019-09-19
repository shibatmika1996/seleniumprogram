package testNGDemo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Prog2 {
  @Test
  public void test() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
	  
	  driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	  driver.manage().window().maximize();
	  
	  WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	  
	  Actions action=new Actions(driver);
	  action.dragAndDropBy(resize, 600, 200).build().perform();
  }
}
