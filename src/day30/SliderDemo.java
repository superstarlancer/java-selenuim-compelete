package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of minimum slider:\s"+min_slider.getLocation()); //(59,251)
		
		//Here we are moving the bar 100 units x axis
		act.dragAndDropBy(min_slider, 100, 0).perform();//pass element, x axis and y axis
		
		System.out.println("Location of minimum slider after moving:\s"+min_slider.getLocation());
		
		Thread.sleep(5000);
		
		
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Location of maximum slider:\s"+max_slider.getLocation()); //(638,251)
		act.dragAndDropBy(max_slider, -38, 0).perform();//pass element, x axis and y axis
		System.out.println("Location of maximum slider after moving:\s"+max_slider.getLocation());		
		
		Thread.sleep(5000); 		
		
		//sometimes coordinates are different due to screen resolution
		driver.quit();

	}

}
