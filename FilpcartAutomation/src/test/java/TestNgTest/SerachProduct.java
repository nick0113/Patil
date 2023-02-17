package TestNgTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseBrowser.Browser;
import pomModules.LaptopByProductOnline;
import pomModules.OnlineShopingSiteForMobiles;

public class SerachProduct extends Browser {
	WebDriver driver ;
	OnlineShopingSiteForMobiles onlineShopingSiteForMobiles;
	LaptopByProductOnline laptopByProductOnline ;
	
	
	
	
	
	@Parameters("browser001")
	@BeforeTest
	public void launchBrowser(String browser) {
	{
	if (browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		 driver = new ChromeDriver();
	}
	
	/*if (browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
	}
	
	if (browser.equals("Edge"))
	{
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
	}*/
	   
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	}

	}
    @BeforeClass
    public void Obj()
    {
    	onlineShopingSiteForMobiles = new OnlineShopingSiteForMobiles(driver);
    	laptopByProductOnline = new  LaptopByProductOnline(driver);
    }
    
    @BeforeMethod
    public void URL()
    {
    	driver.get("https://www.flipkart.com/");
    }
    
    @Test
    public void Seeproduct()
    {
    	onlineShopingSiteForMobiles.SerchProduct("Laptop");
    	onlineShopingSiteForMobiles.clickOnSerch();
    	laptopByProductOnline.HighTOLow();
    	laptopByProductOnline.Minimum();
    	laptopByProductOnline.Maximum();
    	laptopByProductOnline.AsusLaptop();
    
    }
    
    @AfterClass
    public void test1()
    {
    	onlineShopingSiteForMobiles = null ;  
    	laptopByProductOnline = null ;
    }
    
    @AfterTest
    public void test2()
    {
    	driver.close();
    	driver = null ;
    	System.gc();
    }
    
}
