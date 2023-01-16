package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CartPageTest extends TestBase{
	LoginPage login;
	InventoryPage invntory;
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			invntory= new InventoryPage();
			login.LoginApp();
			invntory.addProduct();
			cart =new CartPage();
			
			
		}	
	
	
	@Test
	public void VerifyCartpageUrlTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/cart.html";
		String acturl = cart.VerifyCartpageUrl();
		Assert.assertEquals(expUrl, acturl);
		
		 
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	

}
