package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	//epository
	@FindBy(xpath = "//div[@id=\"shopping_cart_container\"]")private WebElement CartProducts;
	
	
	public CartPage() 
	{
		PageFactory.initElements(driver, this);
		CartProducts.click();
		
		
	}
	
	
	
	public String VerifyCartpageUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
	
	
   

}






