package pos.scripts;

//to open pos application
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class DemoTest extends BaseTest{

	@Test
	public void testA()
	{
		Reporter.log("testA",true);
	}
	

	
}
