package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement wb = d.findElement(By.xpath("//a[.='తెలుగు']"));
	Thread.sleep(3000);
	String title = wb.getAttribute("title");
	System.out.println(title);
	Thread.sleep(3000);
	d.quit();
	
	
	
	}



}
