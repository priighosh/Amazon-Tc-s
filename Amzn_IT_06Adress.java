package amzn.test;// Address page
//Scen6, Use this Address tc
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz.excelsheet.DdtProgForAmzn;
import amzn.source.AmznAddToCart4;
import amzn.source.AmznAddressPage6;
import amzn.source.AmznBuyNowPage3;
import amzn.source.AmznHomePage;
import amzn.source.AmznProceedToBuy5;
import amzn.source.AmzonLoginPage1;

public class Amzn_IT_06Adress extends LaunchAndQuit
{
	@Test(priority=6)
	public void ValidationOfUseThisAddress () throws InterruptedException, EncryptedDocumentException, IOException
	{
		AmzonLoginPage1 a1=new AmzonLoginPage1(driver);
		DdtProgForAmzn.FetchData();
		a1.username_();
		a1.continue_button_();
		a1.password_();
		a1.login_button_();
	
		AmznHomePage a2=new AmznHomePage(driver);
		a2.search_tf_();
		
		AmznBuyNowPage3 a3=new AmznBuyNowPage3(driver);
		a3.firstPrdt_();
        a3.movecontrol_(driver);
		  
	    AmznAddToCart4 a4=new AmznAddToCart4(driver);
	    a4.AddToCart__();
	     
	    AmznProceedToBuy5 a5=new AmznProceedToBuy5(driver);
	    a5.ProceedToBuy_();
	     
	    AmznAddressPage6 a6=new AmznAddressPage6(driver);
	    a6.UseThisAddress();
	}
}
