package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	
	//object Repository
	@FindBy(xpath = "//div[@class=\"login_logo\"]") private WebElement loginlogo;
	@FindBy(xpath = "//div[@class=\"bot_column\"]") private WebElement botlogo;
	@FindBy(xpath = "//input[@id=\"user-name\"]") private WebElement UserNameText;
	@FindBy(xpath="//input[@id=\"password\"]") private WebElement PassText;
	@FindBy(xpath="//input[@value=\"Login\"]") private WebElement LoginButton;
	@FindBy(xpath="//span[@class=\"title\"]") private WebElement inventrylogo;
	
	
	LoginPage login;
	
	//span[@class="title"]
	
	//Constructor to initialize the element of class
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean VerifyLoginLogo()
	{
		return loginlogo.isDisplayed();
	}
	
	public boolean VerifyBotLogo()
	{
		return botlogo.isDisplayed();
	}
	
	public String verifyTitle() throws Exception 
	{
		login= new LoginPage();
		login.LoginApp();
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public String VerifyCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	public String LoginApp() throws Exception
	{
//		UserNameText.sendKeys(ReadData.readPropertyFile("Username"));
		UserNameText.sendKeys(ReadData.readExcelFile(0, 0));
		PassText.sendKeys(ReadData.readPropertyFile("Password"));
		LoginButton.click();
		return driver.getCurrentUrl();
		
	}
	public String VerifyLabelOfInventry() throws Exception {
		 
		LoginApp();
		return  inventrylogo.getText();
		
		
	}


}
