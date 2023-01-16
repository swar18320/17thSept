package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase{
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			
		}


	@Test(priority = -2,timeOut=6000,enabled =false)
	public void verifyTitleTest() throws Exception
	{
		String ExpeTitle="Swag Labs";
		String ActTitle=login.verifyTitle();
		Assert.assertEquals(ExpeTitle, ActTitle);
	}
	@Test(groups="Sanity")
	public void LoginAppTest() throws Exception
	{
		String expRes="https://www.saucedemo.com/inventory.htm";
		String ActRes=login.LoginApp();
		System.out.println("assertion start");
		Assert.assertEquals(expRes, ActRes,"yes ye");
		System.out.println("assertion end");
		Reporter.log("Credentials=" + ActRes);
	} 
	@Test(enabled=false)
	public void VerifyBotLogoTest()
	{
		boolean result = login.VerifyBotLogo(); 
		Assert.assertEquals(result, false);
		Assert.assertFalse(true);
	}

	@AfterMethod(alwaysRun=true)
	public void CloseBrowser()
	{
		driver.close();
	}
	
	

}
