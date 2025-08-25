package com.myproject.poc;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

public class Launchquit
{
	public static WebDriver driver= null;
	
	@BeforeMethod
	@Parameters("browser")
	public void Launch(String browsername)
	{
		System.out.println("Runs before every test method");
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\git\\POCweb\\poc\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver(); 
			driver.get("https://www.saucedemo.com/");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		else if(browsername.equals("Firefox"))
		{
			try {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\git\\POCweb\\poc\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			} catch (Exception e) {
			    e.printStackTrace();
			}
		}
		
		
	}
	
	
	@AfterMethod
	public void quit()
	{
		System.out.println("Runs after every test method");
		driver.quit();
	}
		
}