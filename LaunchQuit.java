package testngamazon;//Assign63 
//Day51, Parent class of TestCases 1 to 5
//Day58Taken SS as well for all 5tcs with Math.random(),it can be done together with getClass() method also from object class
//for that and object of this parent has to be created, using it's ref variable we can get class name by getClass() method
import java.io.File; 
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	ChromeDriver driver; //Global variable
@BeforeMethod
public void Launch()
{
	driver=new ChromeDriver();//local variable driver
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@AfterMethod
public void Quit() throws InterruptedException, IOException
{
	TakesScreenshot t1=(TakesScreenshot) driver; //Up-casting driver explicitly
    File source=t1.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\HP\\eclipse-workspace\\EclipseCopy.zip_"
		+ "expanded\\Selenium2\\ScreenShot\\SS2"+Math.random()+".jpeg");
    FileUtils.copyFile(source, destination);
	Thread.sleep(7000);
//  driver.quit(); //Commenting to avoid error while using ScreenShot concept
}
}
