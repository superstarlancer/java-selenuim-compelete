package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container")); //able to find multiple WebElements like the sliders within 1 common class
		System.out.println("Number of sliders:\s"+sliders.size());
		
		
		List<WebElement> links =driver.findElements(By.tagName("a")); //returns all links into a variables
		System.out.println("Total Links:\s"+links.size());
		
		
		
		//List<WebElements> totallinks=driver.findElements(By.tagName("img"));
		//System.out.println("Number of images:\s"+totallinks.size());
		
		
		int totallinks =driver.findElements(By.tagName("img")).size(); //we are specifying size in the stmt so have to include int if not we add List WebElements
		System.out.println("Number of images:\s"+totallinks);
	
		
	}

}
