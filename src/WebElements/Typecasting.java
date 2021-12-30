package WebElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecasting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Introduction/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Mohan/Selenium/Sample9.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='Uncle-Eggrice']"));
	
		Select sel=new Select(ele);
		List<WebElement> option = sel.getOptions();
		
		ArrayList<String> list=new ArrayList<String>();
			
		int count=option.size();
		//System.out.println(count);
		
		for (WebElement text : option) 
		{
			String alltext = text.getText();
			list.add(alltext);
		}
		TreeSet<String> set= new TreeSet<String>(list);
		
		System.out.println("Array List Data: ");
		for (String sortedtext : list)
		{

			System.out.print(sortedtext+" || ");
		}
		System.out.println("\n \nTress Set Data: ");
		
		Collections.sort(list, Collections.reverseOrder());
		
		
		for (String sortedtext : set)
		{
			System.out.print(sortedtext+" || ");
		}
		driver.close();
		
	}

}