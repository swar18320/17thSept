package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class CheckoutStep2 extends TestBase {
	CheckoutStep1 check1;
	
	@FindBy(className = "title")private WebElement CheckoutTwoTitle;
	@FindBy (xpath="//button[@id=\"checkout\"]") private WebElement chkbtn;
	@FindBy(xpath= "//input[@id=\"continue\"]")private WebElement contbtn;
	
	
	public CheckoutStep2() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyCheckoutTwoTitle() throws Exception
	{
		check1=new CheckoutStep1();
		check1.EnteredInformation();	
		return  CheckoutTwoTitle.getText();
		
	}

}
