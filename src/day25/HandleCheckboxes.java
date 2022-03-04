package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1)select specific
		//driver.findElement(By.id("monday")).click();
		
		//2)find out total number of check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		System.out.println("Number of checkboxes:\s"+checkboxes.size());
		
		//3)how to select all the check boxes
		for(int i=0;i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();  //gets a check box and clicks each
		}
		
		/*for(WebElement chkbox:checkboxes) //all check boxes are web elements not object or string or int
		{
			chkbox.click();			//the checkbox contains web elements is a type of list collection
		}*/
		
		//4)select last 2 check boxes
		//total number of check boxes 7 - 2 = 5 (starting index)
		/*for(int i=5;i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();
		}*/
		
		//5)select first 2 checkboxes
		//specify size, we only want 1 to so we specify the size
		/*for(int i=0;i<2;i++) 
		{
			checkboxes.get(i).click();
		}*/
		
		
		
	
		/*for(int i=0;i<checkboxes.size();i++) 
		{
			if(i<2) 
			{
				checkboxes.get(i).click();
			}
		}*/
		
		
		//6)clear or un check all the boxes
		
		Thread.sleep(5000);
		/*for(int i=0;i<checkboxes.size();i++) 
		{
			
			if(checkboxes.get(i).isSelected()) 
			{
				checkboxes.get(i).click();
			}
			
		}*/
		
		for(WebElement chkbox:checkboxes) //we use click() to select and de-select check boxes 
		{
			chkbox.click();     //3) is uncommented to this expression takes care of clicking them again 
		}
		
		
		
	}

}
