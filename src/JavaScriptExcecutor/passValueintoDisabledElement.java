package JavaScriptExcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passValueintoDisabledElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Introduction/chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("file:///E:/Mohan/Selenium/Sample10.html");
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("document.getElementById('a1').value='ABC'");
}
}
