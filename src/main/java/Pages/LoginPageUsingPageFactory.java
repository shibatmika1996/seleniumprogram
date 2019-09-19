package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageUsingPageFactory {
WebDriver driver;
	
	public LoginPageUsingPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT, using="SignIn")
	WebElement signin;
	@CacheLookup
	@FindBy(how=How.NAME, using="userName")
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	WebElement password;
		
	@FindBy(how=How.NAME,using="Login")
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT, using="SignOut")
	WebElement signout;
		
	public void login(String un, String pass) throws Exception
	{
		signin.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		login.click();
		Thread.sleep(2000);
		signout.click();
		
	}
	
	

}
