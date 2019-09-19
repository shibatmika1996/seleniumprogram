package testNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Javascriptexecutor {
  @Test
  public void f() {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  String stitle=js.executeScript("return document.title;").toString();
	  
	  System.out.println(stitle); 
	  
	  WebElement luckyicon=driver.findElement(By.linkText("Gmail"));
	  
	  JavascriptExecutor js1=(JavascriptExecutor)driver;
	  js1.executeScript("arguments[0].click();",luckyicon);
	  
	  JavascriptExecutor js2=(JavascriptExecutor)driver;
	  js2.executeScript("alert('hello world');", driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")));
  }
}
