package amzn.source;
import java.util.Iterator;
import java.util.Set;

//Switching the control to frame
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentFrame 
{
	WebDriver driver;
	// @FindBy(xpath="//div[@class=\"a-popover-inner\"]")
	    @FindBy(tagName="iframe")
	    WebElement CardDetailsFrame;
	   

	public void CardDetailsFrame_ (WebDriver driver) throws InterruptedException 
		{
		 String ParentId2=driver.getWindowHandle();
	     System.out.println("Parent i'd2= "+ ParentId2);
	     Set<String> ParentAndChildId2=driver.getWindowHandles();
	     System.out.println("Parent & Child i'd2= "+ ParentAndChildId2);
	     Thread.sleep(3000);
	    
	     Iterator<String> PcPayment=ParentAndChildId2.iterator();
	     String id3=PcPayment.next();
	     System.out.println("Parent2: "+ id3);
	     String id4=PcPayment.next();
	     System.out.println("Child2: "+ id4); //These 10 lines aren't needed for frame, doing for practice
		 driver.switchTo().frame(CardDetailsFrame);
		}
	 public PaymentFrame(WebDriver driver)
	    {
           PageFactory.initElements( driver,this);
	    }
}
