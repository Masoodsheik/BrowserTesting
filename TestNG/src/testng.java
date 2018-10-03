import static org.testng.Assert.fail;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {
	
	@Test(priority=1)
	
	public void LoginTest() {
		System.out.println("LoginTest");
		//Assert.fail();
	}

	@Test(priority=2,dependsOnMethods= {"LoginTest"},alwaysRun=true)
	
	public void AddCustomerDetails() {
		System.out.println("LoginTest");
	}
	

	@Test(priority=3,enabled=false)
	
	public void LogOut() {
		
		System.out.println("LogOut");
	}
}
