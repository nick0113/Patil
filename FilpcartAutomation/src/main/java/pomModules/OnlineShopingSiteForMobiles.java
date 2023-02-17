package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineShopingSiteForMobiles {
	
	// Varibales
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement Loging ;
	
	@FindBy (xpath = "(//div[@class='_3vhnxf'])[1]")
	private WebElement MyProfile ;
	
	@FindBy (xpath = "//span[text()='Enter Email/Mobile number']")
	private WebElement EnterNumber ;
	
	@FindBy (xpath = "//button[text()='Request OTP']")
	private WebElement OTP ;
	
	@FindBy (xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement SerchProduct ;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SerchButton ;
	
	//private WebDriverWait wait;

	//private Actions act ;

	//private WebDriver driver;
	
	//Constructor
	
	public OnlineShopingSiteForMobiles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver ;         // ===> initialize  the Gobal driver 
		
		
	
	}
	
	
	// Method
	
	/*public void clickOnLoging()
	{
	
	    act = new Actions (driver);
		act.moveToElement(Loging).moveToElement(MyProfile).click().build().perform();
	}*/
	
	/*public void EnterNumber(String number)
	{
		EnterNumber.sendKeys(number);
	}
	
	public void clickOnOTP()
	{
		OTP.click();
	}*/
	
	public void SerchProduct(String Product)
	{
		SerchProduct.sendKeys(Product);
	}
	
	public void clickOnSerch()
	{
		SerchButton.click();
	}

	

}
