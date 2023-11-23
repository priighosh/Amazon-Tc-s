package testngamazon;
//Day51, child 3
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase3 extends LaunchQuit
{
	@Test
	public void scenerio1() throws InterruptedException
	{
    	    WebElement SearchTf=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        SearchTf.sendKeys("Shoes");
	        SearchTf.sendKeys(Keys.ENTER);
	        WebElement FirstShoe=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
	        FirstShoe.click();
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
	        WebElement BuyNow=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
	        BuyNow.click();
	        WebElement Un=driver.findElement(By.xpath("//input[@id='ap_email']"));
	        Un.sendKeys("9732791879");
	        WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
	        Continue.click();
	        WebElement Pwd=driver.findElement(By.xpath("//input[@name='password']"));
	        Pwd.sendKeys("26111993");
	        WebElement SignIn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	        SignIn.click();
	        WebElement UseThishAddress=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
	        UseThishAddress.click();	
	        Thread.sleep(7000);
            WebElement CreditDebitCard=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	        CreditDebitCard.click();
	}
}
