package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//*[@name='email']")
	WebElement txtemail;
	
	
	@FindBy(xpath="//*[@id='input-password']")
	WebElement txtpass;
	
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement clksubmit;
	
	//*[@value='Login']
	
	
	public void enterLogin(String uname, String pwd)
	{
		txtemail.sendKeys(uname);
		txtpass.sendKeys(pwd);
		clksubmit.click();
		
	}
	
	
}
