package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
	@FindBy (xpath = "(//div[@id='container']//div//button)[6]")
	private WebElement PlaceOrder ;
	
	
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PlaceOrder()
	{
		PlaceOrder.click();
	}
	

}
