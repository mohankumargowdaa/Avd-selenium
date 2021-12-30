package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2fetchURL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.amazon.in/");
		List<WebElement> wb = d.findElements(By.xpath("//a"));
		Thread.sleep(1000);
	
		
		for (WebElement a:wb)
		{
		 System.out.println(a.getAttribute("href"));
		 Thread.sleep(1000);
		 }
		
		
		Actions a=new Actions(d);
	
		
		}


}
