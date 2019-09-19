package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By signin=By.linkText("SignIn");
	By username=By.name("userName");
	By password=By.name("password");
	By login=By.name("Login");
	By signout=By.linkText("SignOut");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginuser(String un, String pass) throws InterruptedException
	{
		driver.findElement(signin).click();
		Thread.sleep(2000);
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		Thread.sleep(2000);
		driver.findElement(signout).click();
	}

}
