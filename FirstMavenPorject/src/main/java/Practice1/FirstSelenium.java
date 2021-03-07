package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dasta\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
	
	}
	

}
