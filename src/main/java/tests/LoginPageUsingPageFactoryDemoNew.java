package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import LibraryFunctions.BrowserFactory;
import Pages.Login;
import Pages.LoginPageUsingPageFactory;

public class LoginPageUsingPageFactoryDemoNew {
  @Test
  public void test() throws Exception {
	  WebDriver driver=BrowserFactory.startBrowser("chrome", "http://10.232.237.143:443/TestMeApp");
	  LoginPageUsingPageFactory log=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
	  log.login("selenium", "selenium");
  }
}
