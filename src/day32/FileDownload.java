package day32;


import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) 
	{
		
		String location = System.getProperty("user.dir")+"/downloadedfiles";
		//String location = System.getProperty("/Users/danielavazquez/eclipse-workspace/SeleniumTraining/downloadedfiles");
		
		//Chrome Browser
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory",location);
				
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs",preferences);
				
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
	    WebDriver driver=new ChromeDriver(options);
		
	    
	    //Firefox browser
	  	/*FirefoxProfile profile=new FirefoxProfile();
	  	profile.setPreference("browser.download.folderList", 2);  //0- desktop 1-downloads 2-desired location
	  	profile.setPreference("browser.download.dir", location);
	  	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream"); // mime type
	  	profile.setPreference("pdfjs.disabled",true);
	  	profile.setPreference("browser.download.manager.showWhenStarting",false);
	  		
	  	FirefoxOptions options=new FirefoxOptions();
	  	options.setProfile(profile);
	  	    
	  	System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
	  	WebDriver driver=new FirefoxDriver(options); */
	  	    	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click(); // accept all
	    
	    driver.findElement(By.xpath("//div[@data-target='startingup']//a[@target='_blank'][normalize-space()='CSV']")).click();
		
	}

}
