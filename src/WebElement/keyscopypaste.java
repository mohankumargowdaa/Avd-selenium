package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class keyscopypaste {


	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/Sample2.html");
	WebElement wb= d.findElement(By.xpath("//input[@id='a']"));
	WebElement wb1= d.findElement(By.xpath("//input[@id='a1']"));
	wb.sendKeys(Keys.CONTROL+"a"+"c");
	Thread.sleep(2000);
	/*wb.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	wb1.sendKeys(Keys.CONTROL+"V");*/
	wb1.sendKeys(Keys.CONTROL+"aV");
	Thread.sleep(3000);
	//d.quit();
	
	
	
	}
}
