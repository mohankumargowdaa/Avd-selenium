package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/Sample2.html");
	WebElement wb= d.findElement(By.xpath("//input[@type='text']"));
	boolean b = wb.isDisplayed();
	System.out.println(b);
	d.quit();
	
	
	}

}
