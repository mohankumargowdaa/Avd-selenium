package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click4 {

	public static void main (String [] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/Sample1.html");
	Thread.sleep(3000);
	d.findElement(By.linkText("Amazon")).click();
	

	}
	
}