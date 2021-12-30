package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("file:///E:/Mohan/Selenium/Sample5.html");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[1]/input[1]")).clear();
		Thread.sleep(1000);
		for(int i=0; i<4; i++)
		{
			String a = "//div/input";
		d.findElement(By.xpath(a)).sendKeys("Motorola one power");
		}

}

}
