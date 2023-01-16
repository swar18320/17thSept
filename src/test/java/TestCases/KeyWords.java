package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class KeyWords extends TestBase {
	
LoginPage login;//= new LoginPage();
	
	@BeforeMethod//(alwaysRun=true)
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			
		}


//	@Test(priority = -1)
//	public void verifyTitleTest() throws Exception
//	{
//		String ExpeTitle="Swag Labs";
//		String ActTitle=login.verifyTitle();
//		Assert.assertEquals(ExpeTitle, ActTitle);
//	}
//	
//	@Test(priority = -1)
//	public void verifyCurrentUrlTest() 
//	{
//		String ExpUrl = "https://www.saucedemo.com/";
//		String ActUrl = login.VerifyCurrentUrl();
//		Assert.assertEquals(ExpUrl,ActUrl);
//	}
//	
//	@Test(priority=-1)
//	public void  VerifyLoginLogoTest() 
//	{
//		boolean result = login.VerifyLoginLogo();
//		Assert.assertEquals(result, true);
//	}
	@Test//(groups = "sanity")
	public void VerifyBotLogoTest()
	{
		boolean result = login.VerifyBotLogo(); 
		Assert.assertEquals(result,false);
	}
	@Test(priority=-1)
	public void LoginAppTest() throws Exception
	{
		String expRes="https://www.saucedemo.com/inventory.htm";
		String ActRes=login.LoginApp();
		Assert.assertEquals(expRes, ActRes);
		Reporter.log("Credentials=" + ActRes);
	}
//	@Test(priority=-1)
//	public void  VerifyLabelOfInventryTest() throws Exception
//	{
//		String expRes="PRODUCTS";
//		String ActRes=login.VerifyLabelOfInventry();
//		Assert.assertEquals(expRes, ActRes);
//		Reporter.log("Label of inventory=" + ActRes);
//	
//	}
//	
	
	@AfterMethod//(alwaysRun=true)
	public void CloseBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE == a.getStatus())
		{
		UtilityMethod.CaptureScreenShot(a.getName());
		}
		driver.close();
	}

}
