package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
public WebDriver driver;
public Logger logger;	
	@BeforeClass 
	@Parameters({"os","browser"})
	public void setUp(String os,String br) throws IOException {
		
		logger=LogManager.getLogger(this.getClass());
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("./src/test/java/Resources/config.propeties");
		p.load(fis);
		if(p.getProperty("exec_env").equalsIgnoreCase("remote"))
				{
			DesiredCapabilities cap=new DesiredCapabilities();
			if(os.equalsIgnoreCase("windows"))
			{
				cap.setPlatform(Platform.WIN11);
				
			}
			else if(os.equalsIgnoreCase("Mac"))
			{
				cap.setPlatform(Platform.MAC);
				
			}
			else
			{
				System.out.println("No matching os found");
				return;
				}
				
		
		switch(br.toLowerCase())
		{
		case "chrome":cap.setBrowserName("chrome")  ;break;
		case "firefox":cap.setBrowserName("firefox"); break;
		case "edge": cap.setBrowserName("MicrosoftEdge") ;break;
		default: System.out.println("invalid browser");return;
		}
		driver=new RemoteWebDriver(new URL("http://192.168.0.165:4444/wd/hub"),cap);
				}
		if(p.getProperty("exec_env").equalsIgnoreCase("local"))
			System.out.println("identified local");
		{
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "firefox":driver=new FirefoxDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		default: System.out.println("invalid browser");return;
		}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
				
				
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public static String randomestring()
	{
		String randomstring=RandomStringUtils.randomAlphabetic(5);
		return randomstring;
	}
	public static String randomenumber()
	{
		String randomnum=RandomStringUtils.randomNumeric(10);
		return randomnum;
	}
	public static String randomemail(
		)
	{
		//String randomnum=RandomStringUtils.randomNumeric(5);
		String randomstri=RandomStringUtils.randomAlphabetic(5);
		String randomemai=randomstri+"@gmail.com";
		return randomemai;
	}
}
