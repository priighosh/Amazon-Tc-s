package amzn.test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//LogIn and search product=TC of Scen2
import org.testng.annotations.Test;

import amz.excelsheet.DdtProgForAmzn;
import amzn.source.AmznHomePage;
import amzn.source.AmzonLoginPage1;

public class Amzn_IT_02HomePage extends LaunchAndQuit
{
	@Test(priority=2)
	public void Validationofsearchingproduct() throws EncryptedDocumentException, IOException
	{
		AmzonLoginPage1 a1=new AmzonLoginPage1(driver);
		DdtProgForAmzn.FetchData();
		a1.username_();
		a1.continue_button_();
		a1.password_();
		a1.login_button_();
	
		AmznHomePage a2=new AmznHomePage(driver);
		a2.search_tf_();
		
		
	}
}
