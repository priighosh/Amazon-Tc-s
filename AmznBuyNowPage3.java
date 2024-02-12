package amzn.source;//Clicking on 2nd product and buy now
import java.util.Iterator;
import java.util.Set;

//Scen3,Buy Now sorce file
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznBuyNowPage3 extends DdtProgForAmzn
{
	WebDriver driver;
	//Step 1
	
		@FindBy(xpath="(//img[@class='s-image'])[6]")
		WebElement first_tShirt;
		
	     
	     @FindBy(xpath="//input[@id='buy-now-button']")
	     WebElement BuyNow;
		
	//step 2	
		
		public void firstPrdt_()
		{
			first_tShirt.click();
		}
		public void movecontrol_(WebDriver driver) throws InterruptedException //Without this para nullPointerException was showing up
		{
		 String ParentId=driver.getWindowHandle();
	     System.out.println("Parent i'd= "+ ParentId);
	     Set<String> ParentAndChildId=driver.getWindowHandles();
	     System.out.println("Parent & Child i'd= "+ ParentAndChildId);
	     Thread.sleep(3000);
	    
	     Iterator<String> Pc=ParentAndChildId.iterator();
	     String id1=Pc.next();
	     System.out.println("Parent: "+ id1);
	     String id2=Pc.next();
	     System.out.println("Child: "+ id2);
	     //Move the control to child
	     driver.switchTo().window(id2);
		}
		public void BuyNow__()
		{
			BuyNow.click();
		}
		//step 3
		public AmznBuyNowPage3(	WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
