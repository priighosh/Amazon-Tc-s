package amzn.test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class LaunchAndQuit 
{
	    WebDriver driver;
		@BeforeMethod
		public void launch() 
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.re"
					+ "turn_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&open"
					+ "id.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&op"
					+ "enid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid."
					+ "net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		@AfterMethod
		public void quit() throws Exception
		{
			Thread.sleep(4000);
		//	driver.quit();
		}
	}


