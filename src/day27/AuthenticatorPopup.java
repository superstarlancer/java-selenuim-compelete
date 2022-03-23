package day27;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatorPopup {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//Syntax: http://username:password@test.com this is how you bypass the pop-up authentication
		
		//Example: http://admin:admin@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
