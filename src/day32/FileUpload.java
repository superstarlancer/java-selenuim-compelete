package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@class='No thanks']")).click(); //clicks no thanks button for pop-up
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		
		

		driver.findElement(By.xpath("(//input[@id='file-upload'])[2]")).sendKeys("/Users/danielavazquez/Documents/Web&JobDocs/CoverLetters/Daniela_Vazquez_CLetter 01-06.docx");

	}

}
