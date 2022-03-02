package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register"); // open URL on the browser
		driver.manage().window().maximize();
		
		
		//isDisplayed isEnabled
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status:\s"+searchbox.isDisplayed());
		System.out.println("Enabled status:\s"+searchbox.isEnabled());
		
		
		//isSelected
		
		/*WebElement male_rb=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rb=driver.findElement(By.xpath("//input[@id='gender-female']"));
	
		
		//before selecting I want to print
		System.out.println(male_rb.isSelected()); //false, users have not selected
		System.out.println(female_rb.isSelected()); //false*/
		
		//isSelected()
		
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
				
		//before selection
		System.out.println("Before selecting........");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		//after selection
		male_rd.click();
		System.out.println("After selecting Male radio button........");
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
		
		female_rd.click();
		System.out.println("After selecting Female radio button........");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //true
		
	}

}
