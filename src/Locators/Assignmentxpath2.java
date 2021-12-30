package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignmentxpath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://maps.google.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//img [@class='searchbox-directions-icon']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//input [@placeholder='Choose starting point, or click on the map...']")).sendKeys("Qspider Rajajinagar",Keys.ENTER);
		Thread.sleep(1000);
		d.findElement(By.xpath("//input [@placeholder='Choose destination, or click on the map...']")).sendKeys("mohankumar gowda, bhadravathi",Keys.ENTER);
		Thread.sleep(10000);		
		d.findElement(By.xpath("//span[contains(text(), 'Fastest route')]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[contains(text(), 'Fastest route')]")).click();
		Thread.sleep(1000);
		

}
}
