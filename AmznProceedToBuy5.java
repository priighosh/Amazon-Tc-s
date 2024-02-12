package amzn.source;
//Scen5 Procced to buy source
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznProceedToBuy5 extends DdtProgForAmzn
{
	WebDriver driver;
	//Step 1
	    
	    @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	    WebElement ProceedToBuy;
		
	//step 2	
		
		public void ProceedToBuy_()
		{
			ProceedToBuy.click();
		}	
		//step 3
		public AmznProceedToBuy5(	WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
