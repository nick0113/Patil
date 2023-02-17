package FilpCartTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModules.OnlineShopingSiteForMobiles;

public class VerifyOnlineShopingSiteForMobiles {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 // Step1  : open browser  and enter the URL
		
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 //driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 

		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		 // Step2 : Enter the Mobile Number OR Email-Id and enter OPT
		
		OnlineShopingSiteForMobiles onlineShopingSiteForMobiles  = new OnlineShopingSiteForMobiles(driver);
	
		/*onlineShopingSiteForMobiles.clickOnLoging();
		 
		 onlineShopingSiteForMobiles.EnterNumber("7984987068");
		 onlineShopingSiteForMobiles.clickOnOTP();*/
		 
		 //Step3 : Serch product
		 
		 onlineShopingSiteForMobiles.SerchProduct("Laptop");
		 Thread.sleep(2000);
		 onlineShopingSiteForMobiles.clickOnSerch();
		 
		 //Step4 : verify Home Page  : URL and Title
		 
		 String actURL = driver.getCurrentUrl();
		 String actTitle =  driver.getTitle();
		 
		 String expectedURL = "https://www.flipkart.com/";
		 String expectedTitle = "Onlie Shoping Site For Mobiles"; 
		 
		 if(actURL.equals(expectedURL) && actTitle.equals(expectedTitle))
		 {
			 System.out.println("Test Pass");
		 }
		 
		 else 
		 {
			 System.out.println("Test Fail");
		 }
		 
	}

}
