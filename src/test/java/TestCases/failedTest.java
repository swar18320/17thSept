package TestCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class failedTest extends TestBase {
	
	LoginPage login;
	InventoryPage invntory;
	
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			invntory= new InventoryPage();
			login.LoginApp();
			
		}

//	@Test
//	public void  Test1()
//	{
//		boolean actual = invntory.VerifypeekLogo();
//		Assert.assertEquals(actual,true);
//		Reporter.log("Actual Title=" + actual);
//	}

	@Test(groups="Suraj")
	public void  Test2()
	{
		boolean actual = invntory.VerifypeekLogo();
		Assert.assertEquals(actual, true);
		Reporter.log("Actual Title=" + actual);
	}

//	@Test
//	public void  Test3()
//	{
//		boolean actual = invntory.VerifypeekLogo();
//		Assert.assertEquals(actual, false);
//		Reporter.log("Actual Title=" + actual);
//	}
//
//	@Test
//	public void  Test4()
//	{
//		boolean actual = invntory.VerifypeekLogo();
//		Assert.assertEquals(actual, false);
//		Reporter.log("Actual Title=" + actual);
//	}
	@AfterMethod(alwaysRun=true)
	public void CloseBrowser()
	{
		driver.close();
	}
	
}
