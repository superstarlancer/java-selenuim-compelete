package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		//1)identify element and store in a variable
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
		
		
		//2)cannot directly access the dropdown so must create an object this way
		//have to get the variable created above and pass it through a Select object to create a 'select class object' drpcountry
		Select drpCountry= new Select(drpCountryEle);
		
		//3)select an option from drop down by using visible text
		//drpCountry.selectByVisibleText("Bhutan");
		
		//select by value, value is an attribute of the 'option' tag
		//drpCountry.selectByValue("223");
		
		//select by Index
		//drpCountry.selectByIndex(2); //renders Albania, index count starts from 0
		
		//4)print total number of options/countries available
		List<WebElement> alloptions=drpCountry.getOptions();
		System.out.println("Total Number of options:\s"+alloptions.size());
		
		
		//5)print all options/countries in the console
		//we already captures all the options into a variable 'alloptions' print them using a loop
		/*for(int i=0;i<alloptions.size();i++) 
		{
			System.out.println(alloptions.get(i).getText());   //we need to get the web element then get the text of it
		}*/
		
		for(WebElement option:alloptions) 
		{
			System.out.println(option.getText());
		}
		
		
		
	}

}
