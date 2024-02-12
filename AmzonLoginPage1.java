package amzn.source;
//Login=Scen1
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amz.excelsheet.DdtProgForAmzn;

public class AmzonLoginPage1 extends DdtProgForAmzn
{
	WebDriver driver;
  //step1
	@FindBy(name="email")	
	WebElement username;
	
	@FindBy(id="continue")	
	WebElement continue_button;
	

	@FindBy(xpath="//input[@id='ap_password']")	
	WebElement password;
	

	@FindBy(id="signInSubmit")	
	WebElement login_button;
	
//step 2
	
	public void username_() 
	{
//		username.sendKeys("priyankag448@gmail.com");
		username.sendKeys(un); //from excelsheet prog

	}
	
	public void continue_button_()
	{
		continue_button.click();
	}
	
	public void password_()
	{
//		password.sendKeys                                                                                                                                                                                    ("26111993");
		password.sendKeys(pw); //from excel sheet prog

	}
	
	public void login_button_()
	{
		login_button.click();
	}
	//step 3
	
	public AmzonLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver=driver;
	}
	
}
