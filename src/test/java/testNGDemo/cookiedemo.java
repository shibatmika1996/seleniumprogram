package testNGDemo;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookiedemo {
	
	public static void main(String[] args) {
		WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
		  driver=new ChromeDriver();
		  
        driver.get("http://www.google.com/");
        Cookie name = new Cookie("mycookie", "123456789123");
        driver.manage().addCookie(name);
        Cookie name1 = new Cookie("mycookie1", "123456789222");
        driver.manage().addCookie(name1);
        
        //delete all cookies by below code
      //  driver.manage().deleteAllCookies();
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies );
     }

  }
}