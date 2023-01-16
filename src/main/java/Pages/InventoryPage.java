package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase {
	
	//Respository
@FindBy(xpath = "//input[@id=\"user-name\"]") private WebElement UserNameText;
@FindBy(xpath="//input[@id=\"password\"]") private WebElement PassText;
@FindBy(xpath="//input[@value=\"Login\"]") private WebElement LoginButton;
@FindBy(xpath ="//div[@class=\"peek\"]" ) private WebElement peekLogo;
@FindBy(xpath = "//img[@alt=\"Swag Bot Footer\"])") private WebElement SwagBotLogo;
@FindBy(id = "add-to-cart-sauce-labs-backpack") private WebElement Backpack;
@FindBy(id = "add-to-cart-sauce-labs-bike-light") private WebElement BikeLite;

@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sortProductDropdown;
@FindBy(xpath="//span[@class='shopping_cart_badge']")private	WebElement productCount;





	
   public InventoryPage() throws Exception 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean VerifypeekLogo()
	
	{
		return peekLogo.isDisplayed();
		
	}
	public boolean VeriFySwagBotLogo() 
	{
		return SwagBotLogo.isDisplayed();
		
	}
	public String addProduct() throws Exception 
	{
		Thread.sleep(2000);
		UtilityMethod.SelectClass(sortProductDropdown, "Name (A to Z)");
	    Thread.sleep(2000);
		Backpack.click();
		BikeLite.click();
		//RemoveBackPack.click();
		productCount.click();
		
		
		
		return productCount.getText();
	}
	
	
	
	
	
	public String VerifyInventoryPageCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	






}
