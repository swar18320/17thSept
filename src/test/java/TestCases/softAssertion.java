package TestCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class softAssertion extends TestBase{
	
	LoginPage login;
	InventoryPage invntory;
	
	@BeforeMethod
	public void setup() throws Exception
		{
			initialization();
			login= new LoginPage();
			invntory= new InventoryPage();
			login.LoginApp();
		}		
	
	@Test(enabled=false)
	public void verifyInventoryPageCurrentUrlTest() 
	{
		String ExpUrl = "https://www.saucedemo.com/inventory.html";
		String ActUrl = login.VerifyCurrentUrl();
		AssertJUnit.assertEquals(ExpUrl,ActUrl);
	}
	
	@Test
	public void  VerifypeekLogoTest()
	{
		boolean actual = invntory.VerifypeekLogo();
		System.out.println("lets start");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, false);
		System.out.println("lets end");
		soft.assertAll();
		Reporter.log("Actual Title=" + actual);
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
