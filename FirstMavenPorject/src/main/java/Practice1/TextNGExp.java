package Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextNGExp {

	public String baseUrl= "https://www.edureka.co/";
	
	WebDriver driver=new InternetExplorerDriver();

    String driverpath= "C:\\Webdrivers\\IEDriverServer.exe";
    
    
    @BeforeTest
    public void LaunchBrowser() {
    	System.out.println("Launching IE Brower");
    	System.setProperty("webdriver.internetexpolrer.driver", driverpath);
    	driver.get(baseUrl);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void verifyHomepageTitle() {
    	String expectedTitle= " Instructor-Led Online Traning with 24x7 Lifetime Support  Edureka";
    	String actualTitle=driver.getTitle();
    	Assert.assertEquals(actualTitle, expectedTitle);
    	driver.close();
    	
    }
    @AfterTest
    	public void CloseBrowser() {
    		driver.close();
    
    
    }
}
