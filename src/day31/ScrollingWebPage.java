package day31;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		//ChromeDriver driver=new ChromeDriver();
	
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		//1)Scroll Down
		js.executeScript("window.scrollBy(0,3000)", ""); //method will scroll down page until reaches 300px
		
		

	}

}
