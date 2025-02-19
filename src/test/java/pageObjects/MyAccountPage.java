package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BasePage;

public class MyAccountPage extends BasePage{

	
	 public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 
	 @FindBy(xpath="//h2[text()='My Account']")
	 WebElement msgHeading;
	 
	public Boolean AccPageexists()
	{
		try
		{
		return(msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
		
	
	
	}
}
