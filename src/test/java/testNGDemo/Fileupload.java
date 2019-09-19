package testNGDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws AWTException {
		Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Documents\\chromedriver.exe" );
		  WebDriver driver;
		  driver=new ChromeDriver();
		// open page
		driver.get("file:///C://Users//A08019DIRP_C2C.02.02//Desktop//fileupload.html");
		driver.findElement(By.xpath("/html/body/input")).click();
		robot.setAutoDelay(1000);
		String path="C:\\Users\\A08019DIRP_C2C.02.02\\Desktop\\Demo.txt";
		StringSelection sel = new StringSelection(path);
		// Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
	}


}
