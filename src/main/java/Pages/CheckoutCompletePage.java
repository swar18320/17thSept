package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutCompletePage extends TestBase {
	
	CheckoutStep1 check1;
	
	
	@FindBy(xpath = "//button[@id=\"finish\"]") private WebElement finshBtn;

	@FindBy(xpath = "//span[@class=\"title\"]") private WebElement Title;
	//@FindBy(xpath = "//img[contains(@alt,\"Pony Express\")]") private WebElement ponyExpressimg;
	@FindBy(xpath= "//div[@id=\"checkout_complete_container\"]")private WebElement ponyExpressimg;
	@FindBy(xpath = "//h2")private WebElement tfyo;
	public CheckoutCompletePage() 
	{
	PageFactory.initElements(driver, this);	
	}
	
	
	//span[@class="title"]
	
	public String VerifyChekoutCompleteTitle() throws Exception 
	{
		check1=new CheckoutStep1();
		check1.EnteredInformation();
		finshBtn.click();
		return  Title.getText();
		
	}
	public String VerifytfyTitle() throws Exception 
	{
		check1=new CheckoutStep1();
		check1.EnteredInformation();
		finshBtn.click();
		return  tfyo.getText();
		
	}
	public boolean VerifyPonyExpressImgDisplayed() throws Exception
	{
		check1=new CheckoutStep1();
		check1.EnteredInformation();
		finshBtn.click();
		Thread.sleep(2000);
		return ponyExpressimg.isDisplayed();
		
	}

	public String VerifyChekoutCompleteUrl() throws Exception 
	{
		check1=new CheckoutStep1();
		check1.EnteredInformation();
		finshBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
		
	}
	
	

}
