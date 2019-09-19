package LibraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browsername, String url)
	{
		if(browsername.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
			  driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
