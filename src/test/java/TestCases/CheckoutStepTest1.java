package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutStep1;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutStepTest1 extends TestBase {
	
	LoginPage login;
	InventoryPage invntory;
	CartPage cart;
	CheckoutStep1 check1;
	
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			invntory= new InventoryPage();
			login.LoginApp();
			invntory.addProduct();
			check1=new CheckoutStep1();
			cart =new CartPage();
			
			
			
		}
	
	@Test(enabled = false)
	public void VerifCheckoutStep1UrlTest() throws Exception 
	
	{
		
		String expectedUrl = "https://www.saucedemo.com/checkout-step-one.html";
		String ActualUrl = check1.VerifCheckoutStep1Url();
		Assert.assertEquals(expectedUrl, ActualUrl);
	}
	@Test(enabled=false)
	public void EnteredInformationTest() throws Exception
	{
		check1.EnteredInformation();
	}
	
	@Test(enabled=true)
	public void  VerifyErrorMeassageTest() throws Exception
	{
		String ExpErrorMessage = "Error: First Name is required";
		String ActErrorMsg = check1.VerifyErrorMeassage();
		Assert.assertEquals(ExpErrorMessage, ActErrorMsg);
		Reporter.log("Errormessage:" + ActErrorMsg);
	}
	@Test
	public void VerifyCheckoutPageTitleTest()
	{
		String ExpTitle = "CHECKOUT: YOUR INFORMATION";
		String ActTitle = check1.VerifyCheckoutPageTitle();
		Assert.assertEquals(ExpTitle, ActTitle);
		Reporter.log(ActTitle);
	}
	
	
	@AfterMethod
	public void CloseBrowser() 
	{
		driver.close();
	}

}
