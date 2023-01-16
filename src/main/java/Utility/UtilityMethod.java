package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Pages.CheckoutStep1;
import Pages.InventoryPage;
import Pages.LoginPage;

public class UtilityMethod extends TestBase {
	
	public static void SelectClass(WebElement ele , String Option)
	{
		Select se = new Select(ele);
		se.selectByVisibleText(Option);
	}
	
 
	public static void CaptureScreenShot(String name) throws Exception
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		File destination=new File("C:\\Users\\admin\\eclipse-workspace\\17SeptMaven\\ScreenShots/"+name+".jpeg");
		FileHandler.copy(Source,destination);
	}
	
}
