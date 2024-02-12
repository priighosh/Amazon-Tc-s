package amzn.source;//Searching
//LogIN then Search product=Scen2
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmznHomePage extends DdtProgForAmzn
{
		WebDriver driver;
		//Step 1
			@FindBy(xpath="//input[@id='twotabsearchtextbox']")	
			WebElement search_tf;
			
			@FindBy(xpath="(//input)[6]")	//not needed bcause we are not clicking we are pressing enter
			WebElement serach_button;	
		//step 2	
			public void search_tf_() 
			{
				search_tf.sendKeys("t shirt");
				search_tf.sendKeys(Keys.ENTER); //can be done in same method as well as in different method
			}
			//step 3
			public AmznHomePage(	WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
}
