package Practice1;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest3 {

	//WebDriver driver = new InternetExplorerDriver();
	@Test
	public void startApp() {
		
		//driver.get("https://www.saucedemo.com");
	System.out.println("Start App");
		//Assert.assertEquals(12,13);
	}
	
	@Test(dependsOnMethods="startApp")
	public void loginApp() {
	
	System.out.println("Login App");
	
		
	}
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() {
		System.out.println("Logout App");
		
	} 
}
