import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("BeforeTest");
	}
	
	@Test
	public void test1() {
		System.out.println("Test");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("AfterTest");
	}

}
