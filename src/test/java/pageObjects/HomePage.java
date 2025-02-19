package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BasePage;

public class HomePage extends BasePage {
 WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@class='caret']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[contains(.,'Register')]")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
}
	public void clickRegister()
	{
		lnkRegister.click();
	}
		
		public void clickLogin()
		{
			lnkLogin.click();
}
	
}
