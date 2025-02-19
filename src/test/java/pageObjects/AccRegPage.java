package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BasePage;

public class AccRegPage extends BasePage{

	//WebDriver driver;
	
	
	public AccRegPage(WebDriver driver)
	{
	super(driver);
	
}
	
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLasttname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void enterFname(String fname)
	{
	
	txtFirstname.sendKeys(fname);
	}
	public void enterLname(String lname)
	{
	
		txtLasttname.sendKeys(lname);
	}
	public void enterPassword(String pwd)
	{
	
		txtPassword.sendKeys(pwd);
	}
	public void enterConfirmPassword(String Cpwd)
	{
	
		txtConfirmPassword.sendKeys(Cpwd);
	}
	public void enterEmail(String email)
	{
	
		txtEmail.sendKeys(email);
	}
	public void enterPhone(String phone)
	{
	
		txtTelephone.sendKeys(phone);
	}
	
	public void Continue()
	{
	
		btnContinue.click();
	}
	public void chkPolicy()
	{
	
		chkdPolicy.click();
	}
	
	public String getconfirmationMessage()
	{
	try
	{
		return(msgConfirmation.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
	
	}
	
}
