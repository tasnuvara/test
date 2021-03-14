/**
 * 
 */
package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author dasta
 *
 *This will store all the locators and methods of login page.
 *
 */
public class LoginPage {

	WebDriver driver;
	
	By username= By.id("UserName");
	By passward=By.id("Password");
	By loginButton=By.name("submitButton");
	
	public LoginPage(WebDriver driver) 
	{
			this.driver=driver;
		}
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
		
	}
	public void typePassword() {
		
		driver.findElement(passward).sendKeys("1234");
	}
	
	public void clickOnLoginButton() {
		
		driver.findElement(loginButton).click();
	}
	
	}

	
	

