package day33_DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FixedDepositCalculator {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String path="/Users/danielavazquez/SeleniumPractice/financecalculator.xlsx";
		
		//invoke classname.method(path,sheet name)
		int rows=XLUtils.getRowCount(path,"Sheet1"); //this method is in the XLUtils code
		
		for(int r=1;r<=rows;r++)//start at 1 because 0 = row header titles
		{
			//read data from excel
			//1st row data, passing as string because we are passing the excel data into web input boxes
			String princ=XLUtils.getCellData(path, "Sheet1", r, 0); //0 = column #
			String rateofinterest=XLUtils.getCellData(path, "Sheet1", r, 1); //1 = column #
			String per1=XLUtils.getCellData(path, "Sheet1", r, 2); //2 = column #
			String per2=XLUtils.getCellData(path, "Sheet1", r,3); //3 = column #
			String fre=XLUtils.getCellData(path, "Sheet1", r, 4); //4 = column #
			String exp_mvalue=XLUtils.getCellData(path, "Sheet1", r, 5); //5 = column #
			
			//passing above values from excel sheet into the application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click(); // calculate
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) //first turning into decimal format then comparing
			{
				System.out.println("test passed");
				XLUtils.setCellData(path,"Sheet1",r,7,"Passed"); //updating in the results column
				XLUtils.fillGreenColor(path,"Sheet1",r,7); //if test passed fill green color
			}
			else //if test failed
			{
				System.out.println("test failed");
				XLUtils.setCellData(path,"Sheet1",r,7,"Failed");
				XLUtils.fillRedColor(path,"Sheet1",r,7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click(); //after validating clicking clear button
		}

		driver.quit();

	}

}
