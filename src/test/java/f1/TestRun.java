package f1;

import org.testng.annotations.*;

import resuable.Master;

public class TestRun 
{
	Master mas ;
	
	@Test
	public void T1() throws Exception
	{
		mas = new Master() ;		
		mas.run();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearOut()
	{
		mas.dr.quit();
	}
	

}
