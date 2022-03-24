package day40_pageobjectmodel;


//if you want to run this file change the objects in the OrangeHRMTest.java file to 'LoginPage2'

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{

	//web driver instance variable
	WebDriver driver;

	
	//write one constructor
	//constructor invokes at time of object creation
	public LoginPage2(WebDriver driver) 
	{
		this.driver=driver; //because it represents the class
		PageFactory.initElements(driver,this); //PageFactory built in class *additional statement 
						//this driver ^ is applicable to the LoginPage2 class, so for all locators driver will be initialized 
	
	}
	
	
	//write Locators
	@FindBy(xpath="//div[@id='divLogo']//img") //points to multiple web elements
	List<WebElement> img_logo;
	
	//@FindBy(how=How.XPATH, using="//div[@id='divLogo']//img") //different way of creating locator another approach
	//List<WebElement> img_logo;
	
	
	
	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement btn_login;
	
	//write action steps or methods
		public boolean checkLogoPresence() 
		{
			boolean status=((WebElement) img_logo).isDisplayed();
			return status;
		}
		
		
		public void setUserName(String name) 
		{
			txt_username.sendKeys(name);
		}
		
		
		public void setPassword(String pwd) 
		{
			txt_password.sendKeys(pwd);
		}
		
		public void clickLogin() 
		{
			btn_login.click();
		}
	
}
