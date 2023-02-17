package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsusROGZephyrusDuo16DualScreenLaptop {
	
	@FindBy (xpath = "//span[text()='Change']")
	private WebElement Change ;
	
	@FindBy (xpath = "//span[text()='Check']")
	private WebElement CheckPincode;
	
	@FindBy (xpath = "(//div[@id='container']//li//button)[1]")
	private WebElement GoToCart;

	

	public AsusROGZephyrusDuo16DualScreenLaptop  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ChangePincode()
	{
		Change.click();
	}
	
	public void CheckPincode()
	{
		CheckPincode.sendKeys("394210");
	}
	
	public void GoToCart()
	{
		GoToCart.click();
	}
}
