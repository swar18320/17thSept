package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Pages.CheckoutStep1;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
       public static WebDriver driver;
	
       public void initialization() throws Exception {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		//driver.get("https://www.saucedemo.com/");
		driver.get(ReadData.readPropertyFile("Url"));
		
		
		
		
	}
     
       public void NavigateToCheck2() throws Exception
       {
    	   
    	   LoginPage login= new LoginPage();
    	  InventoryPage invntory= new InventoryPage();
    	  CheckoutStep1 check1=new CheckoutStep1();
    	   login.LoginApp();
    	   invntory.addProduct();
    	  
       }
//hii i am 
}
