package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(); // opens the alert window
		Thread.sleep(5000);
		
		//alert() method switches on the alert windown and then returns it as an object with a type --> 'Alert'
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText()); // capturing text from alert window
		alertwindow.sendKeys("welcome"); // passed value in input box inside alert window
		
		alertwindow.accept(); // close alert window by using OK button
		
		//alertwindow.dismiss(); // close alert window using Cancel button
 
	} 

}
