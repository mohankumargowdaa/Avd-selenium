package Introduction;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abc {
public static void main (String [] args)
{
	String key="webdriver.gecko.driver";
	String value="./Introduction/geckodriver.exe";
System.setProperty(key,value);
WebDriver d= new FirefoxDriver();
d.get("file:///C:/Users/HARSHA/Desktop/web.html");
System.out.println(d.getCurrentUrl());
System.out.println(d.getTitle());

}
}
