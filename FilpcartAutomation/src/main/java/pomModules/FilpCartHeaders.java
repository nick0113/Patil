package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilpCartHeaders {
	
	@FindBy (xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement SerchProduct ;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SerchButton ;
	
	@FindBy (xpath = "//div[text()='My Account']")
	private WebElement MyAccount;
	
	@FindBy (xpath = "(//span[text()='Become a Seller'])[1]")
	private WebElement BecomeSeller ;
	
	@FindBy (xpath = "//div[text()='More']")
	private WebElement More ;
	
	@FindBy (xpath = "///span[text()='Cart']")
	private WebElement Cart ;
	
	@FindBy (xpath = "//span[text()='Electronics']")
	private WebElement Electronics ;
	
	@FindBy (xpath = "//span[text()='TVs & Appliances']")
	private WebElement TVsAppliances ;
	
	@FindBy (xpath = "//span[text()='Men']")
	private WebElement Men ;
	
	@FindBy (xpath = "//span[text()='Women']")
	private WebElement Women ;
	
	@FindBy (xpath = "//span[text()='Baby & Kids']")
	private WebElement BabyKids ;
	
	@FindBy (xpath = "//span[text()='Home & Furniture']")
	private WebElement HomeFurniture ;
	
	@FindBy (xpath = "//span[text()='Sports, Books &amp; More']")
	private WebElement SportsBooks ;
	
	@FindBy (xpath = "//span[text()='Flights']")
	private WebElement Flights ;
	
	@FindBy (xpath = "//span[text()='Offer Zone']")
	private WebElement OfferZone ;
	
	@FindBy (xpath = "//span[text()='Grocery']")
	private WebElement Grocery ;
	
	public void FilpCartHeaders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectProduct()
	{
		SerchProduct.sendKeys("laptop");
	}
	
	public void ClickOnSerchButton()
	{
		SerchButton.click();
	}
	
	public void ClickOnElectronics()
	{
		Electronics.click();
	}
	
	public void ClickOnTVsAppliances()
	{
		TVsAppliances.click();
	}
	
	public void ClickOnMen()
	{
		Men.click();
	}
	
	public void ClickOnWomen()
	{
		Women.click();
	}
	
	public void ClickOnBabyKids()
	{
		BabyKids.click();
	}
	public void ClickOnHomeFurniture()
	{
		HomeFurniture.click();
	}
	
	public void SportBook()
	{
		SportsBooks.click();
	}
	
	public void ClickOnFlight()
	{
		Flights.click();
	}
	
	public void ClickOnOfferZone()
	{
		OfferZone.click();
	}
	
	public void ClickOnGrocery()
	{
		Grocery.click();
	}
	
	
	
	
	
	

}
