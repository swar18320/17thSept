package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
	
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
	
	@Test(enabled=true)
	public void verifyInventoryPageCurrentUrlTest() 
	{
		String ExpUrl = "https://www.saucedemo.com/inventory.htm";
		String ActUrl = login.VerifyCurrentUrl();
		AssertJUnit.assertEquals(ExpUrl,ActUrl);
	}
	
	@Test(enabled=false)
	public void  VerifypeekLogoTest()
	{
		boolean actual = invntory.VerifypeekLogo();
		Assert.assertEquals(actual, true);
		Reporter.log("Actual Title=" + actual);
	}
	@Test(enabled=false)
	public void addProductTest() throws Exception
	{
		String result = invntory.addProduct();
		Assert.assertEquals(result, "2");
		Reporter.log("Total Product Added="+result);
	}
		
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	

}
