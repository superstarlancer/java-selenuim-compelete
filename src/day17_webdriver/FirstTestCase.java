package day17_webdriver;

/*1)Open Web Browser (Chrome,Firefox,Edge)
2)Open URL [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/) 
3)Enter username (Admin)
4)Enter password (admin123)
5)Click on login
6)Capture title of the home page (Actual Title)
7)Verify title of the page OrgangeHRM (Expected)
8)Close Browser*/

public class FirstTestCase {

	public static void main(String[] args)
	{
		//1)Open Web Browser (Chrome,Firefox,Edge)
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

	}

}
