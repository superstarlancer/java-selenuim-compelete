package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithoutSelect {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//1)capture all the options and print them
		
		List<WebElement> alloptions=driver.findElements(By.xpath("//select[@id='input-country']/option")); //we use select tag with the option child element
		
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
		
		//2)finding Number of Options
		System.out.println("total number of options:"+alloptions.size());
		
		//3)selecting option from dropdown
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Egypt"))
			{
				option.click();
				break;
			}
		}

	}

}
