package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qsp {
public static void main (String [] args)
{
	String key="webdriver.chrome.driver";
	String value="./Introduction/chromedriver.exe";
System.setProperty(key,value);
WebDriver d= new ChromeDriver();
d.get("file:///C:/Users/HARSHA/Desktop/web.html");
System.out.println(d.getCurrentUrl());
System.out.println(d.getTitle());

}
}
