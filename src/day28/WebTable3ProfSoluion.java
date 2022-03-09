package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3ProfSoluion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
				
		//Admin-->Usermanagement-->users
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
				
		//Table
		int rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
				
			int count=0;
			for(int r=1;r<=rows;r++)
			{
				String status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
				if(status.equals("'Enabled"))
				{
					count++;
				}
					
			}
				
			System.out.println("Total users:"+rows);
			System.out.println("Total users enabled:"+count);
			System.out.println("Total users disabled:"+(rows-count));
				
			driver.close();

	}

}
