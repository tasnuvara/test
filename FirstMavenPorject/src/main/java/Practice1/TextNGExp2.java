package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextNGExp2 {

	public String baseUrl= "https://www.edureka.co/";
	
	WebDriver driver=new InternetExplorerDriver();

    String driverpath= "C:\\Webdrivers\\IEDriverServer.exe";
    
    
    @Test
    public void verifyHomepageTitle() {
    	System.out.println("Launching IE Brower");
    	System.setProperty("webdriver.internetexpolrer.driver", driverpath);
    	
    	driver.get(baseUrl);
    	String expectedTitle= " Instructor-Led Online Traning with 24x7 Lifetime Support  Edureka";
    	String actualTitle=driver.getTitle();
    	Assert.assertEquals(actualTitle, expectedTitle);
    	driver.close();
    	
    }
    
    
	
}
