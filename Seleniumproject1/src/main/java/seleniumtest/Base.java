package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	public void InitializeBrowser()
	{
	    driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/"); //to launch url
		driver.manage().window().maximize(); // to maximize window
		
	}
	public void driverQuitandClose()
	{
		//driver.close(); //to close the parent window
		driver.quit();//to close all the assosciated windows
		
	}
	
	public static void main(String[] args) {
		
           Base base=new Base();
           base.InitializeBrowser();
           base.driverQuitandClose();
           
	}

}
