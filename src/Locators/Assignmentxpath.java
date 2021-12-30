package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.youtube.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("en hudugiro idyaking");
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@title='En Hudgiro Idyakingaadthiro Lyrical Video Song I Ranadheera Video Songs I Ravichandran, Kushboo']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//YT-ICON[@class='style-scope ytd-toggle-button-renderer'])[3]")).click();
		
		
		
		

}

}
