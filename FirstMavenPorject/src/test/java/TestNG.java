import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

	
	@Test(priority=1)
	public void sum() {
		
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
		System.out.println("SUM");
	}
	@Test (priority=2)
	public void sub() {
		
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
		System.out.println("SUB");
	}
	@Test(priority=3)
	public void div() {
		
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
		System.out.println("DIV");
	}
	@Test(priority=4)
	public void multi() {
		
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
		System.out.println("MULTI");
	}
	
	
	
	
}
