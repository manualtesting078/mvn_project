package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	@FindBy(xpath = "//input[@id='user-name']") WebElement UN;
	@FindBy(xpath = "//input[@id='password']") WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") WebElement Login;
	
	public SwagLabLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLabUN(String UserName) 
	{
		UN.sendKeys(UserName);
		System.out.println();
	}
	public void inpSwagLabPWD(String Password) 
	{
		PWD.sendKeys(Password);
	}
	public void clickSwagLabLoginBtn()
	{
		Login.click();
	}

}
