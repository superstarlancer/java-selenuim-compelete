package day27Assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//we need the id of our browser window first
		//driver.getWindowHandle();
		//System.out.println(driver.getWindowHandle());
		
		//CDwindow-BF7B4111561F836A573EEB157865C0B9
		//CDwindow-B93A7D8AECB0D718F711B807D2693A02

		//going to the wikipedia input search box and passing testing, then clicking submit
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		//we will select the whole list of search results
		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		//print the number of links that are available
		System.out.println("Number of links available:\s"+searchlinks.size());
		
		//here we use a for loop to get text of searchlinks and open all the tabs
		for(WebElement link:searchlinks) 
		{
			link.getText();
			link.click();
		}
		
		//after opening all webpages capture browser ids and print the titles of the window ids, pass the var to make it dynamic
		//driver.switchTo().window(windowid); will switch to a particular windowId but need to pass a specific in
		//in this case we pass the windowId variable that has the Id captured in each iteration and print it
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println("Titles of our opened pages:\s");
		for(String webid:windowIds) 
		{
			
			String title=driver.switchTo().window(webid).getTitle();
			System.out.println(title);
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
