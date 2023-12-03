package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	@FindBy(xpath = "(//button[contains(text(),'Add to cart')])[1]")private WebElement AddToCart; 
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement Menu;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement Cartlogo;
	WebDriver driver;
	public SwagLabHomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getSwagLabHomePageTitle() 
	{
		String actTitle = driver.getTitle();
		return actTitle;
	}
	public void clickAddTocart() 
	{
		AddToCart.click();
	}
	public void clickOnSwagLabCartLogo() 
	{
		Cartlogo.click();
	}
	public void clickSwagLabMenuBtn() 
	{
		Menu.click();
	}
	
	
	
	
}
