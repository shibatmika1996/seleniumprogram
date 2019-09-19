package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LibraryFunctions.BrowserFactory;
import Pages.Login;

public class logintestcase {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=BrowserFactory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp");
	  Login log=new Login(driver);
	  log.loginuser("selenium", "selenium");
  }
}
