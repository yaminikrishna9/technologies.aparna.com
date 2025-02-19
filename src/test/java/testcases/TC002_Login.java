package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_Login extends BaseClass{
	@Test
	public void verifyLogin()
	{
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clickLogin();
	logger.info("Loginpage test starts");
	LoginPage lp=new LoginPage(driver);
	lp.enterLogin("Test9991@gmail.com", "test9");
			
	MyAccountPage acc=new MyAccountPage(driver);
	boolean res=acc.AccPageexists();
	Assert.assertTrue(res);
	}
	
	
}
