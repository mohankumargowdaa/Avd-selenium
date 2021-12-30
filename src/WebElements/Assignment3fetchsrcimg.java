package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3fetchsrcimg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.amazon.in/");
		List<WebElement> wb = d.findElements(By.xpath("//img"));
		Thread.sleep(1000);
	
		
		for (WebElement a:wb)
		{
		 System.out.println(a.getAttribute("src"));
		 Thread.sleep(1000);
		 }
		
		
		
		
		}

}
