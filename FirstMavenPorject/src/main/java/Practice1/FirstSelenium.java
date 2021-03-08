package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class FirstSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webderiver.ie.driver", "C:\\Webdrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	
		driver.get("https://www.google.com");
				System.out.println(driver.getTitle());
		
	
	}
	

}
