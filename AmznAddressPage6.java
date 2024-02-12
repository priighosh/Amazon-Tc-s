package amzn.source;
//Scen6 Proceed to buy source class
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznAddressPage6 extends DdtProgForAmzn
{
	WebDriver driver;
	//Step 1
		
	    @FindBy(xpath="(//input[@class='a-button-input'])[2]")
	    WebElement UseThisAddress;
		
	//step 2	
		
		public void UseThisAddress() 
		{
			UseThisAddress.click();
		}
		
		//step 3
		public AmznAddressPage6 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
