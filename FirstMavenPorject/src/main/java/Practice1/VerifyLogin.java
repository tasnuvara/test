/**
 * 
 */
package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * @author dasta
 *
 */
public class VerifyLogin {

	@Test
	public void verifyValidLogin() {
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://hcpsadfs.hcps.net/adfs/ls/?SAMLRequest=fVJbT8IwFH73Vyx931rGAGlgCUKMJKgLoA%2B%2BmNKdQZOtnT2dl39vNzTiA7y153yXc752gqIqaz5r3EGv4a0BdMFnVWrkXWNKGqu5EaiQa1EBcif5Zna%2F4nHEeG2NM9KU5IRymSEQwTplNAmWiyl5BTGU43gHIRsUIkyKOA93yU6GYjwYJfn1qM%2BGjATPYNFzpsRLeCJiA0uNTmjnSyxmIbsO42TL%2BjxmvM9eSLDweygtXMc6OFcjp%2FQgaxR5gVF7iDQ42t5oiZQEs9%2FB5kZjU4HdgH1XEp7Wqz8BzA8yUt7ZNtI1FiJpKlqavdK0XZ0E2U8gN0rnSu8vZ7E7gpDfbbdZmD1utiSdtDq829Cmre051xYXT%2BgpfHJ8ygdvtFxkplTyK7g1thLu%2FBy9qNdVVB4WHZQ3GmuQqlCQ%2B1TK0nzMLQgHU%2BL9gdD0aPr%2Fy6RX3w%3D%3D&SigAlg=http%3A%2F%2Fwww.w3.org%2F2000%2F09%2Fxmldsig%23rsa-sha1&Signature=j0Q%2FbmL1vmluTyt4W6SRxK144NRhpdY%2BBEfUG4j68X9W8UzS5Ypr6jp5NgVQjgMzaep6ZgUAD2rS%2BP%2BcbtM2nwmgNgKHKZpjo%2BdTIDmnCMZlz94X6Gz45i8QiygZbvOBN3ZEhblilnZ2pGMIGTdYRuzuWxEnwv3eCjpd3OwJAseRy8HUT6Ff88VcSJEUUvbyR7Hk2G3z%2FoBGI45GgaUz5UGp6ZZ%2FRcuHjE2jiSEXu1H5LFUmR%2BSr27Sq8nxnrCe8lb73VTKxgUWLX%2BUvWa9QWWRd4nVsVE0WKhCdC3uF8%2F6Bn9cLul0Id%2Bya3XPv0QaFGM7V6D5ehDz%2BJzTT2PZAkg%3D%3D");
	
		LoginPage login=new LoginPage(driver);
		login.typeUserName();
		login.typePassword();
		login.clickOnLoginButton(); 
	
		
		driver.quit();
	}
	
	
	
}
