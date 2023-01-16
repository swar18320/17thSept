package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage login;//= new LoginPage();
	
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			
		}


	@Test(enabled=false)
	public void verifyTitleTest() throws Exception
	{
		String ExpeTitle="Swag Labs";
		String ActTitle=login.verifyTitle();
		Assert.assertEquals(ExpeTitle, ActTitle);
	}
	
	@Test(enabled=false)
	public void verifyCurrentUrlTest() 
	{
		String ExpUrl = "https://www.saucedemo.com";
		String ActUrl = login.VerifyCurrentUrl();
		Assert.assertEquals(ExpUrl,ActUrl);
	}
	
	@Test(enabled=false)
	public void  VerifyLoginLogoTest() 
	{
		boolean result = login.VerifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void VerifyBotLogoTest()
	{
		boolean result = login.VerifyBotLogo(); 
		Assert.assertEquals(result, false);
	}
	@Test
	public void LoginAppTest() throws Exception
	{
		String expRes="https://www.saucedemo.com/inventory.html";
		String ActRes=login.LoginApp();
		Assert.assertEquals(expRes, ActRes);
		Reporter.log("Credentials=" + ActRes);
	}
	@Test(enabled=false)
	public void  VerifyLabelOfInventryTest() throws Exception
	{
		String expRes="PRODUCTS";
		String ActRes=login.VerifyLabelOfInventry();
		Assert.assertEquals(expRes, ActRes);
		Reporter.log("Label of inventory=" + ActRes);
	
	}
	
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	

}
