package com.myproject.poc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Login extends Launchquit

{

    @Test
    public void Heading() {
    	
    	// 2. Test Header of the page
    				WebElement Header= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
    			String  HeaderAct =  Header.getText();
    			String HeaderExp = "Swag Labs";
    			System.out.println(HeaderAct);
    			
    			if(HeaderAct.equals(HeaderExp))
    			{
    				System.out.println("2.Header text assertion passed");
    			} else
    			{
    				System.out.println("Test failed");
    			}
    			
    			if(Header.isDisplayed()==true)
    			{
    				System.out.println("2.1.Header text visible passed");
    				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    			} else
    			{
    				System.out.println("Test failed");
    			}
        
    }
    
    @Test
    public void Loginfields()
    {
    	//3. Login fields
    	try {
    			WebElement Username= driver.findElement(By.xpath("//*[@id=\'user-name\']"));
    			String PlaceholderAct= Username.getAttribute("placeholder");
    			String PlaceholderExp= "Username";
    			
    			
    			if(PlaceholderAct.equals(PlaceholderExp))
    			{
    				System.out.println("3.Username placeholder assertion passed");
    			} else
    			{
    				System.out.println("Test failed");
    			}
    			
    			Username.sendKeys("standard_user");
    			Thread.sleep(1000);
    			
    			WebElement Password= driver.findElement(By.xpath("//*[@id=\'password\']"));
    		    String Placeholder1Act= Password.getAttribute("placeholder");
    		    String Placeholder1Exp= "Password";
    		    
    		    if(Placeholder1Act.equals(Placeholder1Exp))
    		    {
    		    	System.out.println("3.1.Password placeholder assertion passed");
    			} else
    			{
    				System.out.println("Test failed");
    			}
    		    
    		    Password.sendKeys("secret_sauce");
    		    Thread.sleep(1000);
    		    
    		    //4.Login button click
    		    WebElement Loginbutton= driver.findElement(By.xpath("//*[@id=\'login-button\']"));
    		   String LoginTextAct= Loginbutton.getAttribute("value");
    		   String LoginTextExp= "Login";
    		   
    		   if(LoginTextAct.equals(LoginTextExp))
    		   {
    			   System.out.println("4.Login button assertion passed");
    			} else
    			{
    				System.out.println("Test failed");
    			}
    		    
    		   Loginbutton.click();
    		   Thread.sleep(1000);
    		   
    		 //Products 
			   //5.Products assertion
			   WebElement product=driver.findElement((By.xpath("//*[@id=\'header_container\']/div[2]/span")));
			   if(product.isDisplayed()==true)
			   {
				   System.out.println("5.Product heading assertion passed");
				} else
				{
					System.out.println("Test failed");
				} 
			   
			   //Image assertion
			   WebElement productimage=driver.findElement(By.xpath("//*[@id=\'item_5_img_link\']/img"));
			   Actions actions = new Actions(driver);
			   actions.moveToElement(productimage).perform();
			   
			   if(productimage.isDisplayed()==true)
			   {
				   System.out.println("5.1.Productimage assertion passed");
				} else
				{
					System.out.println("Test failed");
			   }
			   
			   WebElement productname= driver.findElement(By.xpath("//*[@id=\'item_5_title_link\']/div"));
			   if(productname.isDisplayed()==true)
			   {
				   System.out.println("5.2.Productname heading assertion passed");
				} else
				{
					System.out.println("Test failed");
				} 
			   
			   //Add to cart button
			   WebElement Addtocart=driver.findElement(By.xpath("//*[@id=\'add-to-cart-sauce-labs-fleece-jacket\']"));
			   Actions actions1 = new Actions(driver);
			   actions1.moveToElement(Addtocart).perform();
			   if(Addtocart.isDisplayed()==true)
			   {
				   System.out.println("5.3.Add to cart button assertion passed");
				} else
				{
					System.out.println("Test failed"); 
			   }
			   
			   Addtocart.click();
			   Thread.sleep(1000);
			   
			   //6.Cart
			   WebElement carticon=driver.findElement(By.xpath("//*[@id=\'shopping_cart_container\']/a"));
			   Actions actions2 = new Actions(driver);
			   actions2.moveToElement(carticon).perform();
			   if(carticon.isDisplayed()==true)
			   {
				   System.out.println("6.1.cart button assertion passed");
				   carticon.click();
			   }else
				{
					System.out.println("Test failed"); 
			   }
			   
			   //7.Your cart
		     WebElement yourcart=driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/span"));
		     if(yourcart.isDisplayed()==true)
		     {
		    	 System.out.println("7.1.your cart heading asserion passed");
				} else
				{
					System.out.println("Test failed"); 
		     }
		     
		     WebElement productname1=driver.findElement(By.xpath("//*[@id=\'item_5_title_link\']/div"));
		     if(productname1.isDisplayed()==true)
			   {
				   System.out.println("7.2.Product added to cart visible in cart");
				   
				} else
				{
					System.out.println("Test failed");
				} 
		     Thread.sleep(1000);
		     
		     //8.Checkout
		     WebElement checkoutbtn= driver.findElement(By.xpath("//*[@id=\'checkout\']"));
		     if(checkoutbtn.isDisplayed()==true)
			   {
				   System.out.println("8.1.checkout button assertion passed");
				   checkoutbtn.click();
			   }else
				{
					System.out.println("Test failed"); 
			   }
		     
		     WebElement checkoutheading= driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/span"));
	        
		     if(checkoutheading.isDisplayed()==true)
			   {
				   System.out.println("8.2.checkout heading assertion passed");
				   
			   }else
				{
					System.out.println("Test failed"); 
			   }
		     
		     WebElement firstname= driver.findElement(By.xpath("//*[@id=\'first-name\']"));
		     String nameAct= firstname.getAttribute("placeholder");
		     String nameExp= "First Name";
		     if(nameAct.equals(nameExp))
		     {
		    	 System.out.println("8.3.first name placeholder assertion passed");
		     }else
				{
					System.out.println("Test failed"); 
			   }
		     
		     firstname.sendKeys("Test");
		     
		     WebElement lastname= driver.findElement(By.xpath("//*[@id=\'last-name\']"));
		     String lastnameAct= lastname.getAttribute("placeholder");
		     String lastnameExp= "Last Name";
		     if(lastnameAct.equals(lastnameExp))
		     {
		    	 System.out.println("8.4.last name placeholder assertion passed");
		     }else
				{
					System.out.println("Test failed"); 
			   }
		     
		     lastname.sendKeys("Test");
		     
		     WebElement zipcode= driver.findElement(By.xpath("//*[@id=\'postal-code\']"));
		     zipcode.sendKeys("585111");
		     
		     WebElement continuebtn= driver.findElement(By.xpath("//*[@id=\'continue\']"));
		     continuebtn.click();
		     
		     WebElement Finishbtn= driver.findElement(By.xpath("//*[@id=\'finish\']"));
		     Actions actions3 = new Actions(driver);
			   actions3.moveToElement(Finishbtn).perform();
			   
			   Finishbtn.click();
			   Thread.sleep(1000);
			   
			   WebElement backhomebtn= driver.findElement(By.xpath("//*[@id=\'back-to-products\']"));
			   backhomebtn.click();
			   Thread.sleep(1000);
    		   
    		   
    	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
    
}