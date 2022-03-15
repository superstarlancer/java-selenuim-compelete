package day34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator_DB {

	public static void main(String[] args) throws SQLException, InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
				
		//1)Establish connection to db
		//2)Create statement object
		//3)Query & Execute
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from caldata");
		
				
		while(rs.next())
		{
			//Read data from resultset.. resultset contains the data
			
			//capture all data from the table
			int pric=rs.getInt("principle");
			int rateOfIntrest=rs.getInt("rateOfIntrest");
			int per1=rs.getInt("per1");
			String per2=rs.getString("per2");
			String fre=rs.getString("frequency");
			double exp_mvalue=rs.getInt("maturityvalue");
			
					
			//passing above values to the application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(pric));
			
			//Use String.valueOf to convert integer data into string 
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateOfIntrest));
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per1));
			
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click(); // calculate
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(exp_mvalue==Double.parseDouble(act_mvalue))
			{
				System.out.println("test passed");
				
			}
			else
			{
				System.out.println("test failed");
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}

		driver.quit();

	}

}
