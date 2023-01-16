package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest extends TestBase {
	
	
	@Test
	public void test1() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.close();
	}
	@Test
	public void test2() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(4000);
		driver.close();
	}
	@Test
	public void test3() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.close();
	}
	@Test
	public void test4() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.close();
	}

}
