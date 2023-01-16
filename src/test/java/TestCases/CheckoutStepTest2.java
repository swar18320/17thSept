package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutStep1;
import Pages.CheckoutStep2;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutStepTest2 extends TestBase {
	LoginPage login;
	InventoryPage invntory;
	CartPage cart;
	CheckoutStep1 check1;
	CheckoutStep2 check2;
	//CHECKOUT: OVERVIEW
	
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			LoginPage login = new LoginPage();
			InventoryPage invntory = new InventoryPage();
		login.LoginApp();
		invntory.addProduct();
			check1=new CheckoutStep1();
			cart =new CartPage();
			check2 = new CheckoutStep2();	
			
		}
	
	@Test
	public void VerifyCheckoutTwoTitleTest() throws Exception
	{
		String ExpTitle = "CHECKOUT: OVERVIEW";
		String ActTitle= check2.VerifyCheckoutTwoTitle();
		Assert.assertEquals(ExpTitle, ActTitle);
		Reporter.log(ActTitle);
	}
	
	@AfterMethod 
	public void CloseBrowser()
	{
		driver.close();
	}

	
}
