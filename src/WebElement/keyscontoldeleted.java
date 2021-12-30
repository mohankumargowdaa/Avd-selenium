package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyscontoldeleted {


	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/Sample2.html");
	WebElement wb= d.findElement(By.xpath("//input[@id='a1']"));
	wb.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	wb.sendKeys(Keys.DELETE);
	Thread.sleep(3000);
	d.quit();
	
	
	
	}






}
