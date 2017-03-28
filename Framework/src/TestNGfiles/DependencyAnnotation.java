package TestNGfiles;

import org.testng.annotations.Test;

public class DependencyAnnotation {
	@Test 
	 public void OpeningBrowser()
	{
		System.out.println("Test Case 2");
	}
	@Test(dependsOnMethods= ("OpeningBrowser"))
	 public void FlightTicketBooking()
	 {
		System.out.println("Test Case 1");
	 }
    @Test(timeOut=1)
    public void Payment()
    {
    	System.out.println("Done with your payment");
    }
}
