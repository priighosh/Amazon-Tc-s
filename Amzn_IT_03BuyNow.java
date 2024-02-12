package amzn.test;
//Scen3,Buy Now Tc
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import amz.excelsheet.DdtProgForAmzn;
import amzn.source.AmznBuyNowPage3;
//import amzn.source.AmznAddToCartPage3;
import amzn.source.AmznHomePage;
import amzn.source.AmzonLoginPage1;

public class Amzn_IT_03BuyNow extends LaunchAndQuit
{
	@Test(priority=3)
	public void ValidationOfBuyNow () throws InterruptedException, EncryptedDocumentException, IOException
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
		//DONE THIS IN SOURCE PAGE SO THAT I CAN UTILIZE LATER ALSO
//		 String ParentId=driver.getWindowHandle();
//	     System.out.println("Parent i'd= "+ ParentId);
//	     Set<String> ParentAndChildId=driver.getWindowHandles();
//	     System.out.println("Parent & Child i'd= "+ ParentAndChildId);
//	     Thread.sleep(3000);
//	    
//	     Iterator<String> Pc=ParentAndChildId.iterator();
//	     String id1=Pc.next();
//	     System.out.println("Parent: "+ id1);
//	     String id2=Pc.next();
//	     System.out.println("Child: "+ id2);
//	     //Move the control to child
//	     driver.switchTo().window(id2);
		 a3.movecontrol_(driver);
	     a3.BuyNow__();
	}
}
