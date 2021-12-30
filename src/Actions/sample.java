package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class sample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");


		// Locate more element on the web page
		WebElement close = driver.findElement(By.xpath("//button[.='✕']"));
		close.click();
		WebElement ele1=driver.findElement(By.xpath("//div[.='Fashion']"));
		WebElement ele2=driver.findElement(By.xpath("//div[.='Home']"));
		WebElement ele3=driver.findElement(By.xpath("//div[.='Appliances']"));
		Actions act=new Actions(driver);
		act.contextClick(ele1).perform();

		Thread.sleep(5000);
		driver.close();
	}
}
