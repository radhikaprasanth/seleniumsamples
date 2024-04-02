package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public void locatorID()
	{
		//WebElemnt elementname=driver.findElement(By.locator("locator value"));
		WebElement entermessagefield=driver.findElement(By.id("single-input-field"));
		WebElement entermessagefield1=driver.findElement(By.id("value-a"));
		WebElement enterbutton=driver.findElement(By.id("button-two"));
		WebElement entervalue=driver.findElement(By.id("value-b"));
		WebElement listbox=driver.findElement(By.id("list0box"));
		
	}
	public void locatorClassName()
	{
		WebElement headertopname=driver.findElement(By.className("header-top"));
		WebElement clearfixfield=driver.findElement(By.className("clearfix"));
		WebElement navigatebar=driver.findElement(By.className("navbar-nav"));
		WebElement navigatebrand=driver.findElement(By.className("navbar-brand"));
		WebElement cardbody=driver.findElement(By.className("card-body"));
	}
	
	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.InitializeBrowser();
		locators.locatorID();
	}

}
