package amzn.test;//Credit/Debit card
//Scen7, Payment page tc

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz.excelsheet.DdtProgForAmzn;
import amzn.source.AmznAddToCart4;
import amzn.source.AmznAddressPage6;
import amzn.source.AmznBuyNowPage3;
import amzn.source.AmznHomePage;
import amzn.source.AmznPaymentCreditDebitCard7;
import amzn.source.AmznProceedToBuy5;
import amzn.source.AmzonLoginPage1;
import amzn.source.PaymentFrame;

public class Amzn_IT_07PaymentCreditDebitCard extends LaunchAndQuit
{
	@Test(priority=7)
	public void ValidationOfPaymentOption1 () throws InterruptedException, EncryptedDocumentException, IOException
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
	 	     Thread.sleep(7000);
	 	     
	 	    AmznPaymentCreditDebitCard7 a7=new AmznPaymentCreditDebitCard7(driver);
	 	    a7.CeditDebitCard_();
	 	    Thread.sleep(2000);
	 	    a7.EnterCardDetails_();
	 	    
	 	    /*----NOT NEEDED STILL DONE IT IN PAYMENTFRAME SOURCE CLASS
	 	     String ParentId2=driver.getWindowHandle();
		     System.out.println("Parent i'd2= "+ ParentId2);
		     Set<String> ParentAndChildId2=driver.getWindowHandles();
		     System.out.println("Parent & Child i'd2= "+ ParentAndChildId2);
		     Thread.sleep(3000);
		    
		     Iterator<String> PcPayment=ParentAndChildId2.iterator();
		     String id3=PcPayment.next();
		     System.out.println("Parent2: "+ id3);
		     String id4=PcPayment.next();
		     System.out.println("Child2: "+ id4); */
	 	     
	 	    PaymentFrame a8=new PaymentFrame(driver);
	 	    a8.CardDetailsFrame_(driver);	 	    Thread.sleep(2000);
	 	    a7.CardNumber_(); 
	 	    a7.Enter_();
	 	}
}
