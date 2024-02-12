package amzn.test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//LogIn=Test case for scen1
import org.testng.annotations.Test;

import amz.excelsheet.DdtProgForAmzn;
import amzn.source.AmzonLoginPage1;

public class Amzn_IT_01LogIn extends LaunchAndQuit
{
	
	@Test(priority=1)
	public void Toverifyloginfunctionality() throws EncryptedDocumentException, IOException
	{
		AmzonLoginPage1 a1=new AmzonLoginPage1(driver); //Initializing my elements
		DdtProgForAmzn.FetchData(); //Fetching data
		a1.username_(); //using fetched data
		a1.continue_button_();
		a1.password_(); //using fetched data
		a1.login_button_();
		
		
	}
}
