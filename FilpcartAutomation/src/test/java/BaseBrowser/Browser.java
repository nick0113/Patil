package BaseBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver openFirefoxBrowser()
	{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			return driver;
		}
	
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        return driver;
		}

	}


