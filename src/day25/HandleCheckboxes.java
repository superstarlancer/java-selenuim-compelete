package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1)select specific
		//driver.findElement(By.id("monday")).click();
		
		//2)find out total number of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println("Number of checkboxes:\s"+checkboxes.size());
		
	}

}
