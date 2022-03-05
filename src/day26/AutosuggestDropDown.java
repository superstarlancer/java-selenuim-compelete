package day26;

//implicit wait won't work here because the list of auto suggestions comes from the server
//it takes some time to render

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		
		//capture all the auto suggestion options into a variable
		List<WebElement> alloptions=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));

		//finding number of options
		System.out.println("Numbre of search options:"+alloptions.size());
		
		//print options
		/*for( WebElement option:alloptions) 
		{
			System.out.println(option.getText());
		}*/
		
		//select option from auto suggest drop down
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("selenium python")) 
			{
				option.click();
				break;
			}
		}
		
		
	}

}
