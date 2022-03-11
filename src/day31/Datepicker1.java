package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/11/2023"); //xpath of input box MM/DD/YYYY
		
		
		//using logic
		//need to declare three variables year month date
		//will have it check month and year and if not click the next button and match our variables below
		//we don't know how many times we are going to press the arrow to get to our correct date so we use while loop
		String year="2022";
		String month="September";
		String date="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		//Month & Year Logic
		while (true) 
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //returns month
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //returns year
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;     //if mon and yr equal our variables month & year then break
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //arrow next button right
			
		
		}
		
		//Date
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates) 
		{
			String dt=ele.getText(); //we get all text values that iterate and store in a dt variable that we will use to compare below
			if(dt.equals(date)) 
			{
				ele.click();
				break;
			}
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
