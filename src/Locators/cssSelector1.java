package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector1 {
	public static void main (String [] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.in/");
	Thread.sleep(2000);
	d.findElement(By.cssSelector("input[type='text']")).sendKeys("Motorola one power");
	Thread.sleep(1000);
	d.findElement(By.cssSelector("	input[type='submit']")).click();

	Thread.sleep(1000);
	d.findElement(By.cssSelector("img[alt='Motorola G9 Power (Electric Violet, 4GB RAM, 64GB Storage)']")).click();
	Thread.sleep(1000);
	ArrayList<String> tabs = new ArrayList<String>(d.getWindowHandles());
	 
	 
	 // Switch newly open Tab
	 d.switchTo().window(tabs.get(1));
	d.findElement(By.cssSelector("input[id='buy-now-button']")).click();
	Thread.sleep(1000);
	if (d.getPageSource().contains("Amazon Sign In"))
	{
		
		Thread.sleep(1000);	
		d.findElement(By.cssSelector("input[type='text']")).sendKeys("india.mohankumar@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("input[id='continue']")).click();
		Thread.sleep(1000);
		
	}
	}

}
