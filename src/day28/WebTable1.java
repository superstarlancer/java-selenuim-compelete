package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)How to find rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//another approach if you have one table on your web page 
		//int rows=driver.findElements(By.tagName("tr")).size(); 
		System.out.println("Total Number of rows:\s"+rows);
		
		//2) How to find number of columns/headers in a table
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); 
		System.out.println("Number of Columns:"+cols);
		
		
		//3)Retrieve the specific row and column data 
		//String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		//System.out.println(value); //master in selenium
		
		//4)Retrieve all the data from the table, all rows and columns
		/*for(int r=2;r<=rows;r++) //1st one is header don't want to display it so start at 2
		{							//2 3 4 5 6 7
			for(int c=1;c<=cols;c++)  //1 2 3 4 
			{
				//pass row and column data dynamically
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"         "); //prints in tabular format
			}
			System.out.println(); //prints in tabular format
		}*/
		
		//5)Print book names whose Author is Amit
		//Read all data in first row and second column, iterate each row and capture value in column 2
		//if author equals Amit capture name of book, if not go to next row, if match capture book name
		
		int count=0;
		for(int r=2;r<=rows;r++) 
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Amit")) 
			{
				count++;
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				//System.out.println(bookname+"      "+author); //other bookS with author Amit
				System.out.println(bookname); //just the first book that matches Amit
			}
		}
		System.out.println("Number of times Amit appears in table:\s"+count);
		
		
		//6)Find sum of all cost of books
		//row is dynamic, column number is static
		
		int sum=0;
		for(int r=2;r<=rows;r++) 
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(price); //7100 sum is number, price is string, convert price into number
			
		}
		System.out.println("Total price of books:\s"+"$"+sum);
		
		
		driver.quit();
	}

}
