package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		
		//1)Scroll Down
		/*js.executeScript("window.scrollBy(0,3000)", ""); //method will scroll down page until reaches 300px
		long value=(Long)js.executeScript("return window.pageYOffset;"); //this is js syntax returns how many pixels we scrolled and convert it into long type (integer type) and store it in long variable
		System.out.println("Number of pixels moved"+value);*/
		
		
		//2)Scroll down page till element is visible
		/*WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		js.executeScript("arguments[0].scrollIntoView();",flag); //pass as second argument
		long value=(Long)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:\s"+value);*/
		
		
		//3)End of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		double valuevalue=(Double)js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:\s"+valuevalue);
		
		
		Thread.sleep(2000);
		//4)Go back to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//go to initial position the -document
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}
