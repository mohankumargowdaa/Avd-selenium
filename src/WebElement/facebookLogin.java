package WebElement;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("india.mohankumar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Gowda.moni1!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));
		Thread.sleep(3000);
		ele.sendKeys("puneet rajkumar");
		
		//driver.findElement(By.xpath("//input[@type='search']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		/*Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);*/
		
		//driver.close();
		
	}

}
