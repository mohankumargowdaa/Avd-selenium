package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {


	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	WebElement wb = d.findElement(By.xpath("//button[@name='login']"));
	Thread.sleep(3000);
	String text = wb.getText();
	System.out.println(text);
	Thread.sleep(3000);
	d.quit();
	
	
	
	}




}
