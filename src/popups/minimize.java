package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class minimize {
	
	public static void main (String [] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.naukri.com/");
	Thread.sleep(5000);
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_N);
	}



}
