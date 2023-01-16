package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckoutStep1  extends TestBase{
	@FindBy (xpath="//button[@id=\"checkout\"]") private WebElement chkbtn;
	@FindBy(xpath ="//input[@id=\"first-name\"]")private WebElement fstname;
	@FindBy(xpath="//input[@id=\"last-name\"]")private WebElement lstname;
	@FindBy(xpath ="//input[@id=\"postal-code\"]")private WebElement postalCode;
	@FindBy(xpath= "//input[@id=\"continue\"]")private WebElement contbtn;
	@FindBy(xpath= "//div[@class=\"error-message-container error\"][1]")private WebElement ErrorContainer;
	@FindBy(className = "title")private WebElement CheckoutTitle;
	
	//Error: First Name is required
	
	LoginPage login;
	InventoryPage invntory;

//
	public CheckoutStep1() throws Exception
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public String VerifCheckoutStep1Url()  
	{
		chkbtn.click();
		
		return driver.getCurrentUrl();
		
	}
	public void EnteredInformation() throws Exception 
	{
		chkbtn.click();
		fstname.sendKeys(ReadData.readPropertyFile("FirstName"));
		Thread.sleep(2000);
		lstname.sendKeys(ReadData.readPropertyFile("LastName"));
		Thread.sleep(2000);
		postalCode.sendKeys(ReadData.readPropertyFile("PostalCode"));
		 contbtn.click();
	}
	public String VerifyErrorMeassage()
	{
		chkbtn.click();
		contbtn.click();
	    return ErrorContainer.getText();
	}

	
public String VerifyCheckoutPageTitle()

{
	chkbtn.click();
	return CheckoutTitle.getText();
}
	
	
}
