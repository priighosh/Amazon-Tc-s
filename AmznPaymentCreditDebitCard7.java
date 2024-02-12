package amzn.source;//Credit/Debit card and enter details
import org.openqa.selenium.ElementNotInteractableException;
//Scen7, Payment page tc
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznPaymentCreditDebitCard7 extends DdtProgForAmzn
{
	WebDriver driver;
	//Step 1
	    
	    @FindBy(xpath="//input[@name='ppw-instrumentRowSelection']")
	    WebElement CreditAndDebitCard;
	    
	    @FindBy(xpath="//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")
	    WebElement EnterCardDetails;
		
/*	    @FindBy(xpath="//div[@class=\"a-popover-inner\"]") //Whole frame not needed here
	    WebElement CardDetailsFrame;*/
	    
	    @FindBy(xpath="//input[@name='addCreditCardNumber']")
	    WebElement CardNumber;
	  //input[@class='a-input-text a-form-normal pmts-account-Number']
	  //input[@name='addCreditCardNumber']
	//step 2	
	    @FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	    WebElement Enter;

		public void CeditDebitCard_ () 
		{
			CreditAndDebitCard.click();
		}
		public void EnterCardDetails_ () 
		{
			EnterCardDetails.click();
		}
		public void CardNumber_ () 
		{
			try
			{
			CardNumber.sendKeys("256412784525");
			}
			catch(ElementNotInteractableException e)
			{
				System.out.println("HandledException");
			}
		}
		public void Enter_ () 
		{
			Enter.click();
		}
		//step 3
		public AmznPaymentCreditDebitCard7 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
