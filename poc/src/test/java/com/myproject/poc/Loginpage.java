package com.myproject.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage
{
	WebDriver driver;
	
	//constructor
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;	
		}
	
	//Locator
	By headertext=By.xpath("//*[@id=\"root\"]/div/div[1]");
	
	//Action methods
	public void checkAssetionheading()
	{
		
		if(driver.findElement(headertext).isDisplayed()==true)
		{
			System.out.println("This test passed");
			return;
		}
	}
}