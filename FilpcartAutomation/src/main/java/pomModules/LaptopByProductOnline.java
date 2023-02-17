package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LaptopByProductOnline {
	
	
	@FindBy (xpath = "div[text()='Price -- High to Low']")
	private WebElement HighToLow ;
	
	@FindBy (xpath = "(//select[@class='_2YxCDZ'])[1]")
	private WebElement MinimumPrice ;
	
	@FindBy (xpath = "(//select[@class='_2YxCDZ'])[2]")
	private WebElement MaximizePrice ;
	
	@FindBy (xpath = "(//div[@id='container']//div)[219]")
	private WebElement AsusLaptop;
	
	
	public LaptopByProductOnline  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void HighTOLow()
	{
		HighToLow.click();
	}
	
	public void Minimum()
	{
		Select s = new Select(MinimumPrice);
		s.selectByIndex(2);
	}
	
	public void Maximum()
	{
		Select s = new Select(MaximizePrice);
		s.selectByIndex(6);
	}
	
	public void AsusLaptop()
	{
		AsusLaptop.click();
	}
	

}
