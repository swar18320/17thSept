package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class grouping extends TestBase {
	
	LoginPage login;
	
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			
		}


	@Test(groups= {"sanity","smoke"})
	public void verifyTitleTest() throws Exception
	{
		String ExpeTitle="Swag Labs";
		String ActTitle=login.verifyTitle();
		Assert.assertEquals(ExpeTitle, ActTitle);
	}
	
	@Test(groups= "sanity")
	public void verifyCurrentUrlTest() 
	{
		String ExpUrl = "https://www.saucedemo.com/";
		String ActUrl = login.VerifyCurrentUrl();
		Assert.assertEquals(ExpUrl,ActUrl);
	}
	
	@Test(groups= {"sanity","smoke"})
	public void  VerifyLoginLogoTest() 
	{
		boolean result = login.VerifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	@Test(groups= "sanity")
	public void VerifyBotLogoTest()
	{
		boolean result = login.VerifyBotLogo(); 
		Assert.assertEquals(result, true);
	}
	@Test(groups= "sanity")
	public void LoginAppTest() throws Exception
	{
		String expRes="https://www.saucedemo.com/inventory.html";
		String ActRes=login.LoginApp();
		Assert.assertEquals(expRes, ActRes);
		Reporter.log("Credentials=" + ActRes);
	}
	@Test(groups= {"sanity",})
	public void  VerifyLabelOfInventryTest() throws Exception
	{
		String expRes="PRODUCT";
		String ActRes=login.VerifyLabelOfInventry();
		Assert.assertEquals(expRes, ActRes);
		Reporter.log("Label of inventory=" + ActRes);
	
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void CloseBrowser()
	{
		driver.close();
	}
	

}
