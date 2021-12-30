package popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowser {
	
		public static void main (String [] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.naukri.com/");
		Thread.sleep(5000);
		Set<String> allwh = d.getWindowHandles();
		int count= allwh.size();
		System.out.println(count);
		for(String wh:allwh)
		{
			System.out.println(wh);
		}
		
		d.quit();

		}

}
