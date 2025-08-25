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
	By usernametext=By.xpath("//*[@id=\'user-name\']");
	By passwordtext=By.xpath("//*[@id=\'password\']");
	
	
	
	
	//Action methods
	public void checkAssetionheading()
	{
		
		if(driver.findElement(headertext).isDisplayed()==true)
		{
			System.out.println("This test passed");
			return;
		}
	}
	
	public void checkLoginfields()
	{
		String PlaceholderAct= driver.findElement(usernametext).getAttribute("placeholder");
		String PlaceholderExp= "Username";
		
		 String Placeholder1Act= driver.findElement(passwordtext).getAttribute("placeholder");
		    String Placeholder1Exp= "Password";
		
		if(PlaceholderAct.equals(PlaceholderExp))
		{
			System.out.println("3.Username placeholder assertion passed");
		} else
		{
			System.out.println("Test failed");
		}
		
		driver.findElement(usernametext).sendKeys("standard_user");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(Placeholder1Act.equals(Placeholder1Exp))
	    {
	    	System.out.println("3.1.Password placeholder assertion passed");
		} else
		{
			System.out.println("Test failed");
		}
		
		driver.findElement(passwordtext).sendKeys("secret_sauce");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
}