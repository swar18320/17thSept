package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckoutCompletePage;
import Pages.CheckoutStep1;
import Pages.CheckoutStep2;
import Pages.InventoryPage;
import Pages.LoginPage;

public class CheckoutCompletePageTest extends TestBase {
	LoginPage login;
	InventoryPage invntory;
	CartPage cart;
	CheckoutStep1 check1;
	CheckoutStep2 check2;
	CheckoutCompletePage ist;
	//CHECKOUT: OVERVIEW
	
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			LoginPage login = new LoginPage();
			InventoryPage invntory = new InventoryPage();
			ist=new CheckoutCompletePage();
		login.LoginApp();
		invntory.addProduct();
			check1=new CheckoutStep1();
			cart =new CartPage();
			check2 = new CheckoutStep2();	
		}
	@Test(enabled=false)
	public void VerifyChekoutCompleteTitleTest() throws Exception
	{
		 String ExpTitle="CHECKOUT: COMPLETE!";
		 String ActTitle=ist.VerifyChekoutCompleteTitle();
		 Assert.assertEquals(ExpTitle, ActTitle);
	}
	

@Test(enabled=false)
public void VerifyChekoutCompleteUrlTest() throws Exception
{
	 String ExpUrl="https://www.saucedemo.com/checkout-complete.html";
	 String ActUrl=ist.VerifyChekoutCompleteUrl();
	 Assert.assertEquals(ExpUrl, ActUrl);
}

@Test
public void VerifyPonyExpressImgDisplayedTest() throws Exception
{
	boolean ExpRes= ist.VerifyPonyExpressImgDisplayed();
	Assert.assertEquals(ExpRes, true);
}
@Test
public void  VerifytfyTitleTest() throws Exception
{
	String ExpTi = "THANK YOU FOR YOUR ORDER";
	String ActTi = ist.VerifytfyTitle();
	Assert.assertEquals(ExpTi, ActTi);
}
	
	
	
	
	@AfterMethod 
	public void CloseBrowser()
	{
		driver.close();
	}

}
