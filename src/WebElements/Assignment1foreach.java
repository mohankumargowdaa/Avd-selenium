package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1foreach {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///E:/Mohan/Selenium/Sample7.html");
		List<WebElement> wb = d.findElements(By.xpath("//input"));
		Thread.sleep(3000);
		int count = wb.size();
		
		for (WebElement a:wb)
		{
		 a.sendKeys("Hi");
		 Thread.sleep(1000);
		 }
		
		for (int i=count-1; i>=0; i--)
		{
		 wb.get(i).clear();
		 Thread.sleep(1000);
		 }
		
		
		}

}
