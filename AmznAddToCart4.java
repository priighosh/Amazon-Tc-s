package amzn.source;
//Scen4 add to cart source file
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznAddToCart4 extends DdtProgForAmzn
{
	WebDriver driver;
	//Step 1
		
	    @FindBy(xpath="//input[@id='add-to-cart-button']")
	     WebElement AddToCart;
		
	//step 2	
		
		public void AddToCart__()
		{
			AddToCart.click();
		}
		//step 3
		public AmznAddToCart4(	WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
