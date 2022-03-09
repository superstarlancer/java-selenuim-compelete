package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2Assignment {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login 
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Admin-->Usermanagement-->users
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		
		//Find the rows in the table
		int rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		
		int count=0;
		for(int r=1;r<=rows;r++ ) 
		{
			String enabledUsers=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();//tell loop where and how to iterate
			if(enabledUsers.equals("'Enabled")) //if iterated variable equals enabled
			{
				count++; //count and save it into the count variable
			}
		}
		
		System.out.println("Total users:"+rows);
		System.out.println("Total users enabled:"+count);
		System.out.println("Total users disabled:"+(rows-count));
			
		driver.close();
		
	}

}
