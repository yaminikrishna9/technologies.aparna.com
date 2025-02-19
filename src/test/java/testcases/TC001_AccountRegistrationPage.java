package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccRegPage;
import testbase.BasePage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationPage extends BaseClass {
	//static WebDriver driver;
	
	
	
	@Test
	/*public static void main(String[]args) throws InterruptedException {*/
	 public void test() {
	 
		// TODO Auto-generated method stub

		
		/*driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();*/
		logger.info("HomePage test starts");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
	//	Thread.sleep(200);
		hp.clickRegister();
		//Thread.sleep(200);
		logger.info("Acctpage test starts");
		AccRegPage rp=new AccRegPage(driver);
		rp.enterFname(randomestring().toUpperCase());
	
		rp.enterLname(randomestring().toUpperCase());
		rp.enterEmail(randomemail());
		rp.enterPhone(randomenumber());
		String pwd=randomestring();
		rp.enterPassword(pwd);
		rp.enterConfirmPassword(pwd);
		rp.chkPolicy();
		rp.Continue();
	}
	
	
	

}
