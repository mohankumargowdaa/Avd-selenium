package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentxpath3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://in.mail.yahoo.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[@alt='Sign in']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("testerat01@yahoo.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("9035569475G");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[.='Compose']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@role='combobox' and @ id='message-to-field' ]")).sendKeys("shnehal888@yahoo.com");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("hi");
		Thread.sleep(1000);		
		d.findElement(By.xpath("//div[@role='textbox']")).sendKeys("hiii");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//img[@class='_yb_155qc']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		Thread.sleep(4000);
		//new login
		d.findElement(By.xpath("//div[@title='Sign In']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[contains(.,'Use another')]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("shnehal888@yahoo.com");
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("Quest@123");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@title='Mail']")).click();
		Thread.sleep(5000);
		
		
		
}
}

//testerat01@yahoo.com
//9035569475G


	
	
	//shnehal888@yahoo.com
	//Quest@123