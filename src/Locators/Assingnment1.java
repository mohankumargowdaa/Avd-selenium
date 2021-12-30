package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingnment1 {
	public static void main (String [] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("file:///E:/Mohan/Selenium/Sample3.html");
	Thread.sleep(3000);
	d.findElement(By.name("n1")).sendKeys("MOHAN");
	Thread.sleep(1000);
	d.findElement(By.name("n2")).clear();
	Thread.sleep(1000);
	d.findElement(By.name("n3")).click();
	}
}
