package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysenter {



	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/web.html");
	WebElement wb = d.findElement(By.xpath("//a[.='Google']"));
	wb.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	d.quit();
	
	
	
	}


}
